package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ComponentDatatype")
@js.native
object ComponentDatatypeNs extends js.Object {
  def createArrayBufferView(componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype, buffer: stdLib.ArrayBuffer): stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype,
    buffer: stdLib.ArrayBuffer,
    byteOffset: scala.Double
  ): stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype,
    buffer: stdLib.ArrayBuffer,
    byteOffset: scala.Double,
    length: scala.Double
  ): stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array = js.native
  def createTypedArray(componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype, valuesOrLength: js.Array[_]): stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array = js.native
  def createTypedArray(componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype, valuesOrLength: scala.Double): stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array = js.native
  def fromTypedArray(array: stdLib.Float32Array): cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  def fromTypedArray(array: stdLib.Float64Array): cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  def fromTypedArray(array: stdLib.Int16Array): cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  def fromTypedArray(array: stdLib.Int8Array): cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  def fromTypedArray(array: stdLib.Uint16Array): cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  def fromTypedArray(array: stdLib.Uint8Array): cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  def getSizeInBytes(componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype): scala.Double = js.native
  def validate(componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype): scala.Boolean = js.native
}

