package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlockCipherCfg extends js.Object {
  var iv: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl] = js.undefined
  //default CBC
  var padding: js.UndefOr[cryptojsLib.CryptoJSNs.padNs.IPaddingImpl] = js.undefined
}

