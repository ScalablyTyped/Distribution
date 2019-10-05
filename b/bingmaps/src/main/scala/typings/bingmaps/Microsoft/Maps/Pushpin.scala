package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Pushpin")
@js.native
class Pushpin protected () extends IPrimitive {
  /**
    * @constructor
    * @param location A Location object that specifies where to display the pushpin.
    * @param options Options used when creating the Pushpin.
    */
  def this(location: Location) = this()
  def this(location: Location, options: IPushpinOptions) = this()
  /**
    * Gets the point on the Pushpin icon which is anchored to the pushpin location.
    * An anchor of (0,0) is the top left corner of the icon.
    * @returns The point on the Pushpin icon which is anchored to the pushpin location.
    */
  def getAnchor(): Point = js.native
  /**
    * Gets whether the pushpin clicked style is enabled
    * @returns Whether the pushpin clicked style is enabled.
    */
  def getClickedStyleEnabled(): Boolean = js.native
  /**
    * Gets the color option of the pushpin.
    * @returns The color option of the pushpin.
    */
  def getColor(): String | Color = js.native
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  /* CompleteClass */
  override def getCursor(): String = js.native
  /**
    * Gets a boolean indicating if the pushpin is draggable or not.
    * @returns A boolean indicating if the pushpin is draggable or not.
    */
  def getDraggable(): Boolean = js.native
  /**
    * Gets whether the pushpin hover style is enabled
    * @returns Whether the pushpin hover style is enabled.
    */
  def getHoverStyleEnabled(): Boolean = js.native
  /**
    * Gets the custom Pushpin source icon string which can be a url to an image or SVG, inline SVG string, or data URI.
    * @returns the custom Pushpin icon source string, which can be a url to an image or SVG, inline SVG string, or data URI.
    */
  def getIcon(): String = js.native
  /**
    * Returns the location of the pushpin.
    * @returns The location of the pushpin.
    */
  def getLocation(): Location = js.native
  /**
    * Returns whether the clickable area of the pushpin is an ellipse.
    * @returns A boolean indicating whether the clickable area of the pushpin is an ellipse.
    */
  def getRoundClickableArea(): Boolean = js.native
  /**
    * Gets the subtitle label of the Pushpin.
    * @returns The subtitle label of the Pushpin.
    */
  def getSubTitle(): String = js.native
  /**
    * Gets the text within the Pushpin icon.
    * @returns The text within the Pushpin icon.
    */
  def getText(): String = js.native
  /**
    * Gets the amount the text is shifted from the Pushpin icon.
    * @returns the amount the text is shifted from the Pushpin icon.
    */
  def getTextOffset(): Point = js.native
  /**
    * Gets the title label of the Pushpin.
    * @returns the title label of the Pushpin.
    */
  def getTitle(): String = js.native
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  /**
    * Sets the location of the Pushpin.
    * @param location The location of the Pushpin.
    */
  def setLocation(location: Location): Unit = js.native
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  /* CompleteClass */
  override def setOptions(options: IPrimitiveOptions): Unit = js.native
  /**
    * Sets the properties for the pushpin.
    * @param options The IPushpinOptions object containing the options to customize the pushpin.
    */
  def setOptions(options: IPushpinOptions): Unit = js.native
}

