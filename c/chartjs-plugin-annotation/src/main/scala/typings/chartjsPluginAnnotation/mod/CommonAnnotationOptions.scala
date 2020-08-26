package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonAnnotationOptions extends js.Object {
  var drawTime: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
  ] = js.native
  var id: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onContextmenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onDblclick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMousedown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseenter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseleave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseover: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseup: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onWheel: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var `type`: line | box = js.native
}

object CommonAnnotationOptions {
  @scala.inline
  def apply(`type`: line | box): CommonAnnotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAnnotationOptions]
  }
  @scala.inline
  implicit class CommonAnnotationOptionsOps[Self <: CommonAnnotationOptions] (val x: Self) extends AnyVal {
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
    def setType(value: line | box): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawTime(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
    ): Self = this.set("drawTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawTime: Self = this.set("drawTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextmenu(value: /* event */ MouseEvent => Unit): Self = this.set("onContextmenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextmenu: Self = this.set("onContextmenu", js.undefined)
    @scala.inline
    def setOnDblclick(value: /* event */ MouseEvent => Unit): Self = this.set("onDblclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblclick: Self = this.set("onDblclick", js.undefined)
    @scala.inline
    def setOnMousedown(value: /* event */ MouseEvent => Unit): Self = this.set("onMousedown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMousedown: Self = this.set("onMousedown", js.undefined)
    @scala.inline
    def setOnMouseenter(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseenter: Self = this.set("onMouseenter", js.undefined)
    @scala.inline
    def setOnMouseleave(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseleave: Self = this.set("onMouseleave", js.undefined)
    @scala.inline
    def setOnMousemove(value: /* event */ MouseEvent => Unit): Self = this.set("onMousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMousemove: Self = this.set("onMousemove", js.undefined)
    @scala.inline
    def setOnMouseout(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseout: Self = this.set("onMouseout", js.undefined)
    @scala.inline
    def setOnMouseover(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseover: Self = this.set("onMouseover", js.undefined)
    @scala.inline
    def setOnMouseup(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseup: Self = this.set("onMouseup", js.undefined)
    @scala.inline
    def setOnWheel(value: /* event */ MouseEvent => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
  }
  
}

