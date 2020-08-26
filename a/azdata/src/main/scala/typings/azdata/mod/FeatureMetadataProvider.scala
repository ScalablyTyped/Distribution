package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureMetadataProvider extends js.Object {
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
  implicit class FeatureMetadataProviderOps[Self <: FeatureMetadataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatureName(value: String): Self = this.set("featureName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsMetadataVarargs(value: ServiceOption*): Self = this.set("optionsMetadata", js.Array(value :_*))
    @scala.inline
    def setOptionsMetadata(value: js.Array[ServiceOption]): Self = this.set("optionsMetadata", value.asInstanceOf[js.Any])
  }
  
}

