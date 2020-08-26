package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pushpin extends IPrimitive {
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
    * Sets the location of the Pushpin.
    * @param location The location of the Pushpin.
    */
  def setLocation(location: Location): Unit = js.native
  /**
    * Sets the properties for the pushpin.
    * @param options The IPushpinOptions object containing the options to customize the pushpin.
    */
  def setOptions(options: IPushpinOptions): Unit = js.native
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
    setOptions: IPushpinOptions => Unit
  ): Pushpin = {
    val __obj = js.Dynamic.literal(getAnchor = js.Any.fromFunction0(getAnchor), getClickedStyleEnabled = js.Any.fromFunction0(getClickedStyleEnabled), getColor = js.Any.fromFunction0(getColor), getCursor = js.Any.fromFunction0(getCursor), getDraggable = js.Any.fromFunction0(getDraggable), getHoverStyleEnabled = js.Any.fromFunction0(getHoverStyleEnabled), getIcon = js.Any.fromFunction0(getIcon), getLocation = js.Any.fromFunction0(getLocation), getRoundClickableArea = js.Any.fromFunction0(getRoundClickableArea), getSubTitle = js.Any.fromFunction0(getSubTitle), getText = js.Any.fromFunction0(getText), getTextOffset = js.Any.fromFunction0(getTextOffset), getTitle = js.Any.fromFunction0(getTitle), getVisible = js.Any.fromFunction0(getVisible), setLocation = js.Any.fromFunction1(setLocation), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Pushpin]
  }
  @scala.inline
  implicit class PushpinOps[Self <: Pushpin] (val x: Self) extends AnyVal {
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
    def setGetAnchor(value: () => Point): Self = this.set("getAnchor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClickedStyleEnabled(value: () => Boolean): Self = this.set("getClickedStyleEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColor(value: () => String | Color): Self = this.set("getColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDraggable(value: () => Boolean): Self = this.set("getDraggable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHoverStyleEnabled(value: () => Boolean): Self = this.set("getHoverStyleEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIcon(value: () => String): Self = this.set("getIcon", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocation(value: () => Location): Self = this.set("getLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRoundClickableArea(value: () => Boolean): Self = this.set("getRoundClickableArea", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubTitle(value: () => String): Self = this.set("getSubTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextOffset(value: () => Point): Self = this.set("getTextOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setSetLocation(value: Location => Unit): Self = this.set("setLocation", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptions(value: IPushpinOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
  
}

