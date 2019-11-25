package typings.cryptojs.CryptoJS.algo

import typings.cryptojs.CryptoJS.lib.Hasher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvpKDFCfg extends js.Object {
  //default 128/32
  var hasher: js.UndefOr[Hasher] = js.undefined
  //default MD5, or SHA1 with PBKDF2
  var iterations: js.UndefOr[Double] = js.undefined
  var keySize: js.UndefOr[Double] = js.undefined
}

object IEvpKDFCfg {
  @scala.inline
  def apply(hasher: Hasher = null, iterations: Int | Double = null, keySize: Int | Double = null): IEvpKDFCfg = {
    val __obj = js.Dynamic.literal()
    if (hasher != null) __obj.updateDynamic("hasher")(hasher.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvpKDFCfg]
  }
}

