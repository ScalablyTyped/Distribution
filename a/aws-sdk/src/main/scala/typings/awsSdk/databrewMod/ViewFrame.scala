package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewFrame extends js.Object {
  
  /**
    * The number of columns to include in the view frame, beginning with the StartColumnIndex value and ignoring any columns in the HiddenColumns list.
    */
  var ColumnRange: js.UndefOr[typings.awsSdk.databrewMod.ColumnRange] = js.native
  
  /**
    * A list of columns to hide in the view frame.
    */
  var HiddenColumns: js.UndefOr[HiddenColumnList] = js.native
  
  /**
    * The starting index for the range of columns to return in the view frame.
    */
  var StartColumnIndex: typings.awsSdk.databrewMod.StartColumnIndex = js.native
}
object ViewFrame {
  
  @scala.inline
  def apply(StartColumnIndex: StartColumnIndex): ViewFrame = {
    val __obj = js.Dynamic.literal(StartColumnIndex = StartColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFrame]
  }
  
  @scala.inline
  implicit class ViewFrameOps[Self <: ViewFrame] (val x: Self) extends AnyVal {
    
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
    def setStartColumnIndex(value: StartColumnIndex): Self = this.set("StartColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnRange(value: ColumnRange): Self = this.set("ColumnRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnRange: Self = this.set("ColumnRange", js.undefined)
    
    @scala.inline
    def setHiddenColumnsVarargs(value: ColumnName*): Self = this.set("HiddenColumns", js.Array(value :_*))
    
    @scala.inline
    def setHiddenColumns(value: HiddenColumnList): Self = this.set("HiddenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenColumns: Self = this.set("HiddenColumns", js.undefined)
  }
}
