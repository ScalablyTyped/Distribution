package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase1EncryptionAlgorithmsListValue extends js.Object {
  /**
    * The value for the encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase1EncryptionAlgorithmsListValue {
  @scala.inline
  def apply(Value: String = null): Phase1EncryptionAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase1EncryptionAlgorithmsListValue]
  }
}

