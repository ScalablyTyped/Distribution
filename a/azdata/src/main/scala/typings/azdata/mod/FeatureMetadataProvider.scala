package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureMetadataProvider extends StObject {
  
  var enabled: Boolean
  
  var featureName: String
  
  var optionsMetadata: js.Array[ServiceOption]
}
object FeatureMetadataProvider {
  
  inline def apply(enabled: Boolean, featureName: String, optionsMetadata: js.Array[ServiceOption]): FeatureMetadataProvider = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], optionsMetadata = optionsMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureMetadataProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureMetadataProvider] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    inline def setOptionsMetadata(value: js.Array[ServiceOption]): Self = StObject.set(x, "optionsMetadata", value.asInstanceOf[js.Any])
    
    inline def setOptionsMetadataVarargs(value: ServiceOption*): Self = StObject.set(x, "optionsMetadata", js.Array(value*))
  }
}
