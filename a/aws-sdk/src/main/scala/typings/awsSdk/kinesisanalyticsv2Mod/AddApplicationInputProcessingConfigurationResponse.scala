package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationInputProcessingConfigurationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data Analytics assigns to each input configuration that you add to your application.
    */
  var InputId: js.UndefOr[Id] = js.native
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run.
    */
  var InputProcessingConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfigurationDescription] = js.native
}

object AddApplicationInputProcessingConfigurationResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
    InputId: Id = null,
    InputProcessingConfigurationDescription: InputProcessingConfigurationDescription = null
  ): AddApplicationInputProcessingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplicationVersionId)) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.get.asInstanceOf[js.Any])
    if (InputId != null) __obj.updateDynamic("InputId")(InputId.asInstanceOf[js.Any])
    if (InputProcessingConfigurationDescription != null) __obj.updateDynamic("InputProcessingConfigurationDescription")(InputProcessingConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
  }
}

