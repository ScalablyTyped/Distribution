package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.AnonItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionBindTo[T, K] extends js.Object {
  def as(Class: AnonItem[T, K]): Unit = js.native
  def using(callbackOrProperty: String): Unit = js.native
  def using(callbackOrProperty: js.Function1[/* item */ T, K]): Unit = js.native
}

