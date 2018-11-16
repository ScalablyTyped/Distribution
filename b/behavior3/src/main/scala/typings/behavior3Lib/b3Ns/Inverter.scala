package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Inverter decorator inverts the result of the child, returning `SUCCESS`
     * for `FAILURE` and `FAILURE` for `SUCCESS`.
     *
     */
@JSGlobal("b3.Inverter")
@js.native
class Inverter () extends Decorator {
  /**
           * Creates an instance of Inverter.
           */
  def this(hasChild: behavior3Lib.Anon_Child) = this()
}

