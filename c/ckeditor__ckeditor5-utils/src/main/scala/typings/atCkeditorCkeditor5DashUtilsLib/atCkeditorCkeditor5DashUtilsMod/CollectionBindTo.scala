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
    as: atCkeditorCkeditor5DashUtilsLib.Anon_Item[T, K] => scala.Unit,
    using: java.lang.String => scala.Unit
  ): CollectionBindTo[T, K] = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), using = js.Any.fromFunction1(using))
  
    __obj.asInstanceOf[CollectionBindTo[T, K]]
  }
}

