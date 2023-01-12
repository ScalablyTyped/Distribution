package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MallocObj extends StObject {
  
  /**
    * The "pointer" into the WASM memory. Should be fixed over the lifetime of the object.
    */
  val byteOffset: Double
  
  /**
    * The number of objects this pointer refers to.
    */
  val length: Double
  
  /**
    * Return a read/write view into a subset of the memory. Do not cache the TypedArray this
    * returns, it may be invalidated if the WASM heap is resized. This is the same as calling
    * .toTypedArray().subarray() except the returned TypedArray can also be passed into an API
    * and not cause an additional copy.
    */
  def subarray(start: Double, end: Double): TypedArray
  
  /**
    * Return a read/write view of the memory. Do not cache the TypedArray this returns, it may be
    * invalidated if the WASM heap is resized. If this TypedArray is passed into a CanvasKit API,
    * it will not be copied again, only the pointer will be re-used.
    */
  def toTypedArray(): TypedArray
}
object MallocObj {
  
  inline def apply(
    byteOffset: Double,
    length: Double,
    subarray: (Double, Double) => TypedArray,
    toTypedArray: () => TypedArray
  ): MallocObj = {
    val __obj = js.Dynamic.literal(byteOffset = byteOffset.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], subarray = js.Any.fromFunction2(subarray), toTypedArray = js.Any.fromFunction0(toTypedArray))
    __obj.asInstanceOf[MallocObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MallocObj] (val x: Self) extends AnyVal {
    
    inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSubarray(value: (Double, Double) => TypedArray): Self = StObject.set(x, "subarray", js.Any.fromFunction2(value))
    
    inline def setToTypedArray(value: () => TypedArray): Self = StObject.set(x, "toTypedArray", js.Any.fromFunction0(value))
  }
}
