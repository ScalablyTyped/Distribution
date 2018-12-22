package typings
package blLib.blMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferList
  extends nodeLib.streamMod.Duplex {
  var length: scala.Double = js.native
  def append(buffer: BufferList): scala.Unit = js.native
  def append(buffer: java.lang.String): scala.Unit = js.native
  def append(buffer: js.Array[nodeLib.Buffer | BufferList]): scala.Unit = js.native
  def append(buffer: nodeLib.Buffer): scala.Unit = js.native
  def consume(): scala.Unit = js.native
  def consume(bytes: scala.Double): scala.Unit = js.native
  def copy(dest: nodeLib.Buffer): scala.Unit = js.native
  def copy(dest: nodeLib.Buffer, destStart: scala.Double): scala.Unit = js.native
  def copy(dest: nodeLib.Buffer, destStart: scala.Double, srcStart: scala.Double): scala.Unit = js.native
  def copy(dest: nodeLib.Buffer, destStart: scala.Double, srcStart: scala.Double, srcEnd: scala.Double): scala.Unit = js.native
  def duplicate(): BufferList = js.native
  def get(index: scala.Double): scala.Double = js.native
  def indexOf(value: BufferList): scala.Double = js.native
  def indexOf(value: BufferList, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: BufferList, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: java.lang.String): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: nodeLib.Buffer): scala.Double = js.native
  def indexOf(value: nodeLib.Buffer, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: nodeLib.Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: scala.Double): scala.Double = js.native
  def indexOf(value: scala.Double, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: stdLib.Uint8Array): scala.Double = js.native
  def indexOf(value: stdLib.Uint8Array, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: stdLib.Uint8Array, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  def readDoubleBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  def readDoubleLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  def readFloatBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  def readFloatLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  def readInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  def readInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  def readInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  def readInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  def readInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  def readUInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  def readUInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  def readUInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  def readUInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  def readUInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def shallowSlice(): BufferList = js.native
  def shallowSlice(start: scala.Double): BufferList = js.native
  def shallowSlice(start: scala.Double, end: scala.Double): BufferList = js.native
  def slice(): nodeLib.Buffer = js.native
  def slice(start: scala.Double): nodeLib.Buffer = js.native
  def slice(start: scala.Double, end: scala.Double): nodeLib.Buffer = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
}

