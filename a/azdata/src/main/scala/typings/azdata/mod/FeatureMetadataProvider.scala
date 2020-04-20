package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureMetadataProvider extends js.Object {
  var enabled: Boolean
  var featureName: String
  var optionsMetadata: js.Array[ServiceOption]
}

object FeatureMetadataProvider {
  @scala.inline
  def apply(enabled: Boolean, featureName: String, optionsMetadata: js.Array[ServiceOption]): FeatureMetadataProvider = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], optionsMetadata = optionsMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureMetadataProvider]
  }
}

