package typings.bitwise

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/bits/to-string", JSImport.Namespace)
@js.native
object bitsToDashStringMod extends js.Object {
  def default(bits: js.Array[Bit]): String = js.native
  def default(bits: js.Array[Bit], spacing: Double): String = js.native
  def default(bits: js.Array[Bit], spacing: Double, spacer: String): String = js.native
}

