package typings.curriable.anon

import typings.curriable.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arity[Fn /* <: Handler */] extends js.Object {
  var arity: Double
  var fn: Fn
}

object Arity {
  @scala.inline
  def apply[Fn](arity: Double, fn: Fn): Arity[Fn] = {
    val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arity[Fn]]
  }
}

