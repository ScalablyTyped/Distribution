package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/script_number", JSImport.Namespace)
@js.native
object scriptNumberMod extends js.Object {
  def decode(buffer: Buffer): Double = js.native
  def decode(buffer: Buffer, maxLength: js.UndefOr[scala.Nothing], minimal: Boolean): Double = js.native
  def decode(buffer: Buffer, maxLength: Double): Double = js.native
  def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
  def encode(_number: Double): Buffer = js.native
}

