package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemLabels extends StObject {
  
  /**
    * Specifies whether or not labels of items displayed within the current tab are aligned.
    */
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a badge text for the tab.
    */
  var badge: js.UndefOr[String] = js.undefined
  
  /**
    * The count of columns in the tab layout.
    */
  var colCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the relation between the screen size qualifier and the number of columns in the tabbed layout.
    */
  var colCountByScreen: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether the tab responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the icon to be displayed on the tab.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Holds an array of form items displayed within the tab.
    */
  var items: js.UndefOr[js.Array[typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxForm.Item]] = js.undefined
  
  /**
    * The template to be used for rendering the tab.
    */
  var tabTemplate: js.UndefOr[
    template | (js.Function3[
      /* tabData */ Any, 
      /* tabIndex */ Double, 
      /* tabElement */ DxElement_[HTMLElement], 
      Any
    ])
  ] = js.undefined
  
  /**
    * The template to be used for rendering the tab content.
    */
  var template: js.UndefOr[
    typings.devextremeB5DqTZzf.mod.DevExpress.core.template | (js.Function3[
      /* tabData */ Any, 
      /* tabIndex */ Double, 
      /* tabElement */ DxElement_[HTMLElement], 
      Any
    ])
  ] = js.undefined
  
  /**
    * Specifies the tab title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object AlignItemLabels {
  
  inline def apply(): AlignItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemLabels]
  }
  
  extension [Self <: AlignItemLabels](x: Self) {
    
    inline def setAlignItemLabels(value: Boolean): Self = StObject.set(x, "alignItemLabels", value.asInstanceOf[js.Any])
    
    inline def setAlignItemLabelsUndefined: Self = StObject.set(x, "alignItemLabels", js.undefined)
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreen(value: Any): Self = StObject.set(x, "colCountByScreen", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreenUndefined: Self = StObject.set(x, "colCountByScreen", js.undefined)
    
    inline def setColCountUndefined: Self = StObject.set(x, "colCount", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItems(value: js.Array[typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxForm.Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxForm.Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTabTemplate(
      value: template | (js.Function3[
          /* tabData */ Any, 
          /* tabIndex */ Double, 
          /* tabElement */ DxElement_[HTMLElement], 
          Any
        ])
    ): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
    
    inline def setTabTemplateFunction3(value: (/* tabData */ Any, /* tabIndex */ Double, /* tabElement */ DxElement_[HTMLElement]) => Any): Self = StObject.set(x, "tabTemplate", js.Any.fromFunction3(value))
    
    inline def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function3[
          /* tabData */ Any, 
          /* tabIndex */ Double, 
          /* tabElement */ DxElement_[HTMLElement], 
          Any
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction3(value: (/* tabData */ Any, /* tabIndex */ Double, /* tabElement */ DxElement_[HTMLElement]) => Any): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
