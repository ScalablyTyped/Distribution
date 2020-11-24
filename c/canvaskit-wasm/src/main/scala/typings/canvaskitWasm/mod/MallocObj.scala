package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MallocObj extends js.Object {
  
  /**
    * The "pointer" into the WASM memory. Should be fixed over the lifetime of the object.
    */
  val byteOffset: Double = js.native
  
  /**
    * The number of objects this pointer refers to.
    */
  val length: Double = js.native
  
  /**
    * Return a read/write view into a subset of the memory. Do not cache the TypedArray this
    * returns, it may be invalidated if the WASM heap is resized. This is the same as calling
    * .toTypedArray().subarray() except the returned TypedArray can also be passed into an API
    * and not cause an additional copy.
    */
  def subarray(start: Double, end: Double): TypedArray = js.native
  
  /**
    * Return a read/write view of the memory. Do not cache the TypedArray this returns, it may be
    * invalidated if the WASM heap is resized. If this TypedArray is passed into a CanvasKit API,
    * it will not be copied again, only the pointer will be re-used.
    */
  def toTypedArray(): TypedArray = js.native
}
object MallocObj {
  
  @scala.inline
  def apply(
    byteOffset: Double,
    length: Double,
    subarray: (Double, Double) => TypedArray,
    toTypedArray: () => TypedArray
  ): MallocObj = {
    val __obj = js.Dynamic.literal(byteOffset = byteOffset.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], subarray = js.Any.fromFunction2(subarray), toTypedArray = js.Any.fromFunction0(toTypedArray))
    __obj.asInstanceOf[MallocObj]
  }
  
  @scala.inline
  implicit class MallocObjOps[Self <: MallocObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByteOffset(value: Double): Self = this.set("byteOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubarray(value: (Double, Double) => TypedArray): Self = this.set("subarray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToTypedArray(value: () => TypedArray): Self = this.set("toTypedArray", js.Any.fromFunction0(value))
  }
}
