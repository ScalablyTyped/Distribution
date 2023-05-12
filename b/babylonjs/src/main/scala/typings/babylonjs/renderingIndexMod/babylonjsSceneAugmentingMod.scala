package typings.babylonjs.renderingIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @internal (Backing field) */
    var _boundingBoxRenderer: typings.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /** @internal (Backing field) */
    var _depthPeelingRenderer: Nullable[typings.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer] = js.native
    
    /** @internal (Backing field) */
    var _depthRenderer: StringDictionary[typings.babylonjs.renderingDepthRendererMod.DepthRenderer] = js.native
    
    /** @internal */
    var _edgeRenderLineShader: Nullable[ShaderMaterial] = js.native
    
    /** @internal (Backing field) */
    var _forceShowBoundingBoxes: Boolean = js.native
    
    /** @internal (Backing field) */
    var _geometryBufferRenderer: Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /** @internal */
    var _outlineRenderer: typings.babylonjs.renderingOutlineRendererMod.OutlineRenderer = js.native
    
    /** @internal */
    var _useOrderIndependentTransparency: Boolean = js.native
    
    /**
      * The depth peeling renderer
      */
    var depthPeelingRenderer: Nullable[typings.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer] = js.native
    
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
      * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
      * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...)
      * @param storeCameraSpaceZ Defines whether the depth stored is the Z coordinate in camera space. If true, storeNonLinearDepth has no effect. (Default: false)
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Unit, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera]): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double, depthFormat: Double): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Unit, depthFormat: Double): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /**
      * Gets or sets a boolean indicating if all bounding boxes must be rendered
      */
    var forceShowBoundingBoxes: Boolean = js.native
    
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /**
      * Gets the bounding box renderer associated with the scene
      * @returns a BoundingBoxRenderer
      */
    def getBoundingBoxRenderer(): typings.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /**
      * Gets the outline renderer associated with the scene
      * @returns a OutlineRenderer
      */
    def getOutlineRenderer(): typings.babylonjs.renderingOutlineRendererMod.OutlineRenderer = js.native
    
    /**
      * Flag to indicate if we want to use order independent transparency, despite the performance hit
      */
    var useOrderIndependentTransparency: Boolean = js.native
  }
}
