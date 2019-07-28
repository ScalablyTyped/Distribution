package typings.cesium.cesiumMod

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ComponentDatatype")
@js.native
object ComponentDatatypeNs extends js.Object {
  def createArrayBufferView(componentDatatype: ComponentDatatype, buffer: ArrayBuffer): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createArrayBufferView(componentDatatype: ComponentDatatype, buffer: ArrayBuffer, byteOffset: Double): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createArrayBufferView(componentDatatype: ComponentDatatype, buffer: ArrayBuffer, byteOffset: Double, length: Double): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createTypedArray(componentDatatype: ComponentDatatype, valuesOrLength: js.Array[_]): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createTypedArray(componentDatatype: ComponentDatatype, valuesOrLength: Double): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def fromTypedArray(array: Float32Array): ComponentDatatype = js.native
  def fromTypedArray(array: Float64Array): ComponentDatatype = js.native
  def fromTypedArray(array: Int16Array): ComponentDatatype = js.native
  def fromTypedArray(array: Int8Array): ComponentDatatype = js.native
  def fromTypedArray(array: Uint16Array): ComponentDatatype = js.native
  def fromTypedArray(array: Uint8Array): ComponentDatatype = js.native
  def getSizeInBytes(componentDatatype: ComponentDatatype): Double = js.native
  def validate(componentDatatype: ComponentDatatype): Boolean = js.native
}

