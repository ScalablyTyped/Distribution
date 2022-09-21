package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Item
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxBarGauge.LegendItem
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBarGaugeLegend
  extends StObject
     with BaseLegend {
  
  /**
    * Specifies the hint that appears when a user hovers the mouse pointer over a legend item.
    */
  var customizeHint: js.UndefOr[js.Function1[/* arg */ Item, String]] = js.undefined
  
  /**
    * Allows you to change the order, text, and visibility of legend items.
    */
  var customizeItems: js.UndefOr[js.Function1[/* items */ js.Array[LegendItem], js.Array[LegendItem]]] = js.undefined
  
  /**
    * Customizes the text displayed by legend items.
    */
  var customizeText: js.UndefOr[js.Function1[/* arg */ Item, String]] = js.undefined
  
  /**
    * Formats the item text before it is displayed. Accepts only numeric formats. When unspecified, it inherits the label&apos;s format.
    */
  var itemTextFormat: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies an SVG element that serves as a custom legend item marker.
    */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ LegendItem, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
}
object dxBarGaugeLegend {
  
  inline def apply(): dxBarGaugeLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeLegend]
  }
  
  extension [Self <: dxBarGaugeLegend](x: Self) {
    
    inline def setCustomizeHint(value: /* arg */ Item => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeItems(value: /* items */ js.Array[LegendItem] => js.Array[LegendItem]): Self = StObject.set(x, "customizeItems", js.Any.fromFunction1(value))
    
    inline def setCustomizeItemsUndefined: Self = StObject.set(x, "customizeItems", js.undefined)
    
    inline def setCustomizeText(value: /* arg */ Item => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setItemTextFormat(value: Format): Self = StObject.set(x, "itemTextFormat", value.asInstanceOf[js.Any])
    
    inline def setItemTextFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "itemTextFormat", js.Any.fromFunction1(value))
    
    inline def setItemTextFormatUndefined: Self = StObject.set(x, "itemTextFormat", js.undefined)
    
    inline def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ LegendItem, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
    
    inline def setMarkerTemplateFunction2(
      value: (/* legendItem */ LegendItem, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "markerTemplate", js.Any.fromFunction2(value))
    
    inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
  }
}
