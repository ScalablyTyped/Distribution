package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFeatureRequest extends StObject {
  
  /**
    * The name of the feature that you want to retrieve information for.
    */
  var feature: FeatureName
  
  /**
    * The name or ARN of the project that contains the feature.
    */
  var project: ProjectRef
}
object GetFeatureRequest {
  
  inline def apply(feature: FeatureName, project: ProjectRef): GetFeatureRequest = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeatureRequest]
  }
  
  extension [Self <: GetFeatureRequest](x: Self) {
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
