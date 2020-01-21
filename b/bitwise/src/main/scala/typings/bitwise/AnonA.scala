package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonA extends js.Object {
  def and(a: Buffer, b: Buffer): Buffer = js.native
  def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  def create(bits: js.Array[Bit]): Buffer = js.native
  def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
  def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
  def nand(a: Buffer, b: Buffer): Buffer = js.native
  def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  def nor(a: Buffer, b: Buffer): Buffer = js.native
  def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  def not(buffer: Buffer): Buffer = js.native
  def or(a: Buffer, b: Buffer): Buffer = js.native
  def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  def read(buffer: Buffer): js.Array[Bit] = js.native
  def read(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
  def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
  def readInt(buffer: Buffer): Double = js.native
  def readInt(buffer: Buffer, offset: Double): Double = js.native
  def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
  def readUInt(buffer: Buffer): Double = js.native
  def readUInt(buffer: Buffer, offset: Double): Double = js.native
  def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
  def xnor(a: Buffer, b: Buffer): Buffer = js.native
  def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  def xor(a: Buffer, b: Buffer): Buffer = js.native
  def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
}

