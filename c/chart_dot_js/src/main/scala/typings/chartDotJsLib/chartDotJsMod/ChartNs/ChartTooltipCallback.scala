package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartTooltipCallback extends js.Object {
  var afterBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var afterFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var afterLabel: js.UndefOr[
    js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var afterTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var beforeBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var beforeFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var beforeLabel: js.UndefOr[
    js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var beforeTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var footer: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var label: js.UndefOr[
    js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var labelColor: js.UndefOr[
    js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* chart */ chartDotJsLib.chartDotJsMod.Chart, 
      ChartTooltipLabelColor
    ]
  ] = js.undefined
  var labelTextColor: js.UndefOr[
    js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* chart */ chartDotJsLib.chartDotJsMod.Chart, 
      java.lang.String
    ]
  ] = js.undefined
  var title: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ]
  ] = js.undefined
}

