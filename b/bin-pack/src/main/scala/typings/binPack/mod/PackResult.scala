package typings.binPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The return value from the pack function. */
@js.native
trait PackResult[T] extends js.Object {
  
  /** Height of the bounding box around all bins. */
  var height: Double = js.native
  
  /** List of packed bins. */
  var items: js.Array[PackedItem[T]] = js.native
  
  /** Width of the bounding box around all bins. */
  var width: Double = js.native
}
object PackResult {
  
  @scala.inline
  def apply[T](height: Double, items: js.Array[PackedItem[T]], width: Double): PackResult[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackResult[T]]
  }
  
  @scala.inline
  implicit class PackResultOps[Self <: PackResult[_], T] (val x: Self with PackResult[T]) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PackedItem[T]*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[PackedItem[T]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
