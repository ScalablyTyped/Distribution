package typings.bingmaps.Microsoft.Maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomOverlay extends ILayer {
  
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
  
  @scala.inline
  implicit class CustomOverlayOps[Self <: CustomOverlay] (val x: Self) extends AnyVal {
    
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
    def set_map(value: Map): Self = this.set("_map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHtmlElement(value: () => HTMLElement): Self = this.set("getHtmlElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMap(value: () => Map): Self = this.set("getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAdd(value: () => Unit): Self = this.set("onAdd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRemove(value: () => Unit): Self = this.set("onRemove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHtmlElement(value: HTMLElement => Unit): Self = this.set("setHtmlElement", js.Any.fromFunction1(value))
  }
}
