package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushpinOptions extends IPrimitiveOptions {
  /** The point on the pushpin icon, in pixels, which is anchored to the pushpin location. An anchor of (0,0) is the top left corner of the icon. */
  var anchor: js.UndefOr[Point] = js.undefined
  /** Specifies what color to make the default pushpin. */
  var color: js.UndefOr[java.lang.String | Color] = js.undefined
  /** A boolean indicating whether the pushpin can be dragged to a new position with the mouse or by touch. */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to enable the clicked style on the pushpin. */
  var enableClickedStyle: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to enable the hover style on the pushpin. */
  var enableHoverStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the the icon to use for the pushpin.This can be a URL to an Image or SVG file, an image data URI, or an inline SVG string.
    * Tip: When using inline SVG, you can pass in placeholders `{color}` and `{text}` in your SVG string. This placeholder will be replaced by the pushpins color or text property value when rendered.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the clickable area of pushpin should be an ellipse instead of a rectangle. */
  var roundClickableArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A secondary title label value to display under the pushpin. Uses label collision detection. This label automatically changes color between white
    * and dark grey depending on which map style is selected. Requires the title label to be set.
    */
  var subTitle: js.UndefOr[java.lang.String] = js.undefined
  /** A short string of text that is overlaid on top of the pushpin. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** The amount the text is shifted from the pushpin icon. The default value is (0,5). */
  var textOffset: js.UndefOr[Point] = js.undefined
  /**
    * The title label value to display under the pushpin. This label automatically changes color between white and dark grey depending on which map
    * style is selected. Pushpin Titles support label collision detection, as described below.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

