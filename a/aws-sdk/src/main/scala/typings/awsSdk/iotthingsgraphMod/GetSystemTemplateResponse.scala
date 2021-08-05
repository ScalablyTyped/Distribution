package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemTemplateResponse extends StObject {
  
  /**
    * An object that contains summary data about the system.
    */
  var description: js.UndefOr[SystemTemplateDescription] = js.undefined
}
object GetSystemTemplateResponse {
  
  inline def apply(): GetSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemTemplateResponse]
  }
  
  extension [Self <: GetSystemTemplateResponse](x: Self) {
    
    inline def setDescription(value: SystemTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
