package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Layer
import typings.devextremeB5DqTZzf.anon.Size
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.circle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.square
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxVectorMap.LegendItem
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxVectorMapLegends
  extends StObject
     with BaseLegend {
  
  /**
    * Specifies text for a hint that appears when a user hovers the mouse pointer over the text of a legend item.
    */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ Size, String]] = js.undefined
  
  /**
    * Allows you to change the order and visibility of legend items.
    */
  var customizeItems: js.UndefOr[js.Function1[/* items */ js.Array[LegendItem], js.Array[LegendItem]]] = js.undefined
  
  /**
    * Specifies text for legend items.
    */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Size, String]] = js.undefined
  
  /**
    * Specifies the color of item markers in the legend. The specified color applied only when the legend uses &apos;size&apos; source.
    */
  var markerColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the shape of item markers.
    */
  var markerShape: js.UndefOr[circle | square] = js.undefined
  
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
  
  /**
    * Specifies the source of data for the legend.
    */
  var source: js.UndefOr[Layer] = js.undefined
}
object dxVectorMapLegends {
  
  inline def apply(): dxVectorMapLegends = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapLegends]
  }
  
  extension [Self <: dxVectorMapLegends](x: Self) {
    
    inline def setCustomizeHint(value: /* itemInfo */ Size => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeItems(value: /* items */ js.Array[LegendItem] => js.Array[LegendItem]): Self = StObject.set(x, "customizeItems", js.Any.fromFunction1(value))
    
    inline def setCustomizeItemsUndefined: Self = StObject.set(x, "customizeItems", js.undefined)
    
    inline def setCustomizeText(value: /* itemInfo */ Size => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    inline def setMarkerShape(value: circle | square): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeUndefined: Self = StObject.set(x, "markerShape", js.undefined)
    
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
    
    inline def setSource(value: Layer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
