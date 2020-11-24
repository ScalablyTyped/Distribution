package typings.bingmaps.Microsoft.Maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlScreenOverlay extends js.Object {
  
  /**
    * Clears the screen overlay.
    */
  def clear(): Unit = js.native
  
  /**
    * Gets a boolean indicating if the screen overlay is displayed above or below the navigation bar.
    * @returns A boolean indicating if the screen overlay is displayed above or below the navigation bar.
    */
  def getBelowNavigationBar(): Boolean = js.native
  
  /**
    * Gets the html element of this screen overlay.
    * @returns the htmlElement of this overlay.
    */
  def getHtmlElement(): HTMLElement = js.native
  
  /**
    * Returns the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  def getMap(): Map = js.native
  
  /**
    * Gets a boolean indicating if the screen overlay is visible or not.
    * @returns A boolean indicating if the screen overlay is visible or not.
    */
  def getVisible(): Boolean = js.native
  
  /** Optional property to store any additional metadata for this overlay. */
  var metadata: js.Any = js.native
  
  /**
    * Updates the html element of this screen overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  def setHtmlElement(htmlElement: String): Unit = js.native
  def setHtmlElement(htmlElement: HTMLElement): Unit = js.native
  
  /**
    * Sets the options to customize the screen overlay.
    * @param options The options to customize the screen overlay.
    */
  def setOptions(options: IKmlScreenOverlayOptions): Unit = js.native
  
  /**
    * Sets whether the overlay is visible or not.
    * @param value A value indicating if the overlay should be displayed or not.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
