package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionProbeMod {
  
  @JSImport("babylonjs/Probes/reflectionProbe", "ReflectionProbe")
  @js.native
  class ReflectionProbe protected () extends StObject {
    /**
      * Creates a new reflection probe
      * @param name defines the name of the probe
      * @param size defines the texture resolution (for each face)
      * @param scene defines the hosting scene
      * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
      * @param useFloat defines if HDR data (flaot data) should be used to store colors (false by default)
      */
    def this(/** defines the name of the probe */
    name: String, size: Double, scene: Scene) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      useFloat: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Unit,
      useFloat: Boolean
    ) = this()
    
    /* private */ var _add: js.Any = js.native
    
    /* private */ var _attachedMesh: js.Any = js.native
    
    /* private */ var _invertYAxis: js.Any = js.native
    
    /* private */ var _projectionMatrix: js.Any = js.native
    
    /* private */ var _renderTargetTexture: js.Any = js.native
    
    /* private */ var _scene: js.Any = js.native
    
    /* private */ var _target: js.Any = js.native
    
    /* private */ var _viewMatrix: js.Any = js.native
    
    /**
      * Attach the probe to a specific mesh (Rendering will be done from attached mesh's position)
      * @param mesh defines the mesh to attach to
      */
    def attachToMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
    
    /** Gets the internal CubeTexture used to render to */
    def cubeTexture: RenderTargetTexture = js.native
    
    /**
      * Clean all associated resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Get the class name of the relfection probe.
      * @returns "ReflectionProbe"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets the hosting scene
      * @returns a Scene
      */
    def getScene(): Scene = js.native
    
    /** defines the name of the probe */
    var name: String = js.native
    
    /** Gets or sets probe position (center of the cube map) */
    var position: Vector3 = js.native
    
    /** Gets or sets the refresh rate to use (on every frame by default) */
    def refreshRate: Double = js.native
    def refreshRate_=(value: Double): Unit = js.native
    
    /** Gets the list of meshes to render */
    def renderList: Nullable[js.Array[AbstractMesh]] = js.native
    
    /** Gets or sets the number of samples to use for multi-sampling (0 by default). Required WebGL2 */
    def samples: Double = js.native
    def samples_=(value: Double): Unit = js.native
    
    /**
      * Serialize the reflection probe to a JSON representation we can easily use in the resepective Parse function.
      * @returns The JSON representation of the texture
      */
    def serialize(): js.Any = js.native
    
    /**
      * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups
      * @param renderingGroupId The rendering group id corresponding to its index
      * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
      */
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
    
    def toString(fullDetails: Boolean): String = js.native
  }
  /* static members */
  object ReflectionProbe {
    
    @JSImport("babylonjs/Probes/reflectionProbe", "ReflectionProbe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the JSON representation of a reflection probe in order to recreate the reflection probe in the given scene.
      * @param parsedReflectionProbe Define the JSON representation of the reflection probe
      * @param scene Define the scene the parsed reflection probe should be instantiated in
      * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
      * @returns The parsed reflection probe if successful
      */
    inline def Parse(parsedReflectionProbe: js.Any, scene: Scene, rootUrl: String): Nullable[ReflectionProbe] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedReflectionProbe.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[ReflectionProbe]]
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * Adds the given reflection probe to this scene.
        * @param newReflectionProbe The reflection probe to add
        */
      def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit
      
      /**
        * The list of reflection probes added to the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
        */
      var reflectionProbes: js.Array[ReflectionProbe]
      
      /**
        * Removes the given reflection probe from this scene.
        * @param toRemove The reflection probe to remove
        * @returns The index of the removed reflection probe
        */
      def removeReflectionProbe(toRemove: ReflectionProbe): Double
    }
    object AbstractScene {
      
      inline def apply(
        addReflectionProbe: ReflectionProbe => Unit,
        reflectionProbes: js.Array[ReflectionProbe],
        removeReflectionProbe: ReflectionProbe => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
        __obj.asInstanceOf[AbstractScene]
      }
      
      extension [Self <: AbstractScene](x: Self) {
        
        inline def setAddReflectionProbe(value: ReflectionProbe => Unit): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1(value))
        
        inline def setReflectionProbes(value: js.Array[ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
        
        inline def setReflectionProbesVarargs(value: ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value :_*))
        
        inline def setRemoveReflectionProbe(value: ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      }
    }
  }
}
