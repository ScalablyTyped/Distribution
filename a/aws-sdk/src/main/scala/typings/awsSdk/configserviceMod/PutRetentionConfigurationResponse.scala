package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionConfigurationResponse extends js.Object {
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfiguration: js.UndefOr[typings.awsSdk.configserviceMod.RetentionConfiguration] = js.native
}

object PutRetentionConfigurationResponse {
  @scala.inline
  def apply(RetentionConfiguration: RetentionConfiguration = null): PutRetentionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (RetentionConfiguration != null) __obj.updateDynamic("RetentionConfiguration")(RetentionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionConfigurationResponse]
  }
}

