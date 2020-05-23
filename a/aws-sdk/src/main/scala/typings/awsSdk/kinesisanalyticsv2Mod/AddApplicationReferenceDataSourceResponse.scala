package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationReferenceDataSourceResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * Describes reference data sources configured for the application. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}

object AddApplicationReferenceDataSourceResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
    ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions = null
  ): AddApplicationReferenceDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplicationVersionId)) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.get.asInstanceOf[js.Any])
    if (ReferenceDataSourceDescriptions != null) __obj.updateDynamic("ReferenceDataSourceDescriptions")(ReferenceDataSourceDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
  }
}

