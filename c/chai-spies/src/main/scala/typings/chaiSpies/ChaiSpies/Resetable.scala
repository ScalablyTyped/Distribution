package typings.chaiSpies.ChaiSpies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resetable extends js.Object {
  /**
    * #### proxy.reset (function)
    *
    * Resets __spy object parameters for instantiation and reuse
    * @returns proxy spy object
    */
  def reset(): this.type
}

object Resetable {
  @scala.inline
  def apply(reset: () => Resetable): Resetable = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Resetable]
  }
}

