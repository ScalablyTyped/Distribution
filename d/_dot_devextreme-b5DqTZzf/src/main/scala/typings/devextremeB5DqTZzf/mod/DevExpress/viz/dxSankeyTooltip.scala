package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Source
import typings.devextremeB5DqTZzf.anon.WeightIn
import typings.devextremeB5DqTZzf.anon.WeightOut
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Customizes link tooltips&apos; appearance.
    */
  var customizeLinkTooltip: js.UndefOr[js.Function1[/* info */ Source, Any]] = js.undefined
  
  /**
    * Customizes node tooltips&apos; appearance.
    */
  var customizeNodeTooltip: js.UndefOr[js.Function1[/* info */ WeightIn, Any]] = js.undefined
  
  /**
    * Specifies a custom template for a link&apos;s tooltip.
    */
  var linkTooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* info */ Source, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for a node&apos;s tooltip.
    */
  var nodeTooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* info */ WeightOut, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
}
object dxSankeyTooltip {
  
  inline def apply(): dxSankeyTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyTooltip]
  }
  
  extension [Self <: dxSankeyTooltip](x: Self) {
    
    inline def setCustomizeLinkTooltip(value: /* info */ Source => Any): Self = StObject.set(x, "customizeLinkTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeLinkTooltipUndefined: Self = StObject.set(x, "customizeLinkTooltip", js.undefined)
    
    inline def setCustomizeNodeTooltip(value: /* info */ WeightIn => Any): Self = StObject.set(x, "customizeNodeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeNodeTooltipUndefined: Self = StObject.set(x, "customizeNodeTooltip", js.undefined)
    
    inline def setLinkTooltipTemplate(
      value: template | (js.Function2[
          /* info */ Source, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "linkTooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setLinkTooltipTemplateFunction2(
      value: (/* info */ Source, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "linkTooltipTemplate", js.Any.fromFunction2(value))
    
    inline def setLinkTooltipTemplateUndefined: Self = StObject.set(x, "linkTooltipTemplate", js.undefined)
    
    inline def setNodeTooltipTemplate(
      value: template | (js.Function2[
          /* info */ WeightOut, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "nodeTooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setNodeTooltipTemplateFunction2(
      value: (/* info */ WeightOut, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "nodeTooltipTemplate", js.Any.fromFunction2(value))
    
    inline def setNodeTooltipTemplateUndefined: Self = StObject.set(x, "nodeTooltipTemplate", js.undefined)
  }
}
