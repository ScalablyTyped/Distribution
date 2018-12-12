package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/bits", JSImport.Namespace)
@js.native
object bitsMod extends js.Object {
  val default: bitwiseLib.Anon_Xnor = js.native
  def and(bits1: js.Array[bitwiseLib.typesMod.Bit], bits2: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
  def nand(bits1: js.Array[bitwiseLib.typesMod.Bit], bits2: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
  def nor(bits1: js.Array[bitwiseLib.typesMod.Bit], bits2: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
  def not(bits: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
  def or(bits1: js.Array[bitwiseLib.typesMod.Bit], bits2: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
  def reduceAnd(bits: js.Array[bitwiseLib.typesMod.Bit]): bitwiseLib.typesMod.Bit = js.native
  def reduceNand(bits: js.Array[bitwiseLib.typesMod.Bit]): bitwiseLib.typesMod.Bit = js.native
  def reduceNor(bits: js.Array[bitwiseLib.typesMod.Bit]): bitwiseLib.typesMod.Bit = js.native
  def reduceOr(bits: js.Array[bitwiseLib.typesMod.Bit]): bitwiseLib.typesMod.Bit = js.native
  def reduceXnor(bits: js.Array[bitwiseLib.typesMod.Bit]): bitwiseLib.typesMod.Bit = js.native
  def reduceXor(bits: js.Array[bitwiseLib.typesMod.Bit]): bitwiseLib.typesMod.Bit = js.native
  def toBoolean(bits: js.Array[_]): js.Array[scala.Boolean] = js.native
  def toString(bits: js.Array[_]): java.lang.String = js.native
  def toString(bits: js.Array[_], spacing: scala.Double): java.lang.String = js.native
  def toString(bits: js.Array[_], spacing: scala.Double, spacer: java.lang.String): java.lang.String = js.native
  def xnor(bits1: js.Array[bitwiseLib.typesMod.Bit], bits2: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
  def xor(bits1: js.Array[bitwiseLib.typesMod.Bit], bits2: js.Array[bitwiseLib.typesMod.Bit]): js.Array[bitwiseLib.typesMod.Bit] = js.native
}

