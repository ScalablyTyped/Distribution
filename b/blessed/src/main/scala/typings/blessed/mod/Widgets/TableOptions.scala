package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOptions
  extends StObject
     with BoxOptions {
  
  /**
    * array of array of strings representing rows (same as `rows`).
    */
  var data: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * fill cell borders with the adjacent background color.
    */
  var fillCellBorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * do not draw inner cells.
    */
  var noCellBorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * spaces to attempt to pad on the sides of each cell. `2` by default: one space on each side (only useful if the width is shrunken).
    */
  var pad: js.UndefOr[Double] = js.undefined
  
  /**
    * array of array of strings representing rows (same as `data`).
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
}
object TableOptions {
  
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFillCellBorders(value: Boolean): Self = StObject.set(x, "fillCellBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillCellBordersUndefined: Self = StObject.set(x, "fillCellBorders", js.undefined)
    
    @scala.inline
    def setNoCellBorders(value: Boolean): Self = StObject.set(x, "noCellBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCellBordersUndefined: Self = StObject.set(x, "noCellBorders", js.undefined)
    
    @scala.inline
    def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
