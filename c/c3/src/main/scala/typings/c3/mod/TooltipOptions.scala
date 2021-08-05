package typings.c3.mod

import typings.c3.anon.Left
import typings.c3.anon.Name
import typings.c3.anon.PositionShow
import typings.c3.c3Strings.asc
import typings.c3.c3Strings.desc
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  /**
    * Set custom HTML for the tooltip.
    * @param data If `tooltip.grouped` is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ js.Array[DataPoint], 
      /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, js.Any], 
      /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, js.Any], 
      /* color */ js.Function1[/* repeated */ js.Any, js.Any], 
      String
    ]
  ] = js.undefined
  
  var format: js.UndefOr[Name] = js.undefined
  
  /**
    * Set if tooltip is grouped or not for the data points.
    * Defaults to `true`.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  /** Show the tooltips based on the horizontal position of the mouse. */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var init: js.UndefOr[PositionShow] = js.undefined
  
  /**
    * Set tooltip values order.
    */
  var order: js.UndefOr[
    desc | asc | js.Array[js.Any] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) | Null
  ] = js.undefined
  
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ Primitive, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ SVGElement, 
      Left
    ]
  ] = js.undefined
  
  /**
    * Show or hide tooltip.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}
object TooltipOptions {
  
  inline def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  extension [Self <: TooltipOptions](x: Self) {
    
    inline def setContents(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ js.Array[DataPoint], 
          /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, js.Any], 
          /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, js.Any], 
          /* color */ js.Function1[/* repeated */ js.Any, js.Any], 
          String
        ]
    ): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setFormat(value: Name): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setInit(value: PositionShow): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setOrder(
      value: desc | asc | js.Array[js.Any] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double])
    ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderFunction2(value: (/* data1 */ js.Any, /* data2 */ js.Any) => Double): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: js.Any*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    inline def setPosition(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ Primitive, 
          /* width */ Double, 
          /* height */ Double, 
          /* element */ SVGElement, 
          Left
        ]
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
