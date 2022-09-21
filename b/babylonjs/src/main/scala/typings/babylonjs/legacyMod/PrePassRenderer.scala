package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PrePassRenderer")
@js.native
open class PrePassRenderer protected ()
  extends typings.babylonjs.indexMod.PrePassRenderer {
  /**
    * Instantiates a prepass renderer
    * @param scene The scene
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object PrePassRenderer {
  
  @JSImport("babylonjs/Legacy/legacy", "PrePassRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param _
    * @hidden
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("babylonjs/Legacy/legacy", "PrePassRenderer._TextureFormats")
  @js.native
  def _TextureFormats: Any = js.native
  inline def _TextureFormats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureFormats")(x.asInstanceOf[js.Any])
}
