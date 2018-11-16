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

