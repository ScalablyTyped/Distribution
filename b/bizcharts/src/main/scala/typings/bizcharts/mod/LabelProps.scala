package typings.bizcharts.mod

import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelProps
  extends Props[js.Any] {
  var autoRotate: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[
    String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
  ] = js.native
  var formatter: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double
  ] = js.native
  var htmlTemplate: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String
  ] = js.native
  var labelEmit: js.UndefOr[Boolean] = js.native
  var labelLine: js.UndefOr[
    (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
  ] = js.native
  var offset: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[text | (js.Function1[/* t */ js.UndefOr[js.Any], text])] = js.native
}

object LabelProps {
  @scala.inline
  def apply(): LabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelProps]
  }
  @scala.inline
  implicit class LabelPropsOps[Self <: LabelProps] (val x: Self) extends AnyVal {
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    @scala.inline
    def setContent(
      value: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
    ): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFormatterFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("formatter", js.Any.fromFunction3(value))
    @scala.inline
    def setFormatter(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | Double
    ): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setHtmlTemplateFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("htmlTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setHtmlTemplate(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | String
    ): Self = this.set("htmlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlTemplate: Self = this.set("htmlTemplate", js.undefined)
    @scala.inline
    def setLabelEmit(value: Boolean): Self = this.set("labelEmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelEmit: Self = this.set("labelEmit", js.undefined)
    @scala.inline
    def setLabelLineFunction2(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => line): Self = this.set("labelLine", js.Any.fromFunction2(value))
    @scala.inline
    def setLabelLine(
      value: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
    ): Self = this.set("labelLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelLine: Self = this.set("labelLine", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setTextStyleFunction1(value: /* t */ js.UndefOr[js.Any] => text): Self = this.set("textStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setTextStyle(value: text | (js.Function1[/* t */ js.UndefOr[js.Any], text])): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

