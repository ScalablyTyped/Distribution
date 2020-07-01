package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutClassificationExportConfigurationRequest extends js.Object {
  /**
    * The location to store data classification results in, and the encryption settings to use when storing results in that location.
    */
  var configuration: ClassificationExportConfiguration = js.native
}

object PutClassificationExportConfigurationRequest {
  @scala.inline
  def apply(configuration: ClassificationExportConfiguration): PutClassificationExportConfigurationRequest = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClassificationExportConfigurationRequest]
  }
}

