package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.horizontal
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.vertical
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineAnnotationOptions
  extends CommonAnnotationOptions
     with AnnotationOptions {
   // value or label
  var borderColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.undefined
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
   // value or label
  var endValue: js.UndefOr[Double | String] = js.undefined
  var label: js.UndefOr[LineAnnotationLabel] = js.undefined
  var mode: horizontal | vertical
  var scaleID: String
  @JSName("type")
  var type_LineAnnotationOptions: line
  var value: Double | String
}

object LineAnnotationOptions {
  @scala.inline
  def apply(
    mode: horizontal | vertical,
    scaleID: String,
    `type`: line,
    value: Double | String,
    borderColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any = null,
    borderDash: js.Array[Double] = null,
    borderDashOffset: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    drawTime: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String = null,
    endValue: Double | String = null,
    id: String = null,
    label: LineAnnotationLabel = null,
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
  ): LineAnnotationOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (!js.isUndefined(borderDashOffset)) __obj.updateDynamic("borderDashOffset")(borderDashOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (drawTime != null) __obj.updateDynamic("drawTime")(drawTime.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[LineAnnotationOptions]
  }
}

