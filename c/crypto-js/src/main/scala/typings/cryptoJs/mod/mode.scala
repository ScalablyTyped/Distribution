package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mode {
  
  /**
    * Cipher Block Chaining mode.
    */
  @JSImport("crypto-js", "mode.CBC")
  @js.native
  val CBC: BlockCipherMode = js.native
  
  /**
    * Cipher Feedback block mode.
    */
  @JSImport("crypto-js", "mode.CFB")
  @js.native
  val CFB: BlockCipherMode = js.native
  
  /**
    * Counter block mode.
    */
  @JSImport("crypto-js", "mode.CTR")
  @js.native
  val CTR: BlockCipherMode = js.native
  
  /**
    * @preserve
    * Counter block mode compatible with  Dr Brian Gladman fileenc.c
    * derived from CryptoJS.mode.CTR
    * Jan Hruby jhruby.web@gmail.com
    */
  @JSImport("crypto-js", "mode.CTRGladman")
  @js.native
  val CTRGladman: BlockCipherMode = js.native
  
  /**
    * Electronic Codebook block mode.
    */
  @JSImport("crypto-js", "mode.ECB")
  @js.native
  val ECB: BlockCipherMode = js.native
  
  /**
    * Output Feedback block mode.
    */
  @JSImport("crypto-js", "mode.OFB")
  @js.native
  val OFB: BlockCipherMode = js.native
}
