package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import typings.atCkeditorCkeditor5DashUtils.Anon_Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionBindTo[T, K] extends js.Object {
  def as(Class: Anon_Item[T, K]): Unit = js.native
  def using(callbackOrProperty: String): Unit = js.native
  def using(callbackOrProperty: js.Function1[/* item */ T, K]): Unit = js.native
}

