package typings.babylonjs.sceneLoaderMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SceneLoaderAnimationGroupLoadingMode extends js.Object
@JSImport("babylonjs/Loading/sceneLoader", "SceneLoaderAnimationGroupLoadingMode")
@js.native
object SceneLoaderAnimationGroupLoadingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SceneLoaderAnimationGroupLoadingMode with Double] = js.native
  
  /**
    * Reset all old animations to initial state then dispose them.
    */
  @js.native
  sealed trait Clean extends SceneLoaderAnimationGroupLoadingMode
  /* 0 */ @js.native
  object Clean extends TopLevel[Clean with Double]
  
  /**
    * Old animations remains untouched.
    */
  @js.native
  sealed trait NoSync extends SceneLoaderAnimationGroupLoadingMode
  /* 3 */ @js.native
  object NoSync extends TopLevel[NoSync with Double]
  
  /**
    * Stop all old animations.
    */
  @js.native
  sealed trait Stop extends SceneLoaderAnimationGroupLoadingMode
  /* 1 */ @js.native
  object Stop extends TopLevel[Stop with Double]
  
  /**
    * Restart old animations from first frame.
    */
  @js.native
  sealed trait Sync extends SceneLoaderAnimationGroupLoadingMode
  /* 2 */ @js.native
  object Sync extends TopLevel[Sync with Double]
}
