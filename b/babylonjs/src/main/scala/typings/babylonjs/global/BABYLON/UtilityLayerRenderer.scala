package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.UtilityLayerRenderer")
@js.native
class UtilityLayerRenderer protected ()
  extends typings.babylonjs.BABYLON.UtilityLayerRenderer {
  /**
    * Instantiates a UtilityLayerRenderer
    * @param originalScene the original scene that will be rendered on top of
    * @param handleEvents boolean indicating if the utility layer should handle events
    */
  def this(/** the original scene that will be rendered on top of */
  originalScene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    /** the original scene that will be rendered on top of */
  originalScene: typings.babylonjs.BABYLON.Scene,
    handleEvents: Boolean
  ) = this()
}
/* static members */
object UtilityLayerRenderer {
  
  @JSGlobal("BABYLON.UtilityLayerRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
  @js.native
  def _DefaultKeepDepthUtilityLayer: js.Any = js.native
  @scala.inline
  def _DefaultKeepDepthUtilityLayer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.UtilityLayerRenderer._DefaultUtilityLayer")
  @js.native
  def _DefaultUtilityLayer: js.Any = js.native
  @scala.inline
  def _DefaultUtilityLayer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
}
