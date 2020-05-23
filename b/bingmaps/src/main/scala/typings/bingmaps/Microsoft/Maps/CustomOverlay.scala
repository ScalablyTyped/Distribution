package typings.bingmaps.Microsoft.Maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomOverlay extends ILayer {
  /** A reference the the map instance that the overlay was added to. This will be null until the onLoad function has fired. **/
  var _map: Map
  /**
    * Gets the html element of this custom overlay.
    * @returns The htmlElement of this overlay.
    */
  def getHtmlElement(): HTMLElement
  /**
    * Gets the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  def getMap(): Map
  /**
    * Implement this method to perform any task that should be done when the overlay is added to the map.
    */
  def onAdd(): Unit
  /**
    * Implement this method to perform any tasks that should be done when the overlay is removed from the map.
    */
  def onLoad(): Unit
  /**
    * Implement this methof to perform any task that should be done after the overlay has been added to the map.
    */
  def onRemove(): Unit
  /**
    * Updates the html element of this custom overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  def setHtmlElement(htmlElement: HTMLElement): Unit
}

object CustomOverlay {
  @scala.inline
  def apply(
    _map: Map,
    getHtmlElement: () => HTMLElement,
    getMap: () => Map,
    onAdd: () => Unit,
    onLoad: () => Unit,
    onRemove: () => Unit,
    setHtmlElement: HTMLElement => Unit
  ): CustomOverlay = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], getHtmlElement = js.Any.fromFunction0(getHtmlElement), getMap = js.Any.fromFunction0(getMap), onAdd = js.Any.fromFunction0(onAdd), onLoad = js.Any.fromFunction0(onLoad), onRemove = js.Any.fromFunction0(onRemove), setHtmlElement = js.Any.fromFunction1(setHtmlElement))
    __obj.asInstanceOf[CustomOverlay]
  }
}

