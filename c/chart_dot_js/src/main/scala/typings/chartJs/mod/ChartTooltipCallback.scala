package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipCallback extends js.Object {
  var afterBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var afterFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var afterLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.native
  var afterTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var beforeBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var beforeFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var beforeLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.native
  var beforeTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var footer: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var label: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.native
  var labelColor: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, ChartTooltipLabelColor]
  ] = js.native
  var labelTextColor: js.UndefOr[js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, String]] = js.native
  var title: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
}

object ChartTooltipCallback {
  @scala.inline
  def apply(): ChartTooltipCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipCallback]
  }
  @scala.inline
  implicit class ChartTooltipCallbackOps[Self <: ChartTooltipCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterBody(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("afterBody", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterBody: Self = this.set("afterBody", js.undefined)
    @scala.inline
    def setAfterFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("afterFooter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterFooter: Self = this.set("afterFooter", js.undefined)
    @scala.inline
    def setAfterLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = this.set("afterLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterLabel: Self = this.set("afterLabel", js.undefined)
    @scala.inline
    def setAfterTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("afterTitle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterTitle: Self = this.set("afterTitle", js.undefined)
    @scala.inline
    def setBeforeBody(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("beforeBody", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeBody: Self = this.set("beforeBody", js.undefined)
    @scala.inline
    def setBeforeFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("beforeFooter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeFooter: Self = this.set("beforeFooter", js.undefined)
    @scala.inline
    def setBeforeLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = this.set("beforeLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeLabel: Self = this.set("beforeLabel", js.undefined)
    @scala.inline
    def setBeforeTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("beforeTitle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeTitle: Self = this.set("beforeTitle", js.undefined)
    @scala.inline
    def setFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("footer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = this.set("label", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelColor(value: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => ChartTooltipLabelColor): Self = this.set("labelColor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelTextColor(value: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => String): Self = this.set("labelTextColor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    @scala.inline
    def setTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = this.set("title", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

