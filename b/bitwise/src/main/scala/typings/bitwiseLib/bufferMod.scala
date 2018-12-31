package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  val default: bitwiseLib.Anon_Read = js.native
  def and(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer): nodeLib.Buffer = js.native
  def and(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def create(
    bits: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify imported_bitwise/types.Bit */ _
    ]
  ): nodeLib.Buffer = js.native
  def modify(
    buffer: nodeLib.Buffer,
    bits: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify imported_bitwise/types.Bit */ _
    ]
  ): scala.Unit = js.native
  def modify(
    buffer: nodeLib.Buffer,
    bits: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify imported_bitwise/types.Bit */ _
    ],
    offset: scala.Double
  ): scala.Unit = js.native
  def nand(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer): nodeLib.Buffer = js.native
  def nand(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def nor(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer): nodeLib.Buffer = js.native
  def nor(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def not(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def or(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer): nodeLib.Buffer = js.native
  def or(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def read(buffer: nodeLib.Buffer): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify imported_bitwise/types.Bit */ _
  ] = js.native
  def read(buffer: nodeLib.Buffer, offset: scala.Double): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify imported_bitwise/types.Bit */ _
  ] = js.native
  def read(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify imported_bitwise/types.Bit */ _
  ] = js.native
  def readInt(buffer: nodeLib.Buffer): scala.Double = js.native
  def readInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
  def readInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def readUInt(buffer: nodeLib.Buffer): scala.Double = js.native
  def readUInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
  def readUInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def xnor(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer): nodeLib.Buffer = js.native
  def xnor(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def xor(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer): nodeLib.Buffer = js.native
  def xor(buffer1: nodeLib.Buffer, buffer2: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
}

