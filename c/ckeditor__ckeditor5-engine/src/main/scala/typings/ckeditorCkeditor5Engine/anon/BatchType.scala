package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchType extends js.Object {
  
  var batchType: js.UndefOr[String] = js.native
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.native
  
  var rootName: js.UndefOr[String] = js.native
  
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.native
}
object BatchType {
  
  @scala.inline
  def apply(): BatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchType]
  }
  
  @scala.inline
  implicit class BatchTypeOps[Self <: BatchType] (val x: Self) extends AnyVal {
    
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
    def setBatchType(value: String): Self = this.set("batchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchType: Self = this.set("batchType", js.undefined)
    
    @scala.inline
    def setLastRangeBackward(value: Boolean): Self = this.set("lastRangeBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRangeBackward: Self = this.set("lastRangeBackward", js.undefined)
    
    @scala.inline
    def setRootName(value: String): Self = this.set("rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootName: Self = this.set("rootName", js.undefined)
    
    @scala.inline
    def setSelectionAttributesVarargs(value: js.Object*): Self = this.set("selectionAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSelectionAttributes(value: js.Array[js.Object]): Self = this.set("selectionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionAttributes: Self = this.set("selectionAttributes", js.undefined)
  }
}
