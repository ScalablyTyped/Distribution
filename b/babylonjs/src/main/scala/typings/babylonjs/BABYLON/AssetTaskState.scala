package typings.babylonjs.BABYLON

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
  
}

