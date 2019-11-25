package typings.curriable

import typings.curriable.curriableMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arity[Fn /* <: Handler */] extends js.Object {
  var arity: Double
  var fn: Fn
}

object Anon_Arity {
  @scala.inline
  def apply[Fn /* <: Handler */](arity: Double, fn: Fn): Anon_Arity[Fn] = {
    val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arity[Fn]]
  }
}

