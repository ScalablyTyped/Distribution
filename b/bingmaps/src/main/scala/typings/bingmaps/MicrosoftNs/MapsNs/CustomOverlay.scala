package typings.bingmaps.MicrosoftNs.MapsNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.CustomOverlay")
@js.native
/**
  * @constructor
  * @param options The options to use when initializing the custom overlay.
  */
class CustomOverlay () extends ILayer {
  def this(options: ICustomOverlayOptions) = this()
  /** A reference the the map instance that the overlay was added to. This will be null until the onLoad function has fired. **/
  var _map: Map = js.native
  /**
    * Gets the html element of this custom overlay.
    * @returns The htmlElement of this overlay.
    */
  def getHtmlElement(): HTMLElement = js.native
  /**
    * Gets the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  def getMap(): Map = js.native
  /**
    * Implement this method to perform any task that should be done when the overlay is added to the map.
    */
  def onAdd(): Unit = js.native
  /**
    * Implement this method to perform any tasks that should be done when the overlay is removed from the map.
    */
  def onLoad(): Unit = js.native
  /**
    * Implement this methof to perform any task that should be done after the overlay has been added to the map.
    */
  def onRemove(): Unit = js.native
  /**
    * Updates the html element of this custom overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  def setHtmlElement(htmlElement: HTMLElement): Unit = js.native
}

