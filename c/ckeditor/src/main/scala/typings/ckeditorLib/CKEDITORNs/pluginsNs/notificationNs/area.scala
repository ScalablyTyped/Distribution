package typings
package ckeditorLib.CKEDITORNs.pluginsNs.notificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait area extends js.Object {
  val editor: ckeditorLib.CKEDITORNs.editor
  val element: ckeditorLib.CKEDITORNs.domNs.element
  val notifications: js.Array[ckeditorLib.CKEDITORNs.pluginsNs.notification]
  def add(notification: ckeditorLib.CKEDITORNs.pluginsNs.notification): scala.Unit
  def remove(notification: ckeditorLib.CKEDITORNs.pluginsNs.notification): scala.Unit
}

object area {
  @scala.inline
  def apply(
    add: js.Function1[ckeditorLib.CKEDITORNs.pluginsNs.notification, scala.Unit],
    editor: ckeditorLib.CKEDITORNs.editor,
    element: ckeditorLib.CKEDITORNs.domNs.element,
    notifications: js.Array[ckeditorLib.CKEDITORNs.pluginsNs.notification],
    remove: js.Function1[ckeditorLib.CKEDITORNs.pluginsNs.notification, scala.Unit]
  ): area = {
    val __obj = js.Dynamic.literal(add = add, editor = editor, element = element, notifications = notifications, remove = remove)
  
    __obj.asInstanceOf[area]
  }
}

