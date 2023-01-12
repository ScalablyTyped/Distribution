package typings.blueprintjsTable

import typings.blueprintjsTable.libEsmCommonGridMod.Grid
import typings.blueprintjsTable.libEsmCommonGridMod.ICellMapper
import typings.blueprintjsTable.libEsmCommonMod.Rect
import typings.blueprintjsTable.libEsmLocatorMod.Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmResizeRowsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/resizeRows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeRowsByApproximateHeight(numRows: Double, columnWidths: js.Array[Double], getCellText: ICellMapper[String]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRowsByApproximateHeight")(numRows.asInstanceOf[js.Any], columnWidths.asInstanceOf[js.Any], getCellText.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def resizeRowsByApproximateHeight(
    numRows: Double,
    columnWidths: js.Array[Double],
    getCellText: ICellMapper[String],
    options: IResizeRowsByApproximateHeightOptions
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRowsByApproximateHeight")(numRows.asInstanceOf[js.Any], columnWidths.asInstanceOf[js.Any], getCellText.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def resizeRowsByTallestCell(grid: Grid, viewportRect: Rect, locator: Locator, numRows: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRowsByTallestCell")(grid.asInstanceOf[js.Any], viewportRect.asInstanceOf[js.Any], locator.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def resizeRowsByTallestCell(grid: Grid, viewportRect: Rect, locator: Locator, numRows: Double, columnIndices: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRowsByTallestCell")(grid.asInstanceOf[js.Any], viewportRect.asInstanceOf[js.Any], locator.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], columnIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def resizeRowsByTallestCell(grid: Grid, viewportRect: Rect, locator: Locator, numRows: Double, columnIndices: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRowsByTallestCell")(grid.asInstanceOf[js.Any], viewportRect.asInstanceOf[js.Any], locator.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], columnIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  trait IResizeRowsByApproximateHeightOptions extends StObject {
    
    /**
      * Approximate width (in pixels) of an average character of text.
      */
    var getApproximateCharWidth: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
    
    /**
      * Approximate height (in pixels) of an average line of text.
      */
    var getApproximateLineHeight: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
    
    /**
      * Sum of horizontal paddings (in pixels) from the left __and__ right sides
      * of the cell.
      */
    var getCellHorizontalPadding: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
    
    /**
      * Number of extra lines to add in case the calculation is imperfect.
      */
    var getNumBufferLines: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
  }
  object IResizeRowsByApproximateHeightOptions {
    
    inline def apply(): IResizeRowsByApproximateHeightOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeRowsByApproximateHeightOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeRowsByApproximateHeightOptions] (val x: Self) extends AnyVal {
      
      inline def setGetApproximateCharWidth(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getApproximateCharWidth", value.asInstanceOf[js.Any])
      
      inline def setGetApproximateCharWidthFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getApproximateCharWidth", js.Any.fromFunction2(value))
      
      inline def setGetApproximateCharWidthUndefined: Self = StObject.set(x, "getApproximateCharWidth", js.undefined)
      
      inline def setGetApproximateLineHeight(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getApproximateLineHeight", value.asInstanceOf[js.Any])
      
      inline def setGetApproximateLineHeightFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getApproximateLineHeight", js.Any.fromFunction2(value))
      
      inline def setGetApproximateLineHeightUndefined: Self = StObject.set(x, "getApproximateLineHeight", js.undefined)
      
      inline def setGetCellHorizontalPadding(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getCellHorizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setGetCellHorizontalPaddingFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getCellHorizontalPadding", js.Any.fromFunction2(value))
      
      inline def setGetCellHorizontalPaddingUndefined: Self = StObject.set(x, "getCellHorizontalPadding", js.undefined)
      
      inline def setGetNumBufferLines(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getNumBufferLines", value.asInstanceOf[js.Any])
      
      inline def setGetNumBufferLinesFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getNumBufferLines", js.Any.fromFunction2(value))
      
      inline def setGetNumBufferLinesUndefined: Self = StObject.set(x, "getNumBufferLines", js.undefined)
    }
  }
  
  trait IResizeRowsByApproximateHeightResolvedOptions extends StObject {
    
    var getApproximateCharWidth: Double
    
    var getApproximateLineHeight: Double
    
    var getCellHorizontalPadding: Double
    
    var getNumBufferLines: Double
  }
  object IResizeRowsByApproximateHeightResolvedOptions {
    
    inline def apply(
      getApproximateCharWidth: Double,
      getApproximateLineHeight: Double,
      getCellHorizontalPadding: Double,
      getNumBufferLines: Double
    ): IResizeRowsByApproximateHeightResolvedOptions = {
      val __obj = js.Dynamic.literal(getApproximateCharWidth = getApproximateCharWidth.asInstanceOf[js.Any], getApproximateLineHeight = getApproximateLineHeight.asInstanceOf[js.Any], getCellHorizontalPadding = getCellHorizontalPadding.asInstanceOf[js.Any], getNumBufferLines = getNumBufferLines.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResizeRowsByApproximateHeightResolvedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeRowsByApproximateHeightResolvedOptions] (val x: Self) extends AnyVal {
      
      inline def setGetApproximateCharWidth(value: Double): Self = StObject.set(x, "getApproximateCharWidth", value.asInstanceOf[js.Any])
      
      inline def setGetApproximateLineHeight(value: Double): Self = StObject.set(x, "getApproximateLineHeight", value.asInstanceOf[js.Any])
      
      inline def setGetCellHorizontalPadding(value: Double): Self = StObject.set(x, "getCellHorizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setGetNumBufferLines(value: Double): Self = StObject.set(x, "getNumBufferLines", value.asInstanceOf[js.Any])
    }
  }
}
