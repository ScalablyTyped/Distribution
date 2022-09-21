package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSparklineTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Specifies a custom template for tooltips.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* pointsInfo */ Any, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Allows you to change tooltip appearance.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* pointsInfo */ Any, Any]] = js.undefined
  
  /**
    * Allows users to interact with the tooltip content.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
}
object BaseSparklineTooltip {
  
  inline def apply(): BaseSparklineTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSparklineTooltip]
  }
  
  extension [Self <: BaseSparklineTooltip](x: Self) {
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* pointsInfo */ Any, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* pointsInfo */ Any, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* pointsInfo */ Any => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}
