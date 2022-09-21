package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * The unique identifier of the application you want to update.
    */
  var applicationId: Identifier
  
  /**
    * The current version of the application to update.
    */
  var currentApplicationVersion: Version
  
  /**
    * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
    */
  var definition: js.UndefOr[Definition] = js.undefined
  
  /**
    * The description of the application to update.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(applicationId: Identifier, currentApplicationVersion: Version): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], currentApplicationVersion = currentApplicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  extension [Self <: UpdateApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersion(value: Version): Self = StObject.set(x, "currentApplicationVersion", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
