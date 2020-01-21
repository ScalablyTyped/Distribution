package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase2IntegrityAlgorithmsListValue extends js.Object {
  /**
    * The integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase2IntegrityAlgorithmsListValue {
  @scala.inline
  def apply(Value: String = null): Phase2IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase2IntegrityAlgorithmsListValue]
  }
}

