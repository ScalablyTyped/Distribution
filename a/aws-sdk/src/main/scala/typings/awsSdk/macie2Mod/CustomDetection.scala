package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDetection extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The total number of occurrences of the data that the custom data identifier detected for the finding.
    */
  var count: js.UndefOr[long] = js.native
  /**
    * The name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.native
}

object CustomDetection {
  @scala.inline
  def apply(arn: string = null, count: js.UndefOr[long] = js.undefined, name: string = null): CustomDetection = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDetection]
  }
}

