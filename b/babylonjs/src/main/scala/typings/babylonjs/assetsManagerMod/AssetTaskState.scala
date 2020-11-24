package typings.babylonjs.assetsManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AssetTaskState extends js.Object
@JSImport("babylonjs/Misc/assetsManager", "AssetTaskState")
@js.native
object AssetTaskState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AssetTaskState with Double] = js.native
  
  /**
    * Done
    */
  @js.native
  sealed trait DONE extends AssetTaskState
  /* 2 */ @js.native
  object DONE extends TopLevel[DONE with Double]
  
  /**
    * Error
    */
  @js.native
  sealed trait ERROR extends AssetTaskState
  /* 3 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /**
    * Initialization
    */
  @js.native
  sealed trait INIT extends AssetTaskState
  /* 0 */ @js.native
  object INIT extends TopLevel[INIT with Double]
  
  /**
    * Running
    */
  @js.native
  sealed trait RUNNING extends AssetTaskState
  /* 1 */ @js.native
  object RUNNING extends TopLevel[RUNNING with Double]
}
