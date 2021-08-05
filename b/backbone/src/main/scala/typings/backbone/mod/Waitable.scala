package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Waitable extends StObject {
  
  @JSName("wait")
  var wait_FWaitable: js.UndefOr[Boolean] = js.undefined
}
object Waitable {
  
  inline def apply(): Waitable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Waitable]
  }
  
  extension [Self <: Waitable](x: Self) {
    
    inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
