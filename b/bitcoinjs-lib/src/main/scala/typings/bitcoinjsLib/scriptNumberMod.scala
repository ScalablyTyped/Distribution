package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptNumberMod {
  
  @JSImport("bitcoinjs-lib/types/script_number", "decode")
  @js.native
  def decode(buffer: Buffer): Double = js.native
  @JSImport("bitcoinjs-lib/types/script_number", "decode")
  @js.native
  def decode(buffer: Buffer, maxLength: js.UndefOr[scala.Nothing], minimal: Boolean): Double = js.native
  @JSImport("bitcoinjs-lib/types/script_number", "decode")
  @js.native
  def decode(buffer: Buffer, maxLength: Double): Double = js.native
  @JSImport("bitcoinjs-lib/types/script_number", "decode")
  @js.native
  def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
  
  @JSImport("bitcoinjs-lib/types/script_number", "encode")
  @js.native
  def encode(_number: Double): Buffer = js.native
}
