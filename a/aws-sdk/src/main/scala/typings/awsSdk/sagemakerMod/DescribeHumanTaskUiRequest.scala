package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanTaskUiRequest extends js.Object {
  /**
    * The name of the human task user interface you want information about.
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName = js.native
}

object DescribeHumanTaskUiRequest {
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName): DescribeHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiRequest]
  }
}

