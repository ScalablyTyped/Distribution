package typings.babylonjs.mod

import typings.babylonjs.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PrePassRenderer")
@js.native
open class PrePassRenderer protected ()
  extends typings.babylonjs.legacyLegacyMod.PrePassRenderer {
  /**
    * Instantiates a prepass renderer
    * @param scene The scene
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object PrePassRenderer {
  
  @JSImport("babylonjs", "PrePassRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Describes the types and formats of the textures used by the pre-pass renderer
    */
  @JSImport("babylonjs", "PrePassRenderer.TextureFormats")
  @js.native
  def TextureFormats: js.Array[Format] = js.native
  inline def TextureFormats_=(x: js.Array[Format]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextureFormats")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
