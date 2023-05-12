package typings.babylonjs

import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object probesReflectionProbeMod {
  
  @JSImport("babylonjs/Probes/reflectionProbe", "ReflectionProbe")
  @js.native
  open class ReflectionProbe protected () extends StObject {
    /**
      * Creates a new reflection probe
      * @param name defines the name of the probe
      * @param size defines the texture resolution (for each face)
      * @param scene defines the hosting scene
      * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
      * @param useFloat defines if HDR data (float data) should be used to store colors (false by default)
      * @param linearSpace defines if the probe should be generated in linear space or not (false by default)
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
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      useFloat: Boolean,
      linearSpace: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      useFloat: Unit,
      linearSpace: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Unit,
      useFloat: Boolean,
      linearSpace: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Unit,
      useFloat: Unit,
      linearSpace: Boolean
    ) = this()
    
    /* private */ var _add: Any = js.native
    
    /* private */ var _attachedMesh: Any = js.native
    
    /* private */ var _currentSceneUBO: Any = js.native
    
    /* private */ var _invertYAxis: Any = js.native
    
    /** @internal */
    var _parentContainer: Nullable[AbstractScene] = js.native
    
    /* private */ var _projectionMatrix: Any = js.native
    
    /* private */ var _renderTargetTexture: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _sceneUBOs: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /* private */ var _viewMatrix: Any = js.native
    
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
      * Get the class name of the refection probe.
      * @returns "ReflectionProbe"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets the hosting scene
      * @returns a Scene
      */
    def getScene(): Scene = js.native
    
    /**
      * Gets or sets an object used to store user defined information for the reflection probe.
      */
    var metadata: Any = js.native
    
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
      * Serialize the reflection probe to a JSON representation we can easily use in the respective Parse function.
      * @returns The JSON representation of the texture
      */
    def serialize(): Any = js.native
    
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
    inline def Parse(parsedReflectionProbe: Any, scene: Scene, rootUrl: String): Nullable[ReflectionProbe] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedReflectionProbe.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[ReflectionProbe]]
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
        * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/reflectionProbes
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
      ): typings.babylonjs.probesReflectionProbeMod.babylonjsAbstractSceneAugmentingMod.AbstractScene = {
        val __obj = js.Dynamic.literal(addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
        __obj.asInstanceOf[typings.babylonjs.probesReflectionProbeMod.babylonjsAbstractSceneAugmentingMod.AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.probesReflectionProbeMod.babylonjsAbstractSceneAugmentingMod.AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setAddReflectionProbe(value: ReflectionProbe => Unit): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1(value))
        
        inline def setReflectionProbes(value: js.Array[ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
        
        inline def setReflectionProbesVarargs(value: ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value*))
        
        inline def setRemoveReflectionProbe(value: ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      }
    }
  }
}
