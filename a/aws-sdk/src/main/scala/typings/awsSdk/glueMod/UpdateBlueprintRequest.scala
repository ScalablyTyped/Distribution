package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBlueprintRequest extends StObject {
  
  /**
    * Specifies a path in Amazon S3 where the blueprint is published.
    */
  var BlueprintLocation: OrchestrationS3Location
  
  /**
    * A description of the blueprint.
    */
  var Description: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * The name of the blueprint.
    */
  var Name: OrchestrationNameString
}
object UpdateBlueprintRequest {
  
  inline def apply(BlueprintLocation: OrchestrationS3Location, Name: OrchestrationNameString): UpdateBlueprintRequest = {
    val __obj = js.Dynamic.literal(BlueprintLocation = BlueprintLocation.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBlueprintRequest]
  }
  
  extension [Self <: UpdateBlueprintRequest](x: Self) {
    
    inline def setBlueprintLocation(value: OrchestrationS3Location): Self = StObject.set(x, "BlueprintLocation", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Generic512CharString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: OrchestrationNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
