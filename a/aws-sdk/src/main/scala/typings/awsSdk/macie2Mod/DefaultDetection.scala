package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultDetection extends js.Object {
  /**
    * The total number of occurrences of the type of data that was detected.
    */
  var count: js.UndefOr[long] = js.native
  /**
    * The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
    */
  var `type`: js.UndefOr[string] = js.native
}

object DefaultDetection {
  @scala.inline
  def apply(count: js.UndefOr[long] = js.undefined, `type`: string = null): DefaultDetection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDetection]
  }
}

