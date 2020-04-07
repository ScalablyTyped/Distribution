package typings.babylonjs.depthRendererSceneComponentMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.depthRendererMod.DepthRenderer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/scene", JSImport.Namespace)
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /** @hidden (Backing field) */
    var _depthRenderer: StringDictionary[DepthRenderer] = js.native
    /**
      * Disables a depth renderer for a given camera
      * @param camera The camera to disable the depth renderer on (default: scene's active camera)
      */
    def disableDepthRenderer(): Unit = js.native
    def disableDepthRenderer(camera: Nullable[Camera]): Unit = js.native
    /**
      * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
      * @param camera The camera to create the depth renderer on (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera]): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean): DepthRenderer = js.native
  }
  
}

