package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationVpcConfigurationResponse extends js.Object {
  /**
    * The ARN of the Kinesis Data Analytics application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The updated version ID of the application.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
}

object DeleteApplicationVpcConfigurationResponse {
  @scala.inline
  def apply(ApplicationARN: ResourceARN = null, ApplicationVersionId: Int | Double = null): DeleteApplicationVpcConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN.asInstanceOf[js.Any])
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVpcConfigurationResponse]
  }
}

