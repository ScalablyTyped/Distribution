package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DepthPeelingRenderer")
@js.native
open class DepthPeelingRenderer protected ()
  extends typings.babylonjs.indexMod.DepthPeelingRenderer {
  /**
    * Instanciates the depth peeling renderer
    * @param scene Scene to attach to
    * @param passCount Number of depth layers to peel
    * @returns The depth peeling renderer
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(scene: typings.babylonjs.sceneMod.Scene, passCount: Double) = this()
}
/* static members */
object DepthPeelingRenderer {
  
  @JSImport("babylonjs/Legacy/legacy", "DepthPeelingRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "DepthPeelingRenderer._DEPTH_CLEAR_VALUE")
  @js.native
  def _DEPTH_CLEAR_VALUE: Any = js.native
  inline def _DEPTH_CLEAR_VALUE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEPTH_CLEAR_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "DepthPeelingRenderer._MAX_DEPTH")
  @js.native
  def _MAX_DEPTH: Any = js.native
  inline def _MAX_DEPTH_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_DEPTH")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "DepthPeelingRenderer._MIN_DEPTH")
  @js.native
  def _MIN_DEPTH: Any = js.native
  inline def _MIN_DEPTH_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MIN_DEPTH")(x.asInstanceOf[js.Any])
}
