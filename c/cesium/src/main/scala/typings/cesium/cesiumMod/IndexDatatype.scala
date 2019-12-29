package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype with Double] = js.native
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): Uint16Array | Uint32Array = js.native
  def createTypedArrayFromArrayBuffer(numberOfVertices: Double, sourceArray: ArrayBuffer, byteOffset: Double, length: Double): Uint16Array | Uint32Array = js.native
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
  /* 0 */ @js.native
  object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
  
  /* 2 */ @js.native
  object UNSIGNED_INT extends TopLevel[UNSIGNED_INT with Double]
  
  /* 1 */ @js.native
  object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
  
}

