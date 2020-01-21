package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * User defined description associated with the output.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The name of the export associated with the output.
    */
  var ExportName: js.UndefOr[typings.awsSdk.cloudformationMod.ExportName] = js.native
  /**
    * The key associated with the output.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.cloudformationMod.OutputKey] = js.native
  /**
    * The value associated with the output.
    */
  var OutputValue: js.UndefOr[typings.awsSdk.cloudformationMod.OutputValue] = js.native
}

object Output {
  @scala.inline
  def apply(
    Description: Description = null,
    ExportName: ExportName = null,
    OutputKey: OutputKey = null,
    OutputValue: OutputValue = null
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExportName != null) __obj.updateDynamic("ExportName")(ExportName.asInstanceOf[js.Any])
    if (OutputKey != null) __obj.updateDynamic("OutputKey")(OutputKey.asInstanceOf[js.Any])
    if (OutputValue != null) __obj.updateDynamic("OutputValue")(OutputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

