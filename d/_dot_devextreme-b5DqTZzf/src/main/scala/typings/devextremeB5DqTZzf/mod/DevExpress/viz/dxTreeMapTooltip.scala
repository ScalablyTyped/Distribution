package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Node
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTreeMapTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Specifies a custom template for a tooltip.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* info */ Node, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Allows you to change tooltip appearance.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* info */ Node, Any]] = js.undefined
}
object dxTreeMapTooltip {
  
  inline def apply(): dxTreeMapTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeMapTooltip]
  }
  
  extension [Self <: dxTreeMapTooltip](x: Self) {
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* info */ Node, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* info */ Node, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* info */ Node => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
  }
}
