package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupField extends js.Object {
  /**
    * The name of a log field.
    */
  var name: js.UndefOr[Field] = js.native
  /**
    * The percentage of log events queried that contained the field.
    */
  var percent: js.UndefOr[Percentage] = js.native
}

object LogGroupField {
  @scala.inline
  def apply(name: Field = null, percent: js.UndefOr[Percentage] = js.undefined): LogGroupField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroupField]
  }
}

