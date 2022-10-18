package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent")
@js.native
/**
  * Creates a new instance of the component for the given scene
  * @param scene Defines the scene to register the component in
  */
open class AudioSceneComponent ()
  extends typings.babylonjs.indexMod.AudioSceneComponent {
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object AudioSceneComponent {
  
  @JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "AudioSceneComponent._CameraDirection")
  @js.native
  def _CameraDirection: Any = js.native
  inline def _CameraDirection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirection")(x.asInstanceOf[js.Any])
}
