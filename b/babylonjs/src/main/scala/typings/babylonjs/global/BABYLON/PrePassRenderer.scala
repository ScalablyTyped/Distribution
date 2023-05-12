package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassRenderer")
@js.native
open class PrePassRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PrePassRenderer {
  /**
    * Instantiates a prepass renderer
    * @param scene The scene
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object PrePassRenderer {
  
  @JSGlobal("BABYLON.PrePassRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Describes the types and formats of the textures used by the pre-pass renderer
    */
  @JSGlobal("BABYLON.PrePassRenderer.TextureFormats")
  @js.native
  def TextureFormats: js.Array[Format] = js.native
  inline def TextureFormats_=(x: js.Array[Format]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextureFormats")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
