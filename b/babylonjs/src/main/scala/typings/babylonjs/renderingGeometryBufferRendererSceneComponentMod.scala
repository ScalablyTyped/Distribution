package typings.babylonjs

import typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingGeometryBufferRendererSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/geometryBufferRendererSceneComponent", "GeometryBufferRendererSceneComponent")
  @js.native
  open class GeometryBufferRendererSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
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
      var _geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
      
      /**
        * Disables the GeometryBufferRender associated with the scene
        */
      def disableGeometryBufferRenderer(): Unit = js.native
      
      /**
        * Enables a GeometryBufferRender and associates it with the scene
        * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
        * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
        * @returns the GeometryBufferRenderer
        */
      def enableGeometryBufferRenderer(): Nullable[GeometryBufferRenderer] = js.native
      def enableGeometryBufferRenderer(ratio: Double): Nullable[GeometryBufferRenderer] = js.native
      def enableGeometryBufferRenderer(ratio: Double, depthFormat: Double): Nullable[GeometryBufferRenderer] = js.native
      def enableGeometryBufferRenderer(ratio: Unit, depthFormat: Double): Nullable[GeometryBufferRenderer] = js.native
      
      /**
        * Gets or Sets the current geometry buffer associated to the scene.
        */
      var geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
    }
  }
}
