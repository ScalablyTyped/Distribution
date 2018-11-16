package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Infobox")
@js.native
class Infobox protected () extends js.Object {
  /**
           * @constructor
           * @param location The location to display the infobox at.
           * @param options Options for rendering the infobox.
           */
  def this(location: Location) = this()
  /**
           * @constructor
           * @param location The location to display the infobox at.
           * @param options Options for rendering the infobox.
           */
  def this(location: Location, options: IInfoboxOptions) = this()
  /**
          * @deprecated Use HTML buttons and links in description instead.
          */
  def getActions(): js.Array[IInfoboxActions] = js.native
  /**
          * Gets the point on the infobox which is anchored to the map. An anchor of (0,0) is the top left corner of the infobox.
          * @returns The anchor point of the infobox.
          */
  def getAnchor(): Point = js.native
  /**
          * Gets the string that is printed inside the infobox.
          * @returns The description value of the infobox options.
          */
  def getDescription(): java.lang.String = js.native
  /**
          * Gets the height of the infobox.
          * @returns The height of the infobox.
          */
  def getHeight(): scala.Double = js.native
  /**
          * Gets the infobox as HTML.
          * @returns The HTML string used to create a custom infobox.
          */
  def getHtmlContent(): java.lang.String = js.native
  /**
          * Gets the location on the map where the infobox’s anchor is attached.
          * @returns The location of the infobox.
          */
  def getLocation(): Location = js.native
  /**
           * Gets the maximium height setting for the infobox.
           * @returns the maximium height setting for the infobox.
           */
  def getMaxHeight(): scala.Double = js.native
  /**
           * Gets the maximium width setting for the infobox.
           * @returns the maximium width setting for the infobox.
           */
  def getMaxWidth(): scala.Double = js.native
  /**
          * Gets the amount the infobox pointer is shifted from the location of the infobox, or if showPointer is false, then it is the amount the infobox
          * bottom left edge is shifted from the location of the infobox. The default value is (0,0), which means there is no offset.
          * @returns The offset of the infobox.
          */
  def getOffset(): Point = js.native
  /**
          * Gets the infobox options.
          * @returns The infobox options currently used by the infobox.
          */
  def getOptions(): IInfoboxOptions = js.native
  /**
          * Gets a boolean indicating whether the infobox close button is shown.
          * @returns A boolean indicating if the close button is shown or not.
          */
  def getShowCloseButton(): scala.Boolean = js.native
  /**
          * Gets a boolean indicating whether the infobox is drawn with a pointer.
          * @returns A boolean indicating if the pointer of the infobox is shown or not.
          */
  def getShowPointer(): scala.Boolean = js.native
  /**
          * Gets a string that is the title of the infobox.
          * @returns The title property of the infobox.
          */
  def getTitle(): java.lang.String = js.native
  /**
          * Gets whether the infobox is visible. A value of false indicates that the infobox is hidden, although it is still an entity on the map.
          * @returns A boolean indicating if the infobox is visible or not.
          */
  def getVisible(): scala.Boolean = js.native
  /**
          * Gets the width of the infobox.
          * @returns The width of the infobox.
          */
  def getWidth(): scala.Double = js.native
  /**
          * Gets the z-index of the infobox.
          * @returns The z-index of the infobox.
          */
  def getZIndex(): scala.Double = js.native
  /**
          * Sets the HTML content of the infobox. You can use this method to change the look of the infobox. Note that infobox options are ignored if
          * custom HTML is set. Also, when custom HTML is used to represent the infobox, the infobox is anchored at the bottom-left corner.
          * @param content The HTML string to use to generate the infobox.
          */
  def setHtmlContent(content: java.lang.String): scala.Unit = js.native
  /**
          * Sets the location on the map where the anchor of the infobox is attached.
          * @param loc The location to display the infobox at.
          */
  def setLocation(loc: Location): scala.Unit = js.native
  /**
           * Adds the infobox to the map. To remove an Infobox from the map, simply pass null into this function.
           * @param map A map instance to display the infoboox on, or null if removing infobox from map.
           */
  def setMap(map: Map): scala.Unit = js.native
  /**
          * Sets options for the infobox. If the ignoreDelay parameter is set to true, the closeDelayTime will be ignored if the visible option is being changed from true to false.
          * @param options The options to assign to the infobox.
          */
  def setOptions(options: IInfoboxOptions): scala.Unit = js.native
  /**
          * Sets options for the infobox. If the ignoreDelay parameter is set to true, the closeDelayTime will be ignored if the visible option is being changed from true to false.
          * @param options The options to assign to the infobox.
          */
  def setOptions(options: IInfoboxOptions, ignoreDelay: scala.Boolean): scala.Unit = js.native
}

