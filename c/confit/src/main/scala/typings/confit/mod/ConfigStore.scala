package typings.confit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigStore extends js.Object {
  def get(name: String): js.Any = js.native
  def set[T](name: String, newValue: T): T = js.native
  def use(newSettings: js.Object): Unit = js.native
}

object ConfigStore {
  @scala.inline
  def apply(get: String => js.Any, set: (String, js.Any) => js.Any, use: js.Object => Unit): ConfigStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), use = js.Any.fromFunction1(use))
    __obj.asInstanceOf[ConfigStore]
  }
  @scala.inline
  implicit class ConfigStoreOps[Self <: ConfigStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, js.Any) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setUse(value: js.Object => Unit): Self = this.set("use", js.Any.fromFunction1(value))
  }
  
}

