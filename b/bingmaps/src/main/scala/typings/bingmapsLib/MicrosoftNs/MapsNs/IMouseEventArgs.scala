package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMouseEventArgs extends ILayerMouseEventArgs {
  /** The event that occurred. */
  var eventName: java.lang.String
  /** A boolean indicating if the primary button, such as the left mouse button or a tap on a touch screen, was used during a mouse down or up event. */
  var isPrimary: scala.Boolean
  /** A boolean indicating if the secondary mouse button, such as the right mouse button, was used during a mouse down or up event. */
  var isSecondary: scala.Boolean
  /** If the target is a shape, this will be the layer that the shape is in. */
  var layer: Layer
  /** The map location of where the event occurred. */
  var location: Location
  /** The x-value of the pixel coordinate on the page of the mouse cursor. */
  var pageX: scala.Double
  /** The y-value of the pixel coordinate on the page of the mouse cursor. */
  var pageY: scala.Double
  /** The pixel coordinate of the mouse cusrsor relative to the top left corner of the map div. */
  var point: Point
  /** The object that triggered the event. */
  var target: Map | IPrimitive
  /** The type of the object that the event is attached to. Valid values include the following: ‘map’, 'layer', ‘polygon’, ‘polyline’, or ‘pushpin’ */
  var targetType: java.lang.String
  /**	The number of units that the mouse wheel has changed. */
  var wheelDelta: scala.Double
  /**
          * Returns the x-value of the pixel coordinate, relative to the map, of the mouse.
          * @returns The x-value of the pixel coordinate, relative to the map, of the mouse.
          */
  def getX(): scala.Double
  /**
          * Returns the y-value of the pixel coordinate, relative to the map, of the mouse.
          * @returns The y-value of the pixel coordinate, relative to the map, of the mouse.
          */
  def getY(): scala.Double
}

