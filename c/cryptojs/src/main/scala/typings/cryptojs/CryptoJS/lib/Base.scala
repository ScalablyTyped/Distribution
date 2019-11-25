package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  //arguments of create() is same as init(). This is true for all subclasses
  def create(args: js.Any*): Base
  def extend(overrides: js.Object): js.Object
  def init(args: js.Any*): Unit
  def mixIn(properties: js.Object): Unit
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
}

