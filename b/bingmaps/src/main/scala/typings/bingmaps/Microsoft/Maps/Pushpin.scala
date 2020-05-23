package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pushpin extends IPrimitive {
  /**
    * Gets the point on the Pushpin icon which is anchored to the pushpin location.
    * An anchor of (0,0) is the top left corner of the icon.
    * @returns The point on the Pushpin icon which is anchored to the pushpin location.
    */
  def getAnchor(): Point
  /**
    * Gets whether the pushpin clicked style is enabled
    * @returns Whether the pushpin clicked style is enabled.
    */
  def getClickedStyleEnabled(): Boolean
  /**
    * Gets the color option of the pushpin.
    * @returns The color option of the pushpin.
    */
  def getColor(): String | Color
  /**
    * Gets a boolean indicating if the pushpin is draggable or not.
    * @returns A boolean indicating if the pushpin is draggable or not.
    */
  def getDraggable(): Boolean
  /**
    * Gets whether the pushpin hover style is enabled
    * @returns Whether the pushpin hover style is enabled.
    */
  def getHoverStyleEnabled(): Boolean
  /**
    * Gets the custom Pushpin source icon string which can be a url to an image or SVG, inline SVG string, or data URI.
    * @returns the custom Pushpin icon source string, which can be a url to an image or SVG, inline SVG string, or data URI.
    */
  def getIcon(): String
  /**
    * Returns the location of the pushpin.
    * @returns The location of the pushpin.
    */
  def getLocation(): Location
  /**
    * Returns whether the clickable area of the pushpin is an ellipse.
    * @returns A boolean indicating whether the clickable area of the pushpin is an ellipse.
    */
  def getRoundClickableArea(): Boolean
  /**
    * Gets the subtitle label of the Pushpin.
    * @returns The subtitle label of the Pushpin.
    */
  def getSubTitle(): String
  /**
    * Gets the text within the Pushpin icon.
    * @returns The text within the Pushpin icon.
    */
  def getText(): String
  /**
    * Gets the amount the text is shifted from the Pushpin icon.
    * @returns the amount the text is shifted from the Pushpin icon.
    */
  def getTextOffset(): Point
  /**
    * Gets the title label of the Pushpin.
    * @returns the title label of the Pushpin.
    */
  def getTitle(): String
  /**
    * Sets the location of the Pushpin.
    * @param location The location of the Pushpin.
    */
  def setLocation(location: Location): Unit
  /**
    * Sets the properties for the pushpin.
    * @param options The IPushpinOptions object containing the options to customize the pushpin.
    */
  def setOptions(options: IPushpinOptions): Unit
}

object Pushpin {
  @scala.inline
  def apply(
    getAnchor: () => Point,
    getClickedStyleEnabled: () => Boolean,
    getColor: () => String | Color,
    getCursor: () => String,
    getDraggable: () => Boolean,
    getHoverStyleEnabled: () => Boolean,
    getIcon: () => String,
    getLocation: () => Location,
    getRoundClickableArea: () => Boolean,
    getSubTitle: () => String,
    getText: () => String,
    getTextOffset: () => Point,
    getTitle: () => String,
    getVisible: () => Boolean,
    setLocation: Location => Unit,
    setOptions: IPushpinOptions => Unit,
    metadata: js.Any = null
  ): Pushpin = {
    val __obj = js.Dynamic.literal(getAnchor = js.Any.fromFunction0(getAnchor), getClickedStyleEnabled = js.Any.fromFunction0(getClickedStyleEnabled), getColor = js.Any.fromFunction0(getColor), getCursor = js.Any.fromFunction0(getCursor), getDraggable = js.Any.fromFunction0(getDraggable), getHoverStyleEnabled = js.Any.fromFunction0(getHoverStyleEnabled), getIcon = js.Any.fromFunction0(getIcon), getLocation = js.Any.fromFunction0(getLocation), getRoundClickableArea = js.Any.fromFunction0(getRoundClickableArea), getSubTitle = js.Any.fromFunction0(getSubTitle), getText = js.Any.fromFunction0(getText), getTextOffset = js.Any.fromFunction0(getTextOffset), getTitle = js.Any.fromFunction0(getTitle), getVisible = js.Any.fromFunction0(getVisible), setLocation = js.Any.fromFunction1(setLocation), setOptions = js.Any.fromFunction1(setOptions))
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
}

