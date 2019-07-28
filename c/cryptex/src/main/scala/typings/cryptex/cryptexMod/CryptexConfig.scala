package typings.cryptex.cryptexMod

import typings.cryptex.Anon_DataKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptexConfig extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var keySource: String
  var keySourceOpts: js.UndefOr[Anon_DataKey] = js.undefined
  var secretEncoding: js.UndefOr[String] = js.undefined
  var secrets: js.Object
}

object CryptexConfig {
  @scala.inline
  def apply(
    keySource: String,
    secrets: js.Object,
    algorithm: String = null,
    keySourceOpts: Anon_DataKey = null,
    secretEncoding: String = null
  ): CryptexConfig = {
    val __obj = js.Dynamic.literal(keySource = keySource, secrets = secrets)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (keySourceOpts != null) __obj.updateDynamic("keySourceOpts")(keySourceOpts)
    if (secretEncoding != null) __obj.updateDynamic("secretEncoding")(secretEncoding)
    __obj.asInstanceOf[CryptexConfig]
  }
}

