package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkerTaskType extends js.Object

/** Defines supported task for worker process */
@JSGlobal("BABYLON.WorkerTaskType")
@js.native
object WorkerTaskType extends js.Object {
  /** Evaluate collision */
  @js.native
  sealed trait COLLIDE
    extends babylonjsLib.BABYLONNs.WorkerTaskType
  
  /** Initialization */
  @js.native
  sealed trait INIT
    extends babylonjsLib.BABYLONNs.WorkerTaskType
  
  /** Update of geometry */
  @js.native
  sealed trait UPDATE
    extends babylonjsLib.BABYLONNs.WorkerTaskType
  
  /* 2 */ val COLLIDE: COLLIDE with scala.Double = js.native
  /* 0 */ val INIT: INIT with scala.Double = js.native
  /* 1 */ val UPDATE: UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.WorkerTaskType with scala.Double] = js.native
}

