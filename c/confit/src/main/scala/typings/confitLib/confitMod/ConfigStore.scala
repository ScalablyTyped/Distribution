package typings
package confitLib.confitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStore extends js.Object {
  def get(name: java.lang.String): js.Any
  def set[T](name: java.lang.String, newValue: T): T
  def use(newSettings: js.Object): scala.Unit
}

object ConfigStore {
  @scala.inline
  def apply(
    get: java.lang.String => js.Any,
    set: (java.lang.String, js.Any) => js.Any,
    use: js.Object => scala.Unit
  ): ConfigStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), use = js.Any.fromFunction1(use))
  
    __obj.asInstanceOf[ConfigStore]
  }
}

