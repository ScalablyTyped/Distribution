package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSMSAttributesInput extends js.Object {
  /**
    * A list of the individual attribute names, such as MonthlySpendLimit, for which you want values. For all attribute names, see SetSMSAttributes. If you don't use this parameter, Amazon SNS returns all SMS attributes.
    */
  var attributes: js.UndefOr[ListString] = js.native
}

object GetSMSAttributesInput {
  @scala.inline
  def apply(attributes: ListString = null): GetSMSAttributesInput = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSMSAttributesInput]
  }
}

