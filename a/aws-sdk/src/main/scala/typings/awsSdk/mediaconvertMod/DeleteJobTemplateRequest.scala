package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobTemplateRequest extends StObject {
  
  /**
    * The name of the job template to be deleted.
    */
  var Name: string
}
object DeleteJobTemplateRequest {
  
  inline def apply(Name: string): DeleteJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTemplateRequest]
  }
  
  extension [Self <: DeleteJobTemplateRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
