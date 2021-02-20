package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonCellMod {
  
  @js.native
  trait ICellCoordinates extends StObject {
    
    var col: Double = js.native
    
    var row: Double = js.native
  }
  object ICellCoordinates {
    
    @scala.inline
    def apply(col: Double, row: Double): ICellCoordinates = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellCoordinates]
    }
    
    @scala.inline
    implicit class ICellCoordinatesMutableBuilder[Self <: ICellCoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFocusedCellCoordinates extends ICellCoordinates {
    
    var focusSelectionIndex: Double = js.native
  }
  object IFocusedCellCoordinates {
    
    @scala.inline
    def apply(col: Double, focusSelectionIndex: Double, row: Double): IFocusedCellCoordinates = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], focusSelectionIndex = focusSelectionIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFocusedCellCoordinates]
    }
    
    @scala.inline
    implicit class IFocusedCellCoordinatesMutableBuilder[Self <: IFocusedCellCoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusSelectionIndex(value: Double): Self = StObject.set(x, "focusSelectionIndex", value.asInstanceOf[js.Any])
    }
  }
}
