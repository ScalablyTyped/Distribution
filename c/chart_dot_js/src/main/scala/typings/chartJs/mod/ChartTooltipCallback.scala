package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltipCallback extends StObject {
  
  var afterBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var afterFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var afterLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.undefined
  
  var afterTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var beforeBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var beforeFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var beforeLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.undefined
  
  var beforeTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var footer: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  
  var label: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.undefined
  
  var labelColor: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, ChartTooltipLabelColor]
  ] = js.undefined
  
  var labelTextColor: js.UndefOr[js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, String]] = js.undefined
  
  var title: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
}
object ChartTooltipCallback {
  
  inline def apply(): ChartTooltipCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipCallback]
  }
  
  extension [Self <: ChartTooltipCallback](x: Self) {
    
    inline def setAfterBody(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "afterBody", js.Any.fromFunction2(value))
    
    inline def setAfterBodyUndefined: Self = StObject.set(x, "afterBody", js.undefined)
    
    inline def setAfterFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "afterFooter", js.Any.fromFunction2(value))
    
    inline def setAfterFooterUndefined: Self = StObject.set(x, "afterFooter", js.undefined)
    
    inline def setAfterLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "afterLabel", js.Any.fromFunction2(value))
    
    inline def setAfterLabelUndefined: Self = StObject.set(x, "afterLabel", js.undefined)
    
    inline def setAfterTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "afterTitle", js.Any.fromFunction2(value))
    
    inline def setAfterTitleUndefined: Self = StObject.set(x, "afterTitle", js.undefined)
    
    inline def setBeforeBody(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "beforeBody", js.Any.fromFunction2(value))
    
    inline def setBeforeBodyUndefined: Self = StObject.set(x, "beforeBody", js.undefined)
    
    inline def setBeforeFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "beforeFooter", js.Any.fromFunction2(value))
    
    inline def setBeforeFooterUndefined: Self = StObject.set(x, "beforeFooter", js.undefined)
    
    inline def setBeforeLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "beforeLabel", js.Any.fromFunction2(value))
    
    inline def setBeforeLabelUndefined: Self = StObject.set(x, "beforeLabel", js.undefined)
    
    inline def setBeforeTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "beforeTitle", js.Any.fromFunction2(value))
    
    inline def setBeforeTitleUndefined: Self = StObject.set(x, "beforeTitle", js.undefined)
    
    inline def setFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "label", js.Any.fromFunction2(value))
    
    inline def setLabelColor(value: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => ChartTooltipLabelColor): Self = StObject.set(x, "labelColor", js.Any.fromFunction2(value))
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelTextColor(value: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => String): Self = StObject.set(x, "labelTextColor", js.Any.fromFunction2(value))
    
    inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
