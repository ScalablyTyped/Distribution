package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SceneLoaderAnimationGroupLoadingMode extends StObject
@JSGlobal("BABYLON.SceneLoaderAnimationGroupLoadingMode")
@js.native
object SceneLoaderAnimationGroupLoadingMode extends StObject {
  
  /**
    * Reset all old animations to initial state then dispose them.
    */
  @js.native
  sealed trait Clean
    extends StObject
       with SceneLoaderAnimationGroupLoadingMode
  
  /**
    * Old animations remains untouched.
    */
  @js.native
  sealed trait NoSync
    extends StObject
       with SceneLoaderAnimationGroupLoadingMode
  
  /**
    * Stop all old animations.
    */
  @js.native
  sealed trait Stop
    extends StObject
       with SceneLoaderAnimationGroupLoadingMode
  
  /**
    * Restart old animations from first frame.
    */
  @js.native
  sealed trait Sync
    extends StObject
       with SceneLoaderAnimationGroupLoadingMode
}
