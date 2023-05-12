package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.renderingDepthRendererMod.DepthRenderer
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingDepthRendererSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/depthRendererSceneComponent", "DepthRendererSceneComponent")
  @js.native
  open class DepthRendererSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _gatherActiveCameraRenderTargets: Any = js.native
    
    /* private */ var _gatherRenderTargets: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
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
        * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
        * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...)
        * @param storeCameraSpaceZ Defines whether the depth stored is the Z coordinate in camera space. If true, storeNonLinearDepth has no effect. (Default: false)
        * @returns the created depth renderer
        */
      def enableDepthRenderer(): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean, samplingMode: Double): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Boolean,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Boolean,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Unit, samplingMode: Double): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Unit,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Unit,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean, samplingMode: Double): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Unit,
        force32bitsFloat: Boolean,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Unit,
        force32bitsFloat: Boolean,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Unit,
        force32bitsFloat: Unit,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Unit,
        storeNonLinearDepth: Unit,
        force32bitsFloat: Unit,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera]): DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Boolean,
        samplingMode: Double
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Boolean,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Boolean,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Unit,
        samplingMode: Double
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Unit,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Boolean,
        force32bitsFloat: Unit,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Unit,
        force32bitsFloat: Boolean,
        samplingMode: Double
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Unit,
        force32bitsFloat: Boolean,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Unit,
        force32bitsFloat: Boolean,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Unit,
        force32bitsFloat: Unit,
        samplingMode: Double,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: Nullable[Camera],
        storeNonLinearDepth: Unit,
        force32bitsFloat: Unit,
        samplingMode: Unit,
        storeCameraSpaceZ: Boolean
      ): DepthRenderer = js.native
    }
  }
}
