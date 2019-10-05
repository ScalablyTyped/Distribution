package typings.bingmaps.Microsoft.Maps

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoboxEventArgs extends js.Object {
  /** The event that occurred. **/
  var eventName: String
  /** Original mouse event from the browser. */
  var originalEvent: js.UndefOr[MouseEvent] = js.undefined
  /** The x-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageX: Double
  /** The y-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageY: Double
  /** The infobox object that fired the event. **/
  var target: Infobox
  /** The type of the object that fired the event.This will always be 'infobox'. **/
  var targetType: String
}

object IInfoboxEventArgs {
  @scala.inline
  def apply(
    eventName: String,
    pageX: Double,
    pageY: Double,
    target: Infobox,
    targetType: String,
    originalEvent: MouseEvent = null
  ): IInfoboxEventArgs = {
    val __obj = js.Dynamic.literal(eventName = eventName, pageX = pageX, pageY = pageY, target = target, targetType = targetType)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[IInfoboxEventArgs]
  }
}

