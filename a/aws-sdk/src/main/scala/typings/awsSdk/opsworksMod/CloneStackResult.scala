package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneStackResult extends StObject {
  
  /**
    * The cloned stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}
object CloneStackResult {
  
  @scala.inline
  def apply(): CloneStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneStackResult]
  }
  
  @scala.inline
  implicit class CloneStackResultMutableBuilder[Self <: CloneStackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
