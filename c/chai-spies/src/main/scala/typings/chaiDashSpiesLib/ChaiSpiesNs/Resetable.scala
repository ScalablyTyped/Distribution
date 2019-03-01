package typings
package chaiDashSpiesLib.ChaiSpiesNs

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
  def apply(reset: js.Function0[Resetable]): Resetable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Resetable]
  }
}

