package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateRequest extends StObject {
  
  /**
    * The name of the template you want to retrieve.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName
}
object GetTemplateRequest {
  
  inline def apply(TemplateName: TemplateName): GetTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateRequest]
  }
  
  extension [Self <: GetTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
