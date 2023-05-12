package typings.babylonjs

import typings.babylonjs.lightsShadowsShadowGeneratorMod.ShadowGenerator
import typings.babylonjs.materialsDrawWrapperMod.DrawWrapper
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsShadowDepthWrapperMod {
  
  @JSImport("babylonjs/Materials/shadowDepthWrapper", "ShadowDepthWrapper")
  @js.native
  open class ShadowDepthWrapper protected () extends StObject {
    /**
      * Instantiate a new shadow depth wrapper.
      * It works by injecting some specific code in the vertex/fragment shaders of the base material and is used by a shadow generator to
      * generate the shadow depth map. For more information, please refer to the documentation:
      * https://doc.babylonjs.com/features/featuresDeepDive/lights/shadows
      * @param baseMaterial Material to wrap
      * @param scene Define the scene the material belongs to
      * @param options Options used to create the wrapper
      */
    def this(baseMaterial: Material) = this()
    def this(baseMaterial: Material, scene: Scene) = this()
    def this(baseMaterial: Material, scene: Unit, options: IIOptionShadowDepthMaterial) = this()
    def this(baseMaterial: Material, scene: Scene, options: IIOptionShadowDepthMaterial) = this()
    
    /* private */ var _baseMaterial: Any = js.native
    
    /* private */ var _makeEffect: Any = js.native
    
    /* private */ var _meshes: Any = js.native
    
    /* private */ var _onEffectCreatedObserver: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _subMeshToDepthWrapper: Any = js.native
    
    /* private */ var _subMeshToEffect: Any = js.native
    
    /** Gets the base material the wrapper is built upon */
    def baseMaterial: Material = js.native
    
    /**
      * Disposes the resources
      */
    def dispose(): Unit = js.native
    
    /** Gets the doNotInjectCode status of the wrapper */
    def doNotInjectCode: Boolean = js.native
    
    /**
      * Gets the effect to use to generate the depth map
      * @param subMesh subMesh to get the effect for
      * @param shadowGenerator shadow generator to get the effect for
      * @param passIdForDrawWrapper Id of the pass for which the effect from the draw wrapper must be retrieved from
      * @returns the effect to use to generate the depth map for the subMesh + shadow generator specified
      */
    def getEffect(subMesh: Nullable[SubMesh], shadowGenerator: ShadowGenerator, passIdForDrawWrapper: Double): Nullable[DrawWrapper] = js.native
    
    /**
      * Specifies that the submesh is ready to be used for depth rendering
      * @param subMesh submesh to check
      * @param defines the list of defines to take into account when checking the effect
      * @param shadowGenerator combined with subMesh, it defines the effect to check
      * @param useInstances specifies that instances should be used
      * @param passIdForDrawWrapper Id of the pass for which the draw wrapper should be created
      * @returns a boolean indicating that the submesh is ready or not
      */
    def isReadyForSubMesh(
      subMesh: SubMesh,
      defines: js.Array[String],
      shadowGenerator: ShadowGenerator,
      useInstances: Boolean,
      passIdForDrawWrapper: Double
    ): Boolean = js.native
    
    /** Gets the standalone status of the wrapper */
    def standalone: Boolean = js.native
  }
  
  trait IIOptionShadowDepthMaterial extends StObject {
    
    /** Set doNotInjectCode if the specific shadow map generation code is already implemented by the material. That will prevent this code to be injected twice by ShadowDepthWrapper */
    var doNotInjectCode: js.UndefOr[Boolean] = js.undefined
    
    /** Variables in the vertex shader code that need to have their names remapped.
      * The format is: ["var_name", "var_remapped_name", "var_name", "var_remapped_name", ...]
      * "var_name" should be either: worldPos or vNormalW
      * So, if the variable holding the world position in your vertex shader is not named worldPos, you must tell the system
      * the name to use instead by using: ["worldPos", "myWorldPosVar"] assuming the variable is named myWorldPosVar in your code.
      * If the normal must also be remapped: ["worldPos", "myWorldPosVar", "vNormalW", "myWorldNormal"]
      */
    var remappedVariables: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set standalone to true if the base material wrapped by ShadowDepthMaterial is not used for a regular object but for depth shadow generation only */
    var standalone: js.UndefOr[Boolean] = js.undefined
  }
  object IIOptionShadowDepthMaterial {
    
    inline def apply(): IIOptionShadowDepthMaterial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIOptionShadowDepthMaterial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IIOptionShadowDepthMaterial] (val x: Self) extends AnyVal {
      
      inline def setDoNotInjectCode(value: Boolean): Self = StObject.set(x, "doNotInjectCode", value.asInstanceOf[js.Any])
      
      inline def setDoNotInjectCodeUndefined: Self = StObject.set(x, "doNotInjectCode", js.undefined)
      
      inline def setRemappedVariables(value: js.Array[String]): Self = StObject.set(x, "remappedVariables", value.asInstanceOf[js.Any])
      
      inline def setRemappedVariablesUndefined: Self = StObject.set(x, "remappedVariables", js.undefined)
      
      inline def setRemappedVariablesVarargs(value: String*): Self = StObject.set(x, "remappedVariables", js.Array(value*))
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
