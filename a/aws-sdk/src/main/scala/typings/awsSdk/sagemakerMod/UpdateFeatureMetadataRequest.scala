package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeatureMetadataRequest extends StObject {
  
  /**
    * A description that you can write to better describe the feature.
    */
  var Description: js.UndefOr[FeatureDescription] = js.undefined
  
  /**
    * The name of the feature group containing the feature that you're updating.
    */
  var FeatureGroupName: typings.awsSdk.sagemakerMod.FeatureGroupName
  
  /**
    * The name of the feature that you're updating.
    */
  var FeatureName: typings.awsSdk.sagemakerMod.FeatureName
  
  /**
    * A list of key-value pairs that you can add to better describe the feature.
    */
  var ParameterAdditions: js.UndefOr[FeatureParameterAdditions] = js.undefined
  
  /**
    * A list of parameter keys that you can specify to remove parameters that describe your feature.
    */
  var ParameterRemovals: js.UndefOr[FeatureParameterRemovals] = js.undefined
}
object UpdateFeatureMetadataRequest {
  
  inline def apply(FeatureGroupName: FeatureGroupName, FeatureName: FeatureName): UpdateFeatureMetadataRequest = {
    val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFeatureMetadataRequest]
  }
  
  extension [Self <: UpdateFeatureMetadataRequest](x: Self) {
    
    inline def setDescription(value: FeatureDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureName(value: FeatureName): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setParameterAdditions(value: FeatureParameterAdditions): Self = StObject.set(x, "ParameterAdditions", value.asInstanceOf[js.Any])
    
    inline def setParameterAdditionsUndefined: Self = StObject.set(x, "ParameterAdditions", js.undefined)
    
    inline def setParameterAdditionsVarargs(value: FeatureParameter*): Self = StObject.set(x, "ParameterAdditions", js.Array(value*))
    
    inline def setParameterRemovals(value: FeatureParameterRemovals): Self = StObject.set(x, "ParameterRemovals", value.asInstanceOf[js.Any])
    
    inline def setParameterRemovalsUndefined: Self = StObject.set(x, "ParameterRemovals", js.undefined)
    
    inline def setParameterRemovalsVarargs(value: FeatureParameterKey*): Self = StObject.set(x, "ParameterRemovals", js.Array(value*))
  }
}
