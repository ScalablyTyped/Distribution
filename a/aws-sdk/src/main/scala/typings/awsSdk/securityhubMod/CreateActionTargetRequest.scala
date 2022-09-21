package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActionTargetRequest extends StObject {
  
  /**
    * The description for the custom action target.
    */
  var Description: NonEmptyString
  
  /**
    * The ID for the custom action target. Can contain up to 20 alphanumeric characters.
    */
  var Id: NonEmptyString
  
  /**
    * The name of the custom action target. Can contain up to 20 characters.
    */
  var Name: NonEmptyString
}
object CreateActionTargetRequest {
  
  inline def apply(Description: NonEmptyString, Id: NonEmptyString, Name: NonEmptyString): CreateActionTargetRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionTargetRequest]
  }
  
  extension [Self <: CreateActionTargetRequest](x: Self) {
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
