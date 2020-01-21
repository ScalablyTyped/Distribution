package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingParameters extends js.Object {
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var CSVMappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CSVMappingParameters] = js.native
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var JSONMappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.JSONMappingParameters] = js.native
}

object MappingParameters {
  @scala.inline
  def apply(
    CSVMappingParameters: CSVMappingParameters = null,
    JSONMappingParameters: JSONMappingParameters = null
  ): MappingParameters = {
    val __obj = js.Dynamic.literal()
    if (CSVMappingParameters != null) __obj.updateDynamic("CSVMappingParameters")(CSVMappingParameters.asInstanceOf[js.Any])
    if (JSONMappingParameters != null) __obj.updateDynamic("JSONMappingParameters")(JSONMappingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingParameters]
  }
}

