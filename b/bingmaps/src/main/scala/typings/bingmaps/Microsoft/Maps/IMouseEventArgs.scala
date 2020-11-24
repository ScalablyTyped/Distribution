package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseEventArgs extends ILayerMouseEventArgs {
  
  /** The event that occurred. */
  var eventName: String = js.native
  
  /**
    * Returns the x-value of the pixel coordinate, relative to the map, of the mouse.
    * @returns The x-value of the pixel coordinate, relative to the map, of the mouse.
    */
  def getX(): Double = js.native
  
  /**
    * Returns the y-value of the pixel coordinate, relative to the map, of the mouse.
    * @returns The y-value of the pixel coordinate, relative to the map, of the mouse.
    */
  def getY(): Double = js.native
  
  /** A boolean indicating if the primary button, such as the left mouse button or a tap on a touch screen, was used during a mouse down or up event. */
  var isPrimary: Boolean = js.native
  
  /** A boolean indicating if the secondary mouse button, such as the right mouse button, was used during a mouse down or up event. */
  var isSecondary: Boolean = js.native
  
  /** If the target is a shape, this will be the layer that the shape is in. */
  var layer: Layer = js.native
  
  /** The map location of where the event occurred. */
  var location: Location = js.native
  
  /** The x-value of the pixel coordinate on the page of the mouse cursor. */
  var pageX: Double = js.native
  
  /** The y-value of the pixel coordinate on the page of the mouse cursor. */
  var pageY: Double = js.native
  
  /** The pixel coordinate of the mouse cusrsor relative to the top left corner of the map div. */
  var point: Point = js.native
  
  /** The object that triggered the event. */
  var target: Map | IPrimitive = js.native
  
  /** The type of the object that the event is attached to. Valid values include the following: ‘map’, 'layer', ‘polygon’, ‘polyline’, or ‘pushpin’ */
  var targetType: String = js.native
  
  /**	The number of units that the mouse wheel has changed. */
  var wheelDelta: Double = js.native
}
object IMouseEventArgs {
  
  @scala.inline
  def apply(
    eventName: String,
    getX: () => Double,
    getY: () => Double,
    isPrimary: Boolean,
    isSecondary: Boolean,
    layer: Layer,
    location: Location,
    pageX: Double,
    pageY: Double,
    point: Point,
    primitive: IPrimitive,
    target: Map | IPrimitive,
    targetType: String,
    wheelDelta: Double
  ): IMouseEventArgs = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), isPrimary = isPrimary.asInstanceOf[js.Any], isSecondary = isSecondary.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], primitive = primitive.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], wheelDelta = wheelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArgs]
  }
  
  @scala.inline
  implicit class IMouseEventArgsOps[Self <: IMouseEventArgs] (val x: Self) extends AnyVal {
    
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
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetX(value: () => Double): Self = this.set("getX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("getY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecondary(value: Boolean): Self = this.set("isSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Map | IPrimitive): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: String): Self = this.set("targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDelta(value: Double): Self = this.set("wheelDelta", value.asInstanceOf[js.Any])
  }
}
