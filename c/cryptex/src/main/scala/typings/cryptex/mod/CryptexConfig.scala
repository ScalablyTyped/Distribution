package typings.cryptex.mod

import typings.cryptex.AnonDataKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptexConfig extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var keySource: String
  var keySourceOpts: js.UndefOr[AnonDataKey] = js.undefined
  var secretEncoding: js.UndefOr[String] = js.undefined
  var secrets: js.Object
}

object CryptexConfig {
  @scala.inline
  def apply(
    keySource: String,
    secrets: js.Object,
    algorithm: String = null,
    keySourceOpts: AnonDataKey = null,
    secretEncoding: String = null
  ): CryptexConfig = {
    val __obj = js.Dynamic.literal(keySource = keySource.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (keySourceOpts != null) __obj.updateDynamic("keySourceOpts")(keySourceOpts.asInstanceOf[js.Any])
    if (secretEncoding != null) __obj.updateDynamic("secretEncoding")(secretEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptexConfig]
  }
}

