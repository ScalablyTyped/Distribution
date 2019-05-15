package typings
package cryptexLib.cryptexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptexConfig extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var keySource: java.lang.String
  var keySourceOpts: js.UndefOr[cryptexLib.Anon_DataKey] = js.undefined
  var secretEncoding: js.UndefOr[java.lang.String] = js.undefined
  var secrets: js.Object
}

object CryptexConfig {
  @scala.inline
  def apply(
    keySource: java.lang.String,
    secrets: js.Object,
    algorithm: java.lang.String = null,
    keySourceOpts: cryptexLib.Anon_DataKey = null,
    secretEncoding: java.lang.String = null
  ): CryptexConfig = {
    val __obj = js.Dynamic.literal(keySource = keySource, secrets = secrets)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (keySourceOpts != null) __obj.updateDynamic("keySourceOpts")(keySourceOpts)
    if (secretEncoding != null) __obj.updateDynamic("secretEncoding")(secretEncoding)
    __obj.asInstanceOf[CryptexConfig]
  }
}

