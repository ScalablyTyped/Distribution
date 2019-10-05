package typings.cesium.cesiumMod

import typings.std.ArrayBuffer
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexDatatype extends js.Object

@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends js.Object {
  @js.native
  sealed trait UNSIGNED_BYTE extends IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_INT extends IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT extends IndexDatatype
  
  /* 0 */ val UNSIGNED_BYTE: typings.cesium.cesiumMod.IndexDatatype.UNSIGNED_BYTE with Double = js.native
  /* 2 */ val UNSIGNED_INT: typings.cesium.cesiumMod.IndexDatatype.UNSIGNED_INT with Double = js.native
  /* 1 */ val UNSIGNED_SHORT: typings.cesium.cesiumMod.IndexDatatype.UNSIGNED_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype with Double] = js.native
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): Uint16Array | Uint32Array = js.native
  def createTypedArrayFromArrayBuffer(numberOfVertices: Double, sourceArray: ArrayBuffer, byteOffset: Double, length: Double): Uint16Array | Uint32Array = js.native
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
}

