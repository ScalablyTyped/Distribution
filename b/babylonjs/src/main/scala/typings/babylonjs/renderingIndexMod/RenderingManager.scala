package typings.babylonjs.renderingIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "RenderingManager")
@js.native
open class RenderingManager protected ()
  extends typings.babylonjs.renderingRenderingManagerMod.RenderingManager {
  /**
    * Instantiates a new rendering group for a particular scene
    * @param scene Defines the scene the groups belongs to
    */
  def this(scene: Scene) = this()
}
/* static members */
object RenderingManager {
  
  @JSImport("babylonjs/Rendering/index", "RenderingManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to globally prevent autoclearing scenes.
    */
  @JSImport("babylonjs/Rendering/index", "RenderingManager.AUTOCLEAR")
  @js.native
  def AUTOCLEAR: Boolean = js.native
  inline def AUTOCLEAR_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTOCLEAR")(x.asInstanceOf[js.Any])
  
  /**
    * The max id used for rendering groups (not included)
    */
  @JSImport("babylonjs/Rendering/index", "RenderingManager.MAX_RENDERINGGROUPS")
  @js.native
  def MAX_RENDERINGGROUPS: Double = js.native
  inline def MAX_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
  
  /**
    * The min id used for rendering groups (included)
    */
  @JSImport("babylonjs/Rendering/index", "RenderingManager.MIN_RENDERINGGROUPS")
  @js.native
  def MIN_RENDERINGGROUPS: Double = js.native
  inline def MIN_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
}
