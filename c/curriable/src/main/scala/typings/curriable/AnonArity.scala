package typings.curriable

import typings.curriable.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArity[Fn /* <: Handler */] extends js.Object {
  var arity: Double
  var fn: Fn
}

object AnonArity {
  @scala.inline
  def apply[Fn /* <: Handler */](arity: Double, fn: Fn): AnonArity[Fn] = {
    val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArity[Fn]]
  }
}

