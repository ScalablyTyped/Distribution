package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Waitable extends StObject {
  
  @JSName("wait")
  var wait_FWaitable: js.UndefOr[Boolean] = js.native
}
object Waitable {
  
  @scala.inline
  def apply(): Waitable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Waitable]
  }
  
  @scala.inline
  implicit class WaitableMutableBuilder[Self <: Waitable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
