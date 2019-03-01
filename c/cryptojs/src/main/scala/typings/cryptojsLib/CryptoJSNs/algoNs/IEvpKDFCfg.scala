package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvpKDFCfg extends js.Object {
  //default 128/32
  var hasher: js.UndefOr[cryptojsLib.CryptoJSNs.libNs.Hasher] = js.undefined
  //default MD5, or SHA1 with PBKDF2
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var keySize: js.UndefOr[scala.Double] = js.undefined
}

object IEvpKDFCfg {
  @scala.inline
  def apply(
    hasher: cryptojsLib.CryptoJSNs.libNs.Hasher = null,
    iterations: scala.Int | scala.Double = null,
    keySize: scala.Int | scala.Double = null
  ): IEvpKDFCfg = {
    val __obj = js.Dynamic.literal()
    if (hasher != null) __obj.updateDynamic("hasher")(hasher)
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvpKDFCfg]
  }
}

