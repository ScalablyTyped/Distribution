package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonCellTypesMod {
  
  type CellCoordinates = ICellCoordinates
  
  type FocusedCellCoordinates = IFocusedCellCoordinates
  
  trait ICellCoordinates extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object ICellCoordinates {
    
    inline def apply(col: Double, row: Double): ICellCoordinates = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellCoordinates] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFocusedCellCoordinates
    extends StObject
       with ICellCoordinates {
    
    var focusSelectionIndex: Double
  }
  object IFocusedCellCoordinates {
    
    inline def apply(col: Double, focusSelectionIndex: Double, row: Double): IFocusedCellCoordinates = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], focusSelectionIndex = focusSelectionIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFocusedCellCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFocusedCellCoordinates] (val x: Self) extends AnyVal {
      
      inline def setFocusSelectionIndex(value: Double): Self = StObject.set(x, "focusSelectionIndex", value.asInstanceOf[js.Any])
    }
  }
}
