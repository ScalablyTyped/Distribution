package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditSubsetResult extends js.Object {
  
  var rowCount: Double = js.native
  
  var subset: js.Array[EditRow] = js.native
}
object EditSubsetResult {
  
  @scala.inline
  def apply(rowCount: Double, subset: js.Array[EditRow]): EditSubsetResult = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], subset = subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSubsetResult]
  }
  
  @scala.inline
  implicit class EditSubsetResultOps[Self <: EditSubsetResult] (val x: Self) extends AnyVal {
    
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
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsetVarargs(value: EditRow*): Self = this.set("subset", js.Array(value :_*))
    
    @scala.inline
    def setSubset(value: js.Array[EditRow]): Self = this.set("subset", value.asInstanceOf[js.Any])
  }
}
