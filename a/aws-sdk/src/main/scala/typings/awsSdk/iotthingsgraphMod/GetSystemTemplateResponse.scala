package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemTemplateResponse extends StObject {
  
  /**
    * An object that contains summary data about the system.
    */
  var description: js.UndefOr[SystemTemplateDescription] = js.native
}
object GetSystemTemplateResponse {
  
  @scala.inline
  def apply(): GetSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemTemplateResponse]
  }
  
  @scala.inline
  implicit class GetSystemTemplateResponseMutableBuilder[Self <: GetSystemTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SystemTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
