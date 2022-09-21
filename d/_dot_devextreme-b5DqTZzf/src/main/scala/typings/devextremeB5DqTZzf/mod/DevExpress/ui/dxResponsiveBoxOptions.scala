package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.BaseSize
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxResponsiveBox.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxResponsiveBoxOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxResponsiveBox[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies the collection of columns for the grid used to position layout elements.
    */
  var cols: js.UndefOr[js.Array[BaseSize]] = js.undefined
  
  /**
    * Specifies the collection of rows for the grid used to position layout elements.
    */
  var rows: js.UndefOr[js.Array[BaseSize]] = js.undefined
  
  /**
    * Specifies the function returning the size qualifier depending on the screen&apos;s width.
    */
  var screenByWidth: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies on which screens all layout elements should be arranged in a single column. Accepts a single or several size qualifiers separated by a space.
    */
  var singleColumnScreen: js.UndefOr[String] = js.undefined
}
object dxResponsiveBoxOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxResponsiveBoxOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResponsiveBoxOptions[TItem, TKey]]
  }
  
  extension [Self <: dxResponsiveBoxOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxResponsiveBoxOptions[TItem, TKey])) {
    
    inline def setCols(value: js.Array[BaseSize]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setColsVarargs(value: BaseSize*): Self = StObject.set(x, "cols", js.Array(value*))
    
    inline def setRows(value: js.Array[BaseSize]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: BaseSize*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setScreenByWidth(value: js.Function): Self = StObject.set(x, "screenByWidth", value.asInstanceOf[js.Any])
    
    inline def setScreenByWidthUndefined: Self = StObject.set(x, "screenByWidth", js.undefined)
    
    inline def setSingleColumnScreen(value: String): Self = StObject.set(x, "singleColumnScreen", value.asInstanceOf[js.Any])
    
    inline def setSingleColumnScreenUndefined: Self = StObject.set(x, "singleColumnScreen", js.undefined)
  }
}
