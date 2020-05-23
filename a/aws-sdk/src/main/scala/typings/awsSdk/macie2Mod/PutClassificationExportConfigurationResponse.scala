package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutClassificationExportConfigurationResponse extends js.Object {
  /**
    * The location that data classification results are exported to, and the encryption settings that are used when storing results in that location.
    */
  var configuration: js.UndefOr[ClassificationExportConfiguration] = js.native
}

object PutClassificationExportConfigurationResponse {
  @scala.inline
  def apply(configuration: ClassificationExportConfiguration = null): PutClassificationExportConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClassificationExportConfigurationResponse]
  }
}

