package typings
package blake2sDashJsLib.blake2sDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BLAKE2sConfig extends js.Object {
  var key: js.UndefOr[ByteArray] = js.undefined
  var personalization: js.UndefOr[ByteArray] = js.undefined
  var salt: js.UndefOr[ByteArray] = js.undefined
}

object BLAKE2sConfig {
  @scala.inline
  def apply(key: ByteArray = null, personalization: ByteArray = null, salt: ByteArray = null): BLAKE2sConfig = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (personalization != null) __obj.updateDynamic("personalization")(personalization.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLAKE2sConfig]
  }
}

