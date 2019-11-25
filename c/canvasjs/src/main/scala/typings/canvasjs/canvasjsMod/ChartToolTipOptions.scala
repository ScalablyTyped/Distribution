package typings.canvasjs.canvasjsMod

import typings.canvasjs.Anon_ChartEntries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartToolTipOptions extends js.Object {
  /**
    * While mouse hovers from one dataPoint to another there is a smooth transition in toolTip.
    * This effect can be controlled by animationEnabled Property. Setting it to false, will disable the animation and toolTip will directly switch from one dataPoint to the other.
    * Default: True
    * Example: True, False
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the background color of toolTip. Values can be “HTML Color Name” or “hex” code.
    * Default: white
    * Example: “red”, “#FF0000” ..
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color around Tool Tip. When not set it takes the color of corresponding dataSeries or dataPoint.
    * Default: dataSeries color/ dataPoint color
    * Example: "red", "#808080"..
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the thickness of border around the toolTip in pixels. To display border around toolTip, set the borderThickness to a number greater than zero. Setting it to zero removes the border.
    * Default: 2
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[Double] = js.undefined
  /**
    * toolTip for entire chart can be set by adding content at toolTip object.
    * content can either be a string or a custom function that returns HTML/String to be displayed inside the toolTip.
    * Default: auto
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * A custom formatter function that returns the content (text/html) to be displayed inside the toolTip.
    */
  var contentFormatter: js.UndefOr[js.Function1[/* e */ Anon_ChartEntries, String]] = js.undefined
  /**
    * Setting a value higher than 0 makes the corners of toolTip rounded. Higher the value, more rounded the corners are.
    * Default: 5
    * Options: 2,3,8 ..
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /**
    * Enables or Disables the toolTip for the chart.
    * Default: True
    * Example: True, False
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the Font Color of toolTipContent. The value of fontColor can be a “HTML Color Name” or “hex” code.
    * Default: “black”
    * Example: “red”, “#FAC003″ ..
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Family of ToolTip Content.
    * Default: “Calibri, Arial, Georgia, serif”
    * Example: “arial” , “tahoma”, “verdana” ..
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Sets the font Size of ToolTip Content in pixels.
    * Default: 14
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Font Style of ToolTip Content. It can be set to one of the below options.
    * Default: “italic”
    * Example: “normal”, “italic” , “oblique”
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
    * Set the font Weight of ToolTip Content.
    * Default: “normal”
    * Example: “lighter”, “normal”, “bold” , “bolder”
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
    * Reverses the order in which items inside toolTip are shown.
    * Default: false
    * Example: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * In a Multi-Series or a Combination Chart, it is often required to display all values common to x value in a single bubble.
    * Setting shared to true will show in a common bubble all the values of y from each series next to their name.
    * Default: True
    * Example: True, False
    */
  var shared: js.UndefOr[Boolean] = js.undefined
}

object ChartToolTipOptions {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    borderColor: String = null,
    borderThickness: Int | Double = null,
    content: String = null,
    contentFormatter: /* e */ Anon_ChartEntries => String = null,
    cornerRadius: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontColor: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    fontWeight: String = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined
  ): ChartToolTipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentFormatter != null) __obj.updateDynamic("contentFormatter")(js.Any.fromFunction1(contentFormatter))
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartToolTipOptions]
  }
}

