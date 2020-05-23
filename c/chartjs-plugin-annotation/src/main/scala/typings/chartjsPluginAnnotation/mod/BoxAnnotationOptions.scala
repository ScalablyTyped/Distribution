package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxAnnotationOptions
  extends CommonAnnotationOptions
     with AnnotationOptions {
  var backgroundColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.undefined
  var borderColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_BoxAnnotationOptions: box
   // value or label
  var xMax: Double | String
  var xMin: Double | String
  var xScaleID: js.UndefOr[String] = js.undefined
  var yMax: Double | String
  var yMin: Double | String
  var yScaleID: js.UndefOr[String] = js.undefined
}

object BoxAnnotationOptions {
  @scala.inline
  def apply(
    `type`: box,
    xMax: Double | String,
    xMin: Double | String,
    yMax: Double | String,
    yMin: Double | String,
    backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any = null,
    borderColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
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
    onWheel: /* event */ MouseEvent => Unit = null,
    xScaleID: String = null,
    yScaleID: String = null
  ): BoxAnnotationOptions = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
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
    if (xScaleID != null) __obj.updateDynamic("xScaleID")(xScaleID.asInstanceOf[js.Any])
    if (yScaleID != null) __obj.updateDynamic("yScaleID")(yScaleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxAnnotationOptions]
  }
}

