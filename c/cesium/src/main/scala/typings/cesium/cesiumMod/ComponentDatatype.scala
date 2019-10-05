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

@js.native
sealed trait ComponentDatatype extends js.Object

@JSImport("cesium", "ComponentDatatype")
@js.native
object ComponentDatatype extends js.Object {
  @js.native
  sealed trait BYTE extends ComponentDatatype
  
  @js.native
  sealed trait DOUBLE extends ComponentDatatype
  
  @js.native
  sealed trait FLOAT extends ComponentDatatype
  
  @js.native
  sealed trait SHORT extends ComponentDatatype
  
  @js.native
  sealed trait UNSIGNED_BYTE extends ComponentDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT extends ComponentDatatype
  
  /* 0 */ val BYTE: typings.cesium.cesiumMod.ComponentDatatype.BYTE with Double = js.native
  /* 5 */ val DOUBLE: typings.cesium.cesiumMod.ComponentDatatype.DOUBLE with Double = js.native
  /* 4 */ val FLOAT: typings.cesium.cesiumMod.ComponentDatatype.FLOAT with Double = js.native
  /* 2 */ val SHORT: typings.cesium.cesiumMod.ComponentDatatype.SHORT with Double = js.native
  /* 1 */ val UNSIGNED_BYTE: typings.cesium.cesiumMod.ComponentDatatype.UNSIGNED_BYTE with Double = js.native
  /* 3 */ val UNSIGNED_SHORT: typings.cesium.cesiumMod.ComponentDatatype.UNSIGNED_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentDatatype with Double] = js.native
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

