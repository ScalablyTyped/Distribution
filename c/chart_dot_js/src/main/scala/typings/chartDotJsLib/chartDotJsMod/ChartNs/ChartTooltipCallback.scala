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

object ChartTooltipCallback {
  @scala.inline
  def apply(
    afterBody: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    afterFooter: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    afterLabel: js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    afterTitle: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    beforeBody: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    beforeFooter: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    beforeLabel: js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    beforeTitle: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    footer: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    label: js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null,
    labelColor: js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* chart */ chartDotJsLib.chartDotJsMod.Chart, 
      ChartTooltipLabelColor
    ] = null,
    labelTextColor: js.Function2[
      /* tooltipItem */ ChartTooltipItem, 
      /* chart */ chartDotJsLib.chartDotJsMod.Chart, 
      java.lang.String
    ] = null,
    title: js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      java.lang.String | js.Array[java.lang.String]
    ] = null
  ): ChartTooltipCallback = {
    val __obj = js.Dynamic.literal()
    if (afterBody != null) __obj.updateDynamic("afterBody")(afterBody)
    if (afterFooter != null) __obj.updateDynamic("afterFooter")(afterFooter)
    if (afterLabel != null) __obj.updateDynamic("afterLabel")(afterLabel)
    if (afterTitle != null) __obj.updateDynamic("afterTitle")(afterTitle)
    if (beforeBody != null) __obj.updateDynamic("beforeBody")(beforeBody)
    if (beforeFooter != null) __obj.updateDynamic("beforeFooter")(beforeFooter)
    if (beforeLabel != null) __obj.updateDynamic("beforeLabel")(beforeLabel)
    if (beforeTitle != null) __obj.updateDynamic("beforeTitle")(beforeTitle)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChartTooltipCallback]
  }
}

