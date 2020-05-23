package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boundary extends js.Object {
  def get(name: String, callback: js.Function1[/* result */ js.Array[String], Unit]): Unit
}

object Boundary {
  @scala.inline
  def apply(get: (String, js.Function1[/* result */ js.Array[String], Unit]) => Unit): Boundary = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Boundary]
  }
}

