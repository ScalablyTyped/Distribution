package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.contains
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.equals
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.startswith
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTextBox.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBoxMixinOptions extends StObject {
  
  /**
    * Configures the search panel.
    */
  var searchEditorOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies whether the search panel is visible.
    */
  var searchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a data object&apos;s field name or an expression whose value is compared to the search string.
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * Specifies a comparison operation used to search UI component items.
    */
  var searchMode: js.UndefOr[contains | startswith | equals] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between when a user finishes typing, and the search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the current search string.
    */
  var searchValue: js.UndefOr[String] = js.undefined
}
object SearchBoxMixinOptions {
  
  inline def apply(): SearchBoxMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxMixinOptions]
  }
  
  extension [Self <: SearchBoxMixinOptions](x: Self) {
    
    inline def setSearchEditorOptions(value: Properties): Self = StObject.set(x, "searchEditorOptions", value.asInstanceOf[js.Any])
    
    inline def setSearchEditorOptionsUndefined: Self = StObject.set(x, "searchEditorOptions", js.undefined)
    
    inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "searchEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchEnabledUndefined: Self = StObject.set(x, "searchEnabled", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value*))
    
    inline def setSearchMode(value: contains | startswith | equals): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
  }
}
