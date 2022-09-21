package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RenderingManager")
@js.native
open class RenderingManager protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RenderingManager {
  /**
    * Instantiates a new rendering group for a particular scene
    * @param scene Defines the scene the groups belongs to
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object RenderingManager {
  
  @JSGlobal("BABYLON.RenderingManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to globally prevent autoclearing scenes.
    */
  @JSGlobal("BABYLON.RenderingManager.AUTOCLEAR")
  @js.native
  def AUTOCLEAR: Boolean = js.native
  inline def AUTOCLEAR_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTOCLEAR")(x.asInstanceOf[js.Any])
  
  /**
    * The max id used for rendering groups (not included)
    */
  @JSGlobal("BABYLON.RenderingManager.MAX_RENDERINGGROUPS")
  @js.native
  def MAX_RENDERINGGROUPS: Double = js.native
  inline def MAX_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
  
  /**
    * The min id used for rendering groups (included)
    */
  @JSGlobal("BABYLON.RenderingManager.MIN_RENDERINGGROUPS")
  @js.native
  def MIN_RENDERINGGROUPS: Double = js.native
  inline def MIN_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
}
