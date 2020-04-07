package typings.babylonjs.geometryBufferRendererSceneComponentMod

import typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer
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
    var _geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
    /**
      * Disables the GeometryBufferRender associated with the scene
      */
    def disableGeometryBufferRenderer(): Unit = js.native
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[GeometryBufferRenderer] = js.native
  }
  
}

