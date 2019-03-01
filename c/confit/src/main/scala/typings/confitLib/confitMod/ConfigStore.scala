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
    get: js.Function1[java.lang.String, js.Any],
    set: js.Function2[java.lang.String, js.Any, js.Any],
    use: js.Function1[js.Object, scala.Unit]
  ): ConfigStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[ConfigStore]
  }
}

