package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the list of states available for a task inside a AssetsManager
  */
@JSImport("babylonjs", "AssetTaskState")
@js.native
object AssetTaskState extends js.Object {
  /* 2 */ val DONE: babylonjsLib.BABYLONNs.AssetTaskState.DONE with scala.Double = js.native
  /* 3 */ val ERROR: babylonjsLib.BABYLONNs.AssetTaskState.ERROR with scala.Double = js.native
  /* 0 */ val INIT: babylonjsLib.BABYLONNs.AssetTaskState.INIT with scala.Double = js.native
  /* 1 */ val RUNNING: babylonjsLib.BABYLONNs.AssetTaskState.RUNNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.AssetTaskState with scala.Double] = js.native
}

