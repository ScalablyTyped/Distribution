package typings.cesium.mod

import typings.std.ArrayBuffer
import typings.std.Uint16Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexDatatype extends StObject
@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype & Double] = js.native
  
  @js.native
  sealed trait UNSIGNED_BYTE
    extends StObject
       with IndexDatatype
  /* 0 */ val UNSIGNED_BYTE: typings.cesium.mod.IndexDatatype.UNSIGNED_BYTE & Double = js.native
  
  @js.native
  sealed trait UNSIGNED_INT
    extends StObject
       with IndexDatatype
  /* 2 */ val UNSIGNED_INT: typings.cesium.mod.IndexDatatype.UNSIGNED_INT & Double = js.native
  
  @js.native
  sealed trait UNSIGNED_SHORT
    extends StObject
       with IndexDatatype
  /* 1 */ val UNSIGNED_SHORT: typings.cesium.mod.IndexDatatype.UNSIGNED_SHORT & Double = js.native
  
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): Uint16Array | Uint32Array = js.native
  
  def createTypedArrayFromArrayBuffer(numberOfVertices: Double, sourceArray: ArrayBuffer, byteOffset: Double, length: Double): Uint16Array | Uint32Array = js.native
  
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
}
