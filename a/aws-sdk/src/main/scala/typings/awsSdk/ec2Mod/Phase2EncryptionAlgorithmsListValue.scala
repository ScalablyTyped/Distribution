package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase2EncryptionAlgorithmsListValue extends js.Object {
  /**
    * The encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase2EncryptionAlgorithmsListValue {
  @scala.inline
  def apply(Value: String = null): Phase2EncryptionAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase2EncryptionAlgorithmsListValue]
  }
}

