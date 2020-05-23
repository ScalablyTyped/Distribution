package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.bottom
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.center
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.left
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.right
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineAnnotationLabel extends js.Object {
  var backgroundColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fontColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[top | bottom | left | right | center] = js.undefined
  var xAdjust: js.UndefOr[Double] = js.undefined
  var xPadding: js.UndefOr[Double] = js.undefined
  var yAdjust: js.UndefOr[Double] = js.undefined
  var yPadding: js.UndefOr[Double] = js.undefined
}

object LineAnnotationLabel {
  @scala.inline
  def apply(
    backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any = null,
    content: String = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: String = null,
    position: top | bottom | left | right | center = null,
    xAdjust: js.UndefOr[Double] = js.undefined,
    xPadding: js.UndefOr[Double] = js.undefined,
    yAdjust: js.UndefOr[Double] = js.undefined,
    yPadding: js.UndefOr[Double] = js.undefined
  ): LineAnnotationLabel = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(xAdjust)) __obj.updateDynamic("xAdjust")(xAdjust.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xPadding)) __obj.updateDynamic("xPadding")(xPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAdjust)) __obj.updateDynamic("yAdjust")(yAdjust.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yPadding)) __obj.updateDynamic("yPadding")(yPadding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAnnotationLabel]
  }
}

