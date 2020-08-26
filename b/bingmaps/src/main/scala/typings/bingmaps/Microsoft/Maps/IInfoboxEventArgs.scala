package typings.bingmaps.Microsoft.Maps

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInfoboxEventArgs extends js.Object {
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
  implicit class IInfoboxEventArgsOps[Self <: IInfoboxEventArgs] (val x: Self) extends AnyVal {
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
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Infobox): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetType(value: String): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
  
}

