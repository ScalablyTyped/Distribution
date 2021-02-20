package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemInstanceResponse extends StObject {
  
  /**
    * An object that describes the system instance.
    */
  var description: js.UndefOr[SystemInstanceDescription] = js.native
}
object GetSystemInstanceResponse {
  
  @scala.inline
  def apply(): GetSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInstanceResponse]
  }
  
  @scala.inline
  implicit class GetSystemInstanceResponseMutableBuilder[Self <: GetSystemInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SystemInstanceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
