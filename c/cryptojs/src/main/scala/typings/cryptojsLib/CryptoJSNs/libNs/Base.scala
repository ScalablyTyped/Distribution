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
    clone: js.Function0[Base],
    create: js.Function1[/* repeated */ js.Any, Base],
    extend: js.Function1[js.Object, js.Object],
    init: js.Function1[/* repeated */ js.Any, scala.Unit],
    mixIn: js.Function1[js.Object, scala.Unit]
  ): Base = {
    val __obj = js.Dynamic.literal(clone = clone, create = create, extend = extend, init = init, mixIn = mixIn)
  
    __obj.asInstanceOf[Base]
  }
}

