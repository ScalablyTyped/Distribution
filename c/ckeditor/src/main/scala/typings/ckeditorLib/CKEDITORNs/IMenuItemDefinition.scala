package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuItemDefinition extends js.Object {
  var command: java.lang.String
  var group: java.lang.String
  var icon: java.lang.String
  var label: java.lang.String
  var order: scala.Double
}

object IMenuItemDefinition {
  @scala.inline
  def apply(
    command: java.lang.String,
    group: java.lang.String,
    icon: java.lang.String,
    label: java.lang.String,
    order: scala.Double
  ): IMenuItemDefinition = {
    val __obj = js.Dynamic.literal(command = command, group = group, icon = icon, label = label, order = order)
  
    __obj.asInstanceOf[IMenuItemDefinition]
  }
}

