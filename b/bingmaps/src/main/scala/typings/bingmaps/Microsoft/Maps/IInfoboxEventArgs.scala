package typings.bingmaps.Microsoft.Maps

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInfoboxEventArgs extends StObject {
  
  /** The event that occurred. **/
  var eventName: String = js.native
  
  /** Original mouse event from the browser. */
  var originalEvent: js.UndefOr[MouseEvent] = js.native
  
  /** The x-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageX: Double = js.native
  
  /** The y-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageY: Double = js.native
  
  /** The infobox object that fired the event. **/
  var target: Infobox = js.native
  
  /** The type of the object that fired the event.This will always be 'infobox'. **/
  var targetType: String = js.native
}
object IInfoboxEventArgs {
  
  @scala.inline
  def apply(eventName: String, pageX: Double, pageY: Double, target: Infobox, targetType: String): IInfoboxEventArgs = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoboxEventArgs]
  }
  
  @scala.inline
  implicit class IInfoboxEventArgsMutableBuilder[Self <: IInfoboxEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Infobox): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
