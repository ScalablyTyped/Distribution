package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonAnnotationOptions extends js.Object {
  var drawTime: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
  ] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onContextmenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onDblclick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMousedown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseenter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseleave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseover: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseup: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var `type`: line | box
}

object CommonAnnotationOptions {
  @scala.inline
  def apply(
    `type`: line | box,
    drawTime: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String = null,
    id: String = null,
    onClick: /* event */ MouseEvent => Unit = null,
    onContextmenu: /* event */ MouseEvent => Unit = null,
    onDblclick: /* event */ MouseEvent => Unit = null,
    onMousedown: /* event */ MouseEvent => Unit = null,
    onMouseenter: /* event */ MouseEvent => Unit = null,
    onMouseleave: /* event */ MouseEvent => Unit = null,
    onMousemove: /* event */ MouseEvent => Unit = null,
    onMouseout: /* event */ MouseEvent => Unit = null,
    onMouseover: /* event */ MouseEvent => Unit = null,
    onMouseup: /* event */ MouseEvent => Unit = null,
    onWheel: /* event */ MouseEvent => Unit = null
  ): CommonAnnotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (drawTime != null) __obj.updateDynamic("drawTime")(drawTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextmenu != null) __obj.updateDynamic("onContextmenu")(js.Any.fromFunction1(onContextmenu))
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(js.Any.fromFunction1(onDblclick))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction1(onMousedown))
    if (onMouseenter != null) __obj.updateDynamic("onMouseenter")(js.Any.fromFunction1(onMouseenter))
    if (onMouseleave != null) __obj.updateDynamic("onMouseleave")(js.Any.fromFunction1(onMouseleave))
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(js.Any.fromFunction1(onMousemove))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction1(onMouseout))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction1(onMouseover))
    if (onMouseup != null) __obj.updateDynamic("onMouseup")(js.Any.fromFunction1(onMouseup))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    __obj.asInstanceOf[CommonAnnotationOptions]
  }
}

