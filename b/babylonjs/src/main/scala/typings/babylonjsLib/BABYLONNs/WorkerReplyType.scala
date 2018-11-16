package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkerReplyType extends js.Object

/** Defines kind of replies returned by worker */
@JSGlobal("BABYLON.WorkerReplyType")
@js.native
object WorkerReplyType extends js.Object {
  /** Success */
  @js.native
  sealed trait SUCCESS
    extends babylonjsLib.BABYLONNs.WorkerReplyType
  
  /** Unkown error */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends babylonjsLib.BABYLONNs.WorkerReplyType
  
  /* 0 */ val SUCCESS: SUCCESS with scala.Double = js.native
  /* 1 */ val UNKNOWN_ERROR: UNKNOWN_ERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.WorkerReplyType with scala.Double] = js.native
}

