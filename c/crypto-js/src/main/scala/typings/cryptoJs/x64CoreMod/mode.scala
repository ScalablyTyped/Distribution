package typings.cryptoJs.x64CoreMod

import typings.cryptoJs.mod.BlockCipherMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/x64-core", "mode")
@js.native
object mode extends js.Object {
  
  /**
    * Cipher Block Chaining mode.
    */
  val CBC: BlockCipherMode = js.native
  
  /**
    * Cipher Feedback block mode.
    */
  val CFB: BlockCipherMode = js.native
  
  /**
    * Counter block mode.
    */
  val CTR: BlockCipherMode = js.native
  
  /**
    * @preserve
    * Counter block mode compatible with  Dr Brian Gladman fileenc.c
    * derived from CryptoJS.mode.CTR
    * Jan Hruby jhruby.web@gmail.com
    */
  val CTRGladman: BlockCipherMode = js.native
  
  /**
    * Electronic Codebook block mode.
    */
  val ECB: BlockCipherMode = js.native
  
  /**
    * Output Feedback block mode.
    */
  val OFB: BlockCipherMode = js.native
}
