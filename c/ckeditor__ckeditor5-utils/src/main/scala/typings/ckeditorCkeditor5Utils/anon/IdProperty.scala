package typings.ckeditorCkeditor5Utils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdProperty[T] extends js.Object {
  var idProperty: js.UndefOr[/* keyof T */ String] = js.undefined
}

object IdProperty {
  @scala.inline
  def apply[T](idProperty: /* keyof T */ String = null): IdProperty[T] = {
    val __obj = js.Dynamic.literal()
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdProperty[T]]
  }
}

