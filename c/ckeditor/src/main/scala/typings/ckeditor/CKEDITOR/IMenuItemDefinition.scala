package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuItemDefinition extends js.Object {
  var command: String
  var group: String
  var icon: String
  var label: String
  var order: Double
}

object IMenuItemDefinition {
  @scala.inline
  def apply(command: String, group: String, icon: String, label: String, order: Double): IMenuItemDefinition = {
    val __obj = js.Dynamic.literal(command = command, group = group, icon = icon, label = label, order = order)
  
    __obj.asInstanceOf[IMenuItemDefinition]
  }
}

