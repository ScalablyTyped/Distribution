package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfiguration extends js.Object {
  /**
    * The array of Input objects describing the input streams used by the application.
    */
  var Inputs: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Inputs] = js.native
  /**
    * The array of Output objects describing the destination streams used by the application.
    */
  var Outputs: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Outputs] = js.native
  /**
    * The array of ReferenceDataSource objects describing the reference data sources used by the application.
    */
  var ReferenceDataSources: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSources] = js.native
}

object SqlApplicationConfiguration {
  @scala.inline
  def apply(Inputs: Inputs = null, Outputs: Outputs = null, ReferenceDataSources: ReferenceDataSources = null): SqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (ReferenceDataSources != null) __obj.updateDynamic("ReferenceDataSources")(ReferenceDataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlApplicationConfiguration]
  }
}

