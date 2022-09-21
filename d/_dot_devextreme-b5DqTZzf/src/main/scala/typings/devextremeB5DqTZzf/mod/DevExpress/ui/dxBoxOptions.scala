package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`space-around`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`space-between`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.col
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.end
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.row
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.start
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.stretch
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxBox.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBoxOptions[TItem /* <: ItemLike[TKey] */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxBox[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies how UI component items are aligned along the main direction.
    */
  var align: js.UndefOr[center | end | `space-around` | `space-between` | start] = js.undefined
  
  /**
    * Specifies how UI component items are aligned cross-wise.
    */
  var crossAlign: js.UndefOr[center | end | start | stretch] = js.undefined
  
  /**
    * Specifies the direction of item positioning in the UI component.
    */
  var direction: js.UndefOr[col | row] = js.undefined
}
object dxBoxOptions {
  
  inline def apply[TItem /* <: ItemLike[TKey] */, TKey](): dxBoxOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBoxOptions[TItem, TKey]]
  }
  
  extension [Self <: dxBoxOptions[?, ?], TItem /* <: ItemLike[TKey] */, TKey](x: Self & (dxBoxOptions[TItem, TKey])) {
    
    inline def setAlign(value: center | end | `space-around` | `space-between` | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCrossAlign(value: center | end | start | stretch): Self = StObject.set(x, "crossAlign", value.asInstanceOf[js.Any])
    
    inline def setCrossAlignUndefined: Self = StObject.set(x, "crossAlign", js.undefined)
    
    inline def setDirection(value: col | row): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
