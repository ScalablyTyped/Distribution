package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubEmitterType extends js.Object

/**
  * Type of sub emitter
  */
@JSGlobal("BABYLON.SubEmitterType")
@js.native
object SubEmitterType extends js.Object {
  /**
    * Attached to the particle over it's lifetime
    */
  @js.native
  sealed trait ATTACHED
    extends babylonjsLib.BABYLONNs.SubEmitterType
  
  /**
    * Created when the particle dies
    */
  @js.native
  sealed trait END
    extends babylonjsLib.BABYLONNs.SubEmitterType
  
  /* 0 */ val ATTACHED: ATTACHED with scala.Double = js.native
  /* 1 */ val END: END with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.SubEmitterType with scala.Double] = js.native
}

