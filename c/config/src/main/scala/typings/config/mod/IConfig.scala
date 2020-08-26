package typings.config.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig extends js.Object {
  var util: IUtil = js.native
  def get[T](setting: String): T = js.native
  def has(setting: String): Boolean = js.native
}

object IConfig {
  @scala.inline
  def apply(get: String => js.Any, has: String => Boolean, util: IUtil): IConfig = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
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
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setUtil(value: IUtil): Self = this.set("util", value.asInstanceOf[js.Any])
  }
  
}

