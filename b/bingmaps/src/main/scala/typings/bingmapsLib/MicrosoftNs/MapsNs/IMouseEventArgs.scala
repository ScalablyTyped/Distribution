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

object IMouseEventArgs {
  @scala.inline
  def apply(
    eventName: java.lang.String,
    getX: js.Function0[scala.Double],
    getY: js.Function0[scala.Double],
    isPrimary: scala.Boolean,
    isSecondary: scala.Boolean,
    layer: Layer,
    location: Location,
    pageX: scala.Double,
    pageY: scala.Double,
    point: Point,
    primitive: IPrimitive,
    target: Map | IPrimitive,
    targetType: java.lang.String,
    wheelDelta: scala.Double
  ): IMouseEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("getX")(getX)
    __obj.updateDynamic("getY")(getY)
    __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.updateDynamic("isSecondary")(isSecondary)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("primitive")(primitive)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("targetType")(targetType)
    __obj.updateDynamic("wheelDelta")(wheelDelta)
    __obj.asInstanceOf[IMouseEventArgs]
  }
}

