package typings.confit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStore extends js.Object {
  def get(name: String): js.Any
  def set[T](name: String, newValue: T): T
  def use(newSettings: js.Object): Unit
}

object ConfigStore {
  @scala.inline
  def apply(get: String => js.Any, set: (String, js.Any) => js.Any, use: js.Object => Unit): ConfigStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), use = js.Any.fromFunction1(use))
    __obj.asInstanceOf[ConfigStore]
  }
}

