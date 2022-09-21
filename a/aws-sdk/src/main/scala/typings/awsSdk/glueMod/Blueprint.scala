package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blueprint extends StObject {
  
  /**
    * Specifies the path in Amazon S3 where the blueprint is published.
    */
  var BlueprintLocation: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Specifies a path in Amazon S3 where the blueprint is copied when you call CreateBlueprint/UpdateBlueprint to register the blueprint in Glue.
    */
  var BlueprintServiceLocation: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The date and time the blueprint was registered.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the blueprint.
    */
  var Description: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * An error message.
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.undefined
  
  /**
    * When there are multiple versions of a blueprint and the latest version has some errors, this attribute indicates the last successful blueprint definition that is available with the service.
    */
  var LastActiveDefinition: js.UndefOr[typings.awsSdk.glueMod.LastActiveDefinition] = js.undefined
  
  /**
    * The date and time the blueprint was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the blueprint.
    */
  var Name: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * A JSON string that indicates the list of parameter specifications for the blueprint.
    */
  var ParameterSpec: js.UndefOr[BlueprintParameterSpec] = js.undefined
  
  /**
    * The status of the blueprint registration.   Creating — The blueprint registration is in progress.   Active — The blueprint has been successfully registered.   Updating — An update to the blueprint registration is in progress.   Failed — The blueprint registration failed.  
    */
  var Status: js.UndefOr[BlueprintStatus] = js.undefined
}
object Blueprint {
  
  inline def apply(): Blueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blueprint]
  }
  
  extension [Self <: Blueprint](x: Self) {
    
    inline def setBlueprintLocation(value: GenericString): Self = StObject.set(x, "BlueprintLocation", value.asInstanceOf[js.Any])
    
    inline def setBlueprintLocationUndefined: Self = StObject.set(x, "BlueprintLocation", js.undefined)
    
    inline def setBlueprintServiceLocation(value: GenericString): Self = StObject.set(x, "BlueprintServiceLocation", value.asInstanceOf[js.Any])
    
    inline def setBlueprintServiceLocationUndefined: Self = StObject.set(x, "BlueprintServiceLocation", js.undefined)
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "CreatedOn", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnUndefined: Self = StObject.set(x, "CreatedOn", js.undefined)
    
    inline def setDescription(value: Generic512CharString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastActiveDefinition(value: LastActiveDefinition): Self = StObject.set(x, "LastActiveDefinition", value.asInstanceOf[js.Any])
    
    inline def setLastActiveDefinitionUndefined: Self = StObject.set(x, "LastActiveDefinition", js.undefined)
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setName(value: OrchestrationNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParameterSpec(value: BlueprintParameterSpec): Self = StObject.set(x, "ParameterSpec", value.asInstanceOf[js.Any])
    
    inline def setParameterSpecUndefined: Self = StObject.set(x, "ParameterSpec", js.undefined)
    
    inline def setStatus(value: BlueprintStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
