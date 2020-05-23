package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalCity extends js.Object {
  def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit
}

object LocalCity {
  @scala.inline
  def apply(get: js.Function1[/* result */ LocalCityResult, Unit] => Unit): LocalCity = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[LocalCity]
  }
}

