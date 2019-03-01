package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTitleOptions extends js.Object {
  /**
    * Sets the background color of Chart Title. Values can be "HTML Color Name" or "hex" code.
    * Default: null
    * Example: "red", "#FF0000" ..
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the color of border around Chart Title. Values of borderColor can be "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FF0000" ..
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the thickness of border around the Title in pixels. To display border around title, set the borderThickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[scala.Double] = js.undefined
  /**
    * To display rounded borders around the title, set the cornerRadius of title. Higher the value, more rounded are the corners.
    * Default: 0
    * Options: 5,8 ..
    */
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * When dockInsidePlotArea is set to true, title renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: false, true.
    */
  var dockInsidePlotArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the font color of Chart Title. The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Font Family of Chart Title.
    * Default: "calibri, Optima, Candara, verdana, Geneva, sans-serif"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the font Size of Chart Title in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the fontStyle of Chart Title. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Font Weight used in the Chart Title.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This property lets you align the Chart Title horizontally.
    * Default: "center"
    * Options: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This property lets you set margin around the Chart Title in pixels.
    * Default: 5
    * Example: 4,12 ..
    */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether wrap is set to true (default) or false.
    * Default: Automatically calculated based on the chart size.
    * Example: 200, 400 ..
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * This property allows you to set the padding for Chart Title
    * Default: 0
    * Example: 5, 8 ..
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the Title’s text.
    * Default: null
    * Example: "Chart title"
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This property lets you align the Chart Title vertically.
    * Default: "top"
    * Options: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wrap specifies whether to wrap the title once its width crosses maxWidth or not. If it is set to false, title gets clipped after reaching maxWidth.
    * Default: true;
    * Example : true, false
    */
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartTitleOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderThickness: scala.Int | scala.Double = null,
    cornerRadius: scala.Int | scala.Double = null,
    dockInsidePlotArea: js.UndefOr[scala.Boolean] = js.undefined,
    fontColor: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    horizontalAlign: java.lang.String = null,
    margin: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    verticalAlign: java.lang.String = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(dockInsidePlotArea)) __obj.updateDynamic("dockInsidePlotArea")(dockInsidePlotArea)
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ChartTitleOptions]
  }
}

