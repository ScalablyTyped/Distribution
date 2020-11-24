package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComponentDatatype extends js.Object
@JSImport("cesium", "ComponentDatatype")
@js.native
object ComponentDatatype extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentDatatype with Double] = js.native
  
  def createArrayBufferView(componentDatatype: ComponentDatatype, buffer: ArrayBuffer): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: ComponentDatatype,
    buffer: ArrayBuffer,
    byteOffset: js.UndefOr[scala.Nothing],
    length: Double
  ): Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
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
  
  @js.native
  sealed trait BYTE extends ComponentDatatype
  /* 0 */ @js.native
  object BYTE extends TopLevel[BYTE with Double]
  
  @js.native
  sealed trait DOUBLE extends ComponentDatatype
  /* 5 */ @js.native
  object DOUBLE extends TopLevel[DOUBLE with Double]
  
  @js.native
  sealed trait FLOAT extends ComponentDatatype
  /* 4 */ @js.native
  object FLOAT extends TopLevel[FLOAT with Double]
  
  @js.native
  sealed trait SHORT extends ComponentDatatype
  /* 2 */ @js.native
  object SHORT extends TopLevel[SHORT with Double]
  
  @js.native
  sealed trait UNSIGNED_BYTE extends ComponentDatatype
  /* 1 */ @js.native
  object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
  
  @js.native
  sealed trait UNSIGNED_SHORT extends ComponentDatatype
  /* 3 */ @js.native
  object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
}
