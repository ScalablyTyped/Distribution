package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IGeoXmlLayerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.GeoXmlLayer")
@js.native
/**
  * @constructor
  * @param dataSource The XML as a string, URL or ArrayBuffer to read.
  * @param isUrl Whether the dataSource provided is an URL. Default = true
  * @param options The options used to render the layer.
  */
open class GeoXmlLayer ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.GeoXmlLayer {
  def this(dataSource: String) = this()
  def this(dataSource: js.typedarray.ArrayBuffer) = this()
  def this(dataSource: String, isUrl: Boolean) = this()
  def this(dataSource: js.typedarray.ArrayBuffer, isUrl: Boolean) = this()
  def this(dataSource: Unit, isUrl: Boolean) = this()
  def this(dataSource: String, isUrl: Boolean, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: String, isUrl: Unit, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: js.typedarray.ArrayBuffer, isUrl: Boolean, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: js.typedarray.ArrayBuffer, isUrl: Unit, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: Unit, isUrl: Boolean, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: Unit, isUrl: Unit, options: IGeoXmlLayerOptions) = this()
  
  /** A reference the the map instance that the overlay was added to. This will be null until the onLoad function has fired. **/
  /* CompleteClass */
  var _map: typings.bingmaps.Microsoft.Maps.Map = js.native
  
  /**
    * Gets the html element of this custom overlay.
    * @returns The htmlElement of this overlay.
    */
  /* CompleteClass */
  override def getHtmlElement(): HTMLElement = js.native
  
  /**
    * Gets the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  /* CompleteClass */
  override def getMap(): typings.bingmaps.Microsoft.Maps.Map = js.native
  
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
}
