package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  //arguments of create() is same as init(). This is true for all subclasses
  def create(args: js.Any*): Base = js.native
  def extend(overrides: js.Object): js.Object = js.native
  def init(args: js.Any*): Unit = js.native
  def mixIn(properties: js.Object): Unit = js.native
}

object Base {
  @scala.inline
  def apply(
    create: /* repeated */ js.Any => Base,
    extend: js.Object => js.Object,
    init: /* repeated */ js.Any => Unit,
    mixIn: js.Object => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn))
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setCreate(value: /* repeated */ js.Any => Base): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: js.Object => js.Object): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setInit(value: /* repeated */ js.Any => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setMixIn(value: js.Object => Unit): Self = this.set("mixIn", js.Any.fromFunction1(value))
  }
  
}

