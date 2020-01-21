package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordOutput extends js.Object {
  /**
    * The description of the output.
    */
  var Description: js.UndefOr[typings.awsSdk.servicecatalogMod.Description] = js.native
  /**
    * The output key.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputKey] = js.native
  /**
    * The output value.
    */
  var OutputValue: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputValue] = js.native
}

object RecordOutput {
  @scala.inline
  def apply(Description: Description = null, OutputKey: OutputKey = null, OutputValue: OutputValue = null): RecordOutput = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (OutputKey != null) __obj.updateDynamic("OutputKey")(OutputKey.asInstanceOf[js.Any])
    if (OutputValue != null) __obj.updateDynamic("OutputValue")(OutputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordOutput]
  }
}

