package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.KmlScreenOverlay")
@js.native
/**
  * @constructor
  * @param htmlElement The new htmlElement to set for the overlay.
  * @param options The options to customize the screen overlay.
  */
class KmlScreenOverlay () extends js.Object {
  def this(htmlElement: java.lang.String) = this()
  def this(htmlElement: stdLib.HTMLElement) = this()
  def this(htmlElement: java.lang.String, options: IKmlScreenOverlayOptions) = this()
  def this(htmlElement: stdLib.HTMLElement, options: IKmlScreenOverlayOptions) = this()
  /** Optional property to store any additional metadata for this overlay. */
  var metadata: js.Any = js.native
  /**
    * Clears the screen overlay.
    */
  def clear(): scala.Unit = js.native
  /**
    * Gets a boolean indicating if the screen overlay is displayed above or below the navigation bar.
    * @returns A boolean indicating if the screen overlay is displayed above or below the navigation bar.
    */
  def getBelowNavigationBar(): scala.Boolean = js.native
  /**
    * Gets the html element of this screen overlay.
    * @returns the htmlElement of this overlay.
    */
  def getHtmlElement(): stdLib.HTMLElement = js.native
  /**
    * Returns the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  def getMap(): Map = js.native
  /**
    * Gets a boolean indicating if the screen overlay is visible or not.
    * @returns A boolean indicating if the screen overlay is visible or not.
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Updates the html element of this screen overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  def setHtmlElement(htmlElement: java.lang.String): scala.Unit = js.native
  def setHtmlElement(htmlElement: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Sets the options to customize the screen overlay.
    * @param options The options to customize the screen overlay.
    */
  def setOptions(options: IKmlScreenOverlayOptions): scala.Unit = js.native
  /**
    * Sets whether the overlay is visible or not.
    * @param value A value indicating if the overlay should be displayed or not.
    */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
}

