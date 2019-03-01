package typings
package atCkeditorCkeditor5DashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdProperty[T] extends js.Object {
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IdProperty {
  @scala.inline
  def apply[T](idProperty: java.lang.String = null): Anon_IdProperty[T] = {
    val __obj = js.Dynamic.literal()
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    __obj.asInstanceOf[Anon_IdProperty[T]]
  }
}

