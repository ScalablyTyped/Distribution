package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureMetadataProvider extends StObject {
  
  var enabled: Boolean = js.native
  
  var featureName: String = js.native
  
  var optionsMetadata: js.Array[ServiceOption] = js.native
}
object FeatureMetadataProvider {
  
  @scala.inline
  def apply(enabled: Boolean, featureName: String, optionsMetadata: js.Array[ServiceOption]): FeatureMetadataProvider = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], optionsMetadata = optionsMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureMetadataProvider]
  }
  
  @scala.inline
  implicit class FeatureMetadataProviderMutableBuilder[Self <: FeatureMetadataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsMetadata(value: js.Array[ServiceOption]): Self = StObject.set(x, "optionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsMetadataVarargs(value: ServiceOption*): Self = StObject.set(x, "optionsMetadata", js.Array(value :_*))
  }
}
