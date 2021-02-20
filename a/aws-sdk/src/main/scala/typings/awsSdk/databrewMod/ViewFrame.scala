package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewFrame extends StObject {
  
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
  implicit class ViewFrameMutableBuilder[Self <: ViewFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnRange(value: ColumnRange): Self = StObject.set(x, "ColumnRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnRangeUndefined: Self = StObject.set(x, "ColumnRange", js.undefined)
    
    @scala.inline
    def setHiddenColumns(value: HiddenColumnList): Self = StObject.set(x, "HiddenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenColumnsUndefined: Self = StObject.set(x, "HiddenColumns", js.undefined)
    
    @scala.inline
    def setHiddenColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "HiddenColumns", js.Array(value :_*))
    
    @scala.inline
    def setStartColumnIndex(value: StartColumnIndex): Self = StObject.set(x, "StartColumnIndex", value.asInstanceOf[js.Any])
  }
}
