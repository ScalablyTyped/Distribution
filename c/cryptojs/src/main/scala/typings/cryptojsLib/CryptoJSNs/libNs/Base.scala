package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  //arguments of create() is same as init(). This is true for all subclasses
  def create(args: js.Any*): Base
  def extend(overrides: js.Object): js.Object
  def init(args: js.Any*): scala.Unit
  def mixIn(properties: js.Object): scala.Unit
}

object Base {
  @scala.inline
  def apply(
    clone: () => Base,
    create: /* repeated */ js.Any => Base,
    extend: js.Object => js.Object,
    init: /* repeated */ js.Any => scala.Unit,
    mixIn: js.Object => scala.Unit
  ): Base = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn))
  
    __obj.asInstanceOf[Base]
  }
}

