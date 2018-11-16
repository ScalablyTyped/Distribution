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

