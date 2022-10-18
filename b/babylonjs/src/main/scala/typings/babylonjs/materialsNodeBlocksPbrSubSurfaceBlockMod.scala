package typings.babylonjs

import typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPbrSubSurfaceBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/subSurfaceBlock", "SubSurfaceBlock")
  @js.native
  open class SubSurfaceBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new SubSurfaceBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    def autoConfigure(): Unit = js.native
    
    /**
      * Gets the refraction object parameters
      */
    def refraction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sub surface object output component
      */
    def subsurface: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the thickness component
      */
    def thickness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the tint color input component
      */
    def tintColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the translucency diffusion distance input component
      */
    def translucencyDiffusionDist: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the translucency intensity input component
      */
    def translucencyIntensity: NodeMaterialConnectionPoint = js.native
  }
  /* static members */
  object SubSurfaceBlock {
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/subSurfaceBlock", "SubSurfaceBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param state current state of the node material building
      * @param ssBlock instance of a SubSurfaceBlock or null if the code must be generated without an active sub surface module
      * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
      * @param worldPosVarName name of the variable holding the world position
      * @returns the shader code
      */
    inline def GetCode(
      state: NodeMaterialBuildState,
      ssBlock: Nullable[SubSurfaceBlock],
      reflectionBlock: Nullable[ReflectionBlock],
      worldPosVarName: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(state.asInstanceOf[js.Any], ssBlock.asInstanceOf[js.Any], reflectionBlock.asInstanceOf[js.Any], worldPosVarName.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
