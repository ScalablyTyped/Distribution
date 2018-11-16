package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatypeNs extends js.Object {
  def createTypedArray(numberOfVertices: scala.Double, indicesLengthOrArray: js.Any): stdLib.Uint16Array | stdLib.Uint32Array = js.native
  def createTypedArrayFromArrayBuffer(
    numberOfVertices: scala.Double,
    sourceArray: stdLib.ArrayBuffer,
    byteOffset: scala.Double,
    length: scala.Double
  ): stdLib.Uint16Array | stdLib.Uint32Array = js.native
  def getSizeInBytes(indexDatatype: cesiumLib.cesiumMod.CesiumNs.IndexDatatype): scala.Double = js.native
  def validate(indexDatatype: cesiumLib.cesiumMod.CesiumNs.IndexDatatype): scala.Boolean = js.native
}

