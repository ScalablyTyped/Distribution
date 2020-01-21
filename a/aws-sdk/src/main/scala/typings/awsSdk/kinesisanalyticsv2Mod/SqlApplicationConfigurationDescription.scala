package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfigurationDescription extends js.Object {
  /**
    * The array of InputDescription objects describing the input streams used by the application.
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.native
  /**
    * The array of OutputDescription objects describing the destination streams used by the application.
    */
  var OutputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputDescriptions] = js.native
  /**
    * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}

object SqlApplicationConfigurationDescription {
  @scala.inline
  def apply(
    InputDescriptions: InputDescriptions = null,
    OutputDescriptions: OutputDescriptions = null,
    ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions = null
  ): SqlApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (InputDescriptions != null) __obj.updateDynamic("InputDescriptions")(InputDescriptions.asInstanceOf[js.Any])
    if (OutputDescriptions != null) __obj.updateDynamic("OutputDescriptions")(OutputDescriptions.asInstanceOf[js.Any])
    if (ReferenceDataSourceDescriptions != null) __obj.updateDynamic("ReferenceDataSourceDescriptions")(ReferenceDataSourceDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlApplicationConfigurationDescription]
  }
}

