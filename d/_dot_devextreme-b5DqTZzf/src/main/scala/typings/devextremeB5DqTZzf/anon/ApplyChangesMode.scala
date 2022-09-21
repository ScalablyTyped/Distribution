package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.instantly
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onDemand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyChangesMode extends StObject {
  
  /**
    * Specifies whether the field chooser allows searching in the &apos;All Fields&apos; section.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when to apply changes made in the field chooser to the PivotGrid.
    */
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.undefined
  
  /**
    * Enables or disables the field chooser.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the field chooser height.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the field chooser layout.
    */
  var layout: js.UndefOr[
    typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`0` | typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`1` | typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`2`
  ] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between when a user finishes typing in the field chooser&apos;s search panel, and when the search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Strings that can be changed or localized in the pivot grid&apos;s integrated Field Chooser.
    */
  var texts: js.UndefOr[AllFields] = js.undefined
  
  /**
    * Specifies the text to display as a title of the field chooser popup window.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the field chooser width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ApplyChangesMode {
  
  inline def apply(): ApplyChangesMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyChangesMode]
  }
  
  extension [Self <: ApplyChangesMode](x: Self) {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setApplyChangesMode(value: instantly | onDemand): Self = StObject.set(x, "applyChangesMode", value.asInstanceOf[js.Any])
    
    inline def setApplyChangesModeUndefined: Self = StObject.set(x, "applyChangesMode", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayout(
      value: typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`0` | typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`1` | typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`2`
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setTexts(value: AllFields): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
