package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent")
@js.native
class AudioSceneComponent protected ()
  extends typings.babylonjs.indexMod.AudioSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object AudioSceneComponent {
  
  @JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent._CameraDirectionLH")
  @js.native
  def _CameraDirectionLH: js.Any = js.native
  @scala.inline
  def _CameraDirectionLH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionLH")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent._CameraDirectionRH")
  @js.native
  def _CameraDirectionRH: js.Any = js.native
  @scala.inline
  def _CameraDirectionRH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionRH")(x.asInstanceOf[js.Any])
}
