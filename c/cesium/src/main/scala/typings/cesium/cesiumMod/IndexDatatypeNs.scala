package typings.cesium.cesiumMod

import typings.std.ArrayBuffer
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatypeNs extends js.Object {
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): Uint16Array | Uint32Array = js.native
  def createTypedArrayFromArrayBuffer(numberOfVertices: Double, sourceArray: ArrayBuffer, byteOffset: Double, length: Double): Uint16Array | Uint32Array = js.native
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
}

