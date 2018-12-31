package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoboxEventArgs extends js.Object {
  /** The event that occurred. **/
  var eventName: java.lang.String
  /** Original mouse event from the browser. */
  var originalEvent: js.UndefOr[stdLib.MouseEvent] = js.undefined
  /** The x-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageX: scala.Double
  /** The y-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageY: scala.Double
  /** The infobox object that fired the event. **/
  var target: Infobox
  /** The type of the object that fired the event.This will always be 'infobox'. **/
  var targetType: java.lang.String
}

