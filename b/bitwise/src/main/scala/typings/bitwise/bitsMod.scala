package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/bits", JSImport.Namespace)
@js.native
object bitsMod extends js.Object {
  def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  def not(bits: js.Array[Bit]): js.Array[Bit] = js.native
  def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  def reduceAnd(bits: js.Array[Bit]): Bit = js.native
  def reduceNand(bits: js.Array[Bit]): Bit = js.native
  def reduceNor(bits: js.Array[Bit]): Bit = js.native
  def reduceOr(bits: js.Array[Bit]): Bit = js.native
  def reduceXnor(bits: js.Array[Bit]): Bit = js.native
  def reduceXor(bits: js.Array[Bit]): Bit = js.native
  def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = js.native
  def toString(bits: js.Array[Bit]): String = js.native
  def toString(bits: js.Array[Bit], spacing: js.UndefOr[scala.Nothing], spacer: String): String = js.native
  def toString(bits: js.Array[Bit], spacing: Double): String = js.native
  def toString(bits: js.Array[Bit], spacing: Double, spacer: String): String = js.native
  def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  @js.native
  object default extends js.Object {
    def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def not(bits: js.Array[Bit]): js.Array[Bit] = js.native
    def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def reduceAnd(bits: js.Array[Bit]): Bit = js.native
    def reduceNand(bits: js.Array[Bit]): Bit = js.native
    def reduceNor(bits: js.Array[Bit]): Bit = js.native
    def reduceOr(bits: js.Array[Bit]): Bit = js.native
    def reduceXnor(bits: js.Array[Bit]): Bit = js.native
    def reduceXor(bits: js.Array[Bit]): Bit = js.native
    def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = js.native
    def toString(bits: js.Array[Bit]): String = js.native
    def toString(bits: js.Array[Bit], spacing: js.UndefOr[scala.Nothing], spacer: String): String = js.native
    def toString(bits: js.Array[Bit], spacing: Double): String = js.native
    def toString(bits: js.Array[Bit], spacing: Double, spacer: String): String = js.native
    def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  }
  
}

