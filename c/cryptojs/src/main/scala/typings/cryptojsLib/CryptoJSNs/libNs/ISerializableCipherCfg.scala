package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISerializableCipherCfg extends js.Object {
  var format: js.UndefOr[cryptojsLib.CryptoJSNs.formatNs.IFormatter] = js.undefined
  //default OpenSSLFormatter
  var iv: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl] = js.undefined
  var padding: js.UndefOr[cryptojsLib.CryptoJSNs.padNs.IPaddingImpl] = js.undefined
}

