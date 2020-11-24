package typings.cryptoJs.x64CoreMod

import typings.cryptoJs.mod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/x64-core", "enc")
@js.native
object enc extends js.Object {
  
  /**
    * Base64 encoding strategy.
    */
  val Base64: Encoder = js.native
  
  /**
    * Hex encoding strategy.
    */
  val Hex: Encoder = js.native
  
  /**
    * Latin1 encoding strategy.
    */
  val Latin1: Encoder = js.native
  
  /**
    * UTF-16 BE encoding strategy.
    */
  val Utf16: Encoder = js.native
  
  val Utf16BE: Encoder = js.native
  
  /**
    * UTF-16 LE encoding strategy.
    */
  val Utf16LE: Encoder = js.native
  
  /**
    * UTF-8 encoding strategy.
    */
  val Utf8: Encoder = js.native
}
