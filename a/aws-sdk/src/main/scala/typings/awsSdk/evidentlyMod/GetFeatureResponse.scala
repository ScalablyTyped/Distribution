package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFeatureResponse extends StObject {
  
  /**
    * A structure containing the configuration details of the feature.
    */
  var feature: Feature
}
object GetFeatureResponse {
  
  inline def apply(feature: Feature): GetFeatureResponse = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeatureResponse]
  }
  
  extension [Self <: GetFeatureResponse](x: Self) {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
