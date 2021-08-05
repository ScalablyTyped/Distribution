package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewFrame extends StObject {
  
  /**
    * The number of columns to include in the view frame, beginning with the StartColumnIndex value and ignoring any columns in the HiddenColumns list.
    */
  var ColumnRange: js.UndefOr[typings.awsSdk.databrewMod.ColumnRange] = js.undefined
  
  /**
    * A list of columns to hide in the view frame.
    */
  var HiddenColumns: js.UndefOr[HiddenColumnList] = js.undefined
  
  /**
    * The starting index for the range of columns to return in the view frame.
    */
  var StartColumnIndex: typings.awsSdk.databrewMod.StartColumnIndex
}
object ViewFrame {
  
  inline def apply(StartColumnIndex: StartColumnIndex): ViewFrame = {
    val __obj = js.Dynamic.literal(StartColumnIndex = StartColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFrame]
  }
  
  extension [Self <: ViewFrame](x: Self) {
    
    inline def setColumnRange(value: ColumnRange): Self = StObject.set(x, "ColumnRange", value.asInstanceOf[js.Any])
    
    inline def setColumnRangeUndefined: Self = StObject.set(x, "ColumnRange", js.undefined)
    
    inline def setHiddenColumns(value: HiddenColumnList): Self = StObject.set(x, "HiddenColumns", value.asInstanceOf[js.Any])
    
    inline def setHiddenColumnsUndefined: Self = StObject.set(x, "HiddenColumns", js.undefined)
    
    inline def setHiddenColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "HiddenColumns", js.Array(value :_*))
    
    inline def setStartColumnIndex(value: StartColumnIndex): Self = StObject.set(x, "StartColumnIndex", value.asInstanceOf[js.Any])
  }
}
