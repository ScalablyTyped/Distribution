package typings.babylonjs.renderingIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Rendering/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /** @hidden (Backing field) */
    var _boundingBoxRenderer: typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer = js.native
    /** @hidden (Backing field) */
    var _depthRenderer: StringDictionary[typings.babylonjs.depthRendererMod.DepthRenderer] = js.native
    /** @hidden (Backing field) */
    var _forceShowBoundingBoxes: Boolean = js.native
    /** @hidden (Backing field) */
    var _geometryBufferRenderer: Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    /** @hidden */
    var _outlineRenderer: typings.babylonjs.outlineRendererMod.OutlineRenderer = js.native
    /**
      * Gets or sets a boolean indicating if all bounding boxes must be rendered
      */
    var forceShowBoundingBoxes: Boolean = js.native
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    /**
      * Disables a depth renderer for a given camera
      * @param camera The camera to disable the depth renderer on (default: scene's active camera)
      */
    def disableDepthRenderer(): Unit = js.native
    def disableDepthRenderer(camera: Nullable[Camera]): Unit = js.native
    /**
      * Disables the GeometryBufferRender associated with the scene
      */
    def disableGeometryBufferRenderer(): Unit = js.native
    /**
      * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
      * @param camera The camera to create the depth renderer on (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera]): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    /**
      * Gets the bounding box renderer associated with the scene
      * @returns a BoundingBoxRenderer
      */
    def getBoundingBoxRenderer(): typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer = js.native
    /**
      * Gets the outline renderer associated with the scene
      * @returns a OutlineRenderer
      */
    def getOutlineRenderer(): typings.babylonjs.outlineRendererMod.OutlineRenderer = js.native
  }
  
}

