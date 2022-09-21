package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IGroundOverlayOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A map overlay that binds an image to a bounding box area on the map.
  */
@JSGlobal("Microsoft.Maps.GroundOverlay")
@js.native
open class GroundOverlay protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.GroundOverlay {
  /**
    * @constructor
    * @param options The options used to render the ground overlay.
    */
  def this(options: IGroundOverlayOptions) = this()
  
  /** A reference the the map instance that the overlay was added to. This will be null until the onLoad function has fired. **/
  /* CompleteClass */
  var _map: typings.bingmaps.Microsoft.Maps.Map = js.native
  
  /**
    * Gets the background color of the ground overlay.
    * @returns The background color of the ground overlay.
    */
  /* CompleteClass */
  override def getBackgroundColor(): String | typings.bingmaps.Microsoft.Maps.Color = js.native
  
  /**
    * Gets the bounding box that the ground overlay is bounded to.
    * @returns The bounding box that the ground overlay is bounded to.
    */
  /* CompleteClass */
  override def getBounds(): typings.bingmaps.Microsoft.Maps.LocationRect = js.native
  
  /**
    * Gets the html element of this custom overlay.
    * @returns The htmlElement of this overlay.
    */
  /* CompleteClass */
  override def getHtmlElement(): HTMLElement = js.native
  
  /**
    * Gets the url to the ground overlay image.
    * @returns The url to the ground overlay image.
    */
  /* CompleteClass */
  override def getImageUrl(): String = js.native
  
  /**
    * Gets the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  /* CompleteClass */
  override def getMap(): typings.bingmaps.Microsoft.Maps.Map = js.native
  
  /**
    * Gets the opacity of the ground overlay.
    * @returns The opacity of the ground overlay.
    */
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  
  /**
    * Gets the rotation of the ground overlay.
    * @returns The rotation of the ground overlay.
    */
  /* CompleteClass */
  override def getRotation(): Double = js.native
  
  /**
    * Gets a boolean indicating if the ground overlay is visible or not.
    * @returns A boolean indicating if the ground overlay is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  
  /** Optional property to store any additional metadata for this layer. */
  /* CompleteClass */
  var metadata: Any = js.native
  
  /**
    * Implement this method to perform any task that should be done when the overlay is added to the map.
    */
  /* CompleteClass */
  override def onAdd(): Unit = js.native
  
  /**
    * Implement this method to perform any tasks that should be done when the overlay is removed from the map.
    */
  /* CompleteClass */
  override def onLoad(): Unit = js.native
  
  /**
    * Implement this methof to perform any task that should be done after the overlay has been added to the map.
    */
  /* CompleteClass */
  override def onRemove(): Unit = js.native
  
  /**
    * Updates the html element of this custom overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  /* CompleteClass */
  override def setHtmlElement(htmlElement: HTMLElement): Unit = js.native
  
  /**
    * Sets the options used to render the ground overlay.
    * @param options The options used to render the ground overlay.
    */
  /* CompleteClass */
  override def setOptions(options: IGroundOverlayOptions): Unit = js.native
  
  /**
    * Sets the visibility of the Ground Overlay.
    * @param value A value indicating if the Ground Overlay should be displayed or not.
    */
  /* CompleteClass */
  override def setVisible(visible: Boolean): Unit = js.native
}
