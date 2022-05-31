package typings.cesium.global.Cesium

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ComponentDatatype")
@js.native
object ComponentDatatype extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.cesium.mod.ComponentDatatype & Double] = js.native
  
  /* 0 */ val BYTE: typings.cesium.mod.ComponentDatatype.BYTE & Double = js.native
  
  /* 5 */ val DOUBLE: typings.cesium.mod.ComponentDatatype.DOUBLE & Double = js.native
  
  /* 4 */ val FLOAT: typings.cesium.mod.ComponentDatatype.FLOAT & Double = js.native
  
  /* 2 */ val SHORT: typings.cesium.mod.ComponentDatatype.SHORT & Double = js.native
  
  /* 1 */ val UNSIGNED_BYTE: typings.cesium.mod.ComponentDatatype.UNSIGNED_BYTE & Double = js.native
  
  /* 3 */ val UNSIGNED_SHORT: typings.cesium.mod.ComponentDatatype.UNSIGNED_SHORT & Double = js.native
  
  def createArrayBufferView(componentDatatype: typings.cesium.mod.ComponentDatatype, buffer: ArrayBuffer): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createArrayBufferView(componentDatatype: typings.cesium.mod.ComponentDatatype, buffer: ArrayBuffer, byteOffset: Double): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: typings.cesium.mod.ComponentDatatype,
    buffer: ArrayBuffer,
    byteOffset: Double,
    length: Double
  ): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: typings.cesium.mod.ComponentDatatype,
    buffer: ArrayBuffer,
    byteOffset: Unit,
    length: Double
  ): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  
  def createTypedArray(componentDatatype: typings.cesium.mod.ComponentDatatype, valuesOrLength: js.Array[js.Any]): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createTypedArray(componentDatatype: typings.cesium.mod.ComponentDatatype, valuesOrLength: Double): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  
  def fromTypedArray(array: Float32Array): typings.cesium.mod.ComponentDatatype = js.native
  def fromTypedArray(array: Float64Array): typings.cesium.mod.ComponentDatatype = js.native
  def fromTypedArray(array: Int16Array): typings.cesium.mod.ComponentDatatype = js.native
  def fromTypedArray(array: Int8Array): typings.cesium.mod.ComponentDatatype = js.native
  def fromTypedArray(array: Uint16Array): typings.cesium.mod.ComponentDatatype = js.native
  def fromTypedArray(array: Uint8Array): typings.cesium.mod.ComponentDatatype = js.native
  
  def getSizeInBytes(componentDatatype: typings.cesium.mod.ComponentDatatype): Double = js.native
  
  def validate(componentDatatype: typings.cesium.mod.ComponentDatatype): Boolean = js.native
}
