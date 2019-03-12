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
    afterBody: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    afterFooter: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    afterLabel: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    afterTitle: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    beforeBody: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    beforeFooter: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    beforeLabel: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    beforeTitle: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    footer: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    label: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null,
    labelColor: (/* tooltipItem */ ChartTooltipItem, /* chart */ chartDotJsLib.chartDotJsMod.Chart) => ChartTooltipLabelColor = null,
    labelTextColor: (/* tooltipItem */ ChartTooltipItem, /* chart */ chartDotJsLib.chartDotJsMod.Chart) => java.lang.String = null,
    title: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => java.lang.String | js.Array[java.lang.String] = null
  ): ChartTooltipCallback = {
    val __obj = js.Dynamic.literal()
    if (afterBody != null) __obj.updateDynamic("afterBody")(js.Any.fromFunction2(afterBody))
    if (afterFooter != null) __obj.updateDynamic("afterFooter")(js.Any.fromFunction2(afterFooter))
    if (afterLabel != null) __obj.updateDynamic("afterLabel")(js.Any.fromFunction2(afterLabel))
    if (afterTitle != null) __obj.updateDynamic("afterTitle")(js.Any.fromFunction2(afterTitle))
    if (beforeBody != null) __obj.updateDynamic("beforeBody")(js.Any.fromFunction2(beforeBody))
    if (beforeFooter != null) __obj.updateDynamic("beforeFooter")(js.Any.fromFunction2(beforeFooter))
    if (beforeLabel != null) __obj.updateDynamic("beforeLabel")(js.Any.fromFunction2(beforeLabel))
    if (beforeTitle != null) __obj.updateDynamic("beforeTitle")(js.Any.fromFunction2(beforeTitle))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction2(footer))
    if (label != null) __obj.updateDynamic("label")(js.Any.fromFunction2(label))
    if (labelColor != null) __obj.updateDynamic("labelColor")(js.Any.fromFunction2(labelColor))
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(js.Any.fromFunction2(labelTextColor))
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2(title))
    __obj.asInstanceOf[ChartTooltipCallback]
  }
}

