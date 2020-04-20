package typings.ckeditorCkeditor5Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdProperty[T] extends js.Object {
  var idProperty: js.UndefOr[/* keyof T */ String] = js.undefined
}

object AnonIdProperty {
  @scala.inline
  def apply[T](idProperty: /* keyof T */ String = null): AnonIdProperty[T] = {
    val __obj = js.Dynamic.literal()
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdProperty[T]]
  }
}

