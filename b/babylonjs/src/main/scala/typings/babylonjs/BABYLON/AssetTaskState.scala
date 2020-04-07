package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssetTaskState extends js.Object

@JSGlobal("BABYLON.AssetTaskState")
@js.native
object AssetTaskState extends js.Object {
  /**
    * Done
    */
  @js.native
  sealed trait DONE extends AssetTaskState
  
  /**
    * Error
    */
  @js.native
  sealed trait ERROR extends AssetTaskState
  
  /**
    * Initialization
    */
  @js.native
  sealed trait INIT extends AssetTaskState
  
  /**
    * Running
    */
  @js.native
  sealed trait RUNNING extends AssetTaskState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AssetTaskState with Double] = js.native
  /* 2 */ @js.native
  object DONE extends TopLevel[DONE with Double]
  
  /* 3 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 0 */ @js.native
  object INIT extends TopLevel[INIT with Double]
  
  /* 1 */ @js.native
  object RUNNING extends TopLevel[RUNNING with Double]
  
}

