package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfigurationUpdate extends js.Object {
  /**
    * The array of InputUpdate objects describing the new input streams used by the application.
    */
  var InputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputUpdates] = js.native
  /**
    * The array of OutputUpdate objects describing the new destination streams used by the application.
    */
  var OutputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputUpdates] = js.native
  /**
    * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdates] = js.native
}

object SqlApplicationConfigurationUpdate {
  @scala.inline
  def apply(
    InputUpdates: InputUpdates = null,
    OutputUpdates: OutputUpdates = null,
    ReferenceDataSourceUpdates: ReferenceDataSourceUpdates = null
  ): SqlApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (InputUpdates != null) __obj.updateDynamic("InputUpdates")(InputUpdates.asInstanceOf[js.Any])
    if (OutputUpdates != null) __obj.updateDynamic("OutputUpdates")(OutputUpdates.asInstanceOf[js.Any])
    if (ReferenceDataSourceUpdates != null) __obj.updateDynamic("ReferenceDataSourceUpdates")(ReferenceDataSourceUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
  }
}

