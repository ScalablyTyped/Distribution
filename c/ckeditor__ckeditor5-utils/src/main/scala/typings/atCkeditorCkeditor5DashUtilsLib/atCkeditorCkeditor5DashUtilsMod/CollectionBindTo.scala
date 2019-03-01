package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBindTo[T, K] extends js.Object {
  def as(Class: atCkeditorCkeditor5DashUtilsLib.Anon_Item[T, K]): scala.Unit
  def using(callbackOrProperty: java.lang.String): scala.Unit
}

object CollectionBindTo {
  @scala.inline
  def apply[T, K](
    as: js.Function1[atCkeditorCkeditor5DashUtilsLib.Anon_Item[T, K], scala.Unit],
    using: js.Function1[java.lang.String, scala.Unit]
  ): CollectionBindTo[T, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("using")(using)
    __obj.asInstanceOf[CollectionBindTo[T, K]]
  }
}

