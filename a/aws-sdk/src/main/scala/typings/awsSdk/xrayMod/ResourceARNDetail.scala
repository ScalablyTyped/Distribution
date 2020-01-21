package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceARNDetail extends js.Object {
  /**
    * The ARN of a corresponding resource.
    */
  var ARN: js.UndefOr[String] = js.native
}

object ResourceARNDetail {
  @scala.inline
  def apply(ARN: String = null): ResourceARNDetail = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceARNDetail]
  }
}

