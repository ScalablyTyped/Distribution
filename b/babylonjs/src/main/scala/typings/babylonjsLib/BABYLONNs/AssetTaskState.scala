package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssetTaskState extends js.Object

/**
  * Defines the list of states available for a task inside a AssetsManager
  */
@JSGlobal("BABYLON.AssetTaskState")
@js.native
object AssetTaskState extends js.Object {
  /**
    * Done
    */
  @js.native
  sealed trait DONE
    extends babylonjsLib.BABYLONNs.AssetTaskState
  
  /**
    * Error
    */
  @js.native
  sealed trait ERROR
    extends babylonjsLib.BABYLONNs.AssetTaskState
  
  /**
    * Initialization
    */
  @js.native
  sealed trait INIT
    extends babylonjsLib.BABYLONNs.AssetTaskState
  
  /**
    * Running
    */
  @js.native
  sealed trait RUNNING
    extends babylonjsLib.BABYLONNs.AssetTaskState
  
  /* 2 */ val DONE: DONE with scala.Double = js.native
  /* 3 */ val ERROR: ERROR with scala.Double = js.native
  /* 0 */ val INIT: INIT with scala.Double = js.native
  /* 1 */ val RUNNING: RUNNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.AssetTaskState with scala.Double] = js.native
}

