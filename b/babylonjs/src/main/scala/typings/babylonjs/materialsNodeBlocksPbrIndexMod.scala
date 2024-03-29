package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPbrIndexMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "AnisotropyBlock")
  @js.native
  open class AnisotropyBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrAnisotropyBlockMod.AnisotropyBlock {
    /**
      * Create a new AnisotropyBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "ClearCoatBlock")
  @js.native
  open class ClearCoatBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrClearCoatBlockMod.ClearCoatBlock {
    /**
      * Create a new ClearCoatBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  /* static members */
  object ClearCoatBlock {
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "ClearCoatBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param state current state of the node material building
      * @param ccBlock instance of a ClearCoatBlock or null if the code must be generated without an active clear coat module
      * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
      * @param worldPosVarName name of the variable holding the world position
      * @param generateTBNSpace if true, the code needed to create the TBN coordinate space is generated
      * @param vTBNAvailable indicate that the vTBN variable is already existing because it has already been generated by another block (PerturbNormal or Anisotropy)
      * @param worldNormalVarName name of the variable holding the world normal
      * @returns the shader code
      */
    inline def GetCode(
      state: NodeMaterialBuildState,
      ccBlock: Nullable[typings.babylonjs.materialsNodeBlocksPbrClearCoatBlockMod.ClearCoatBlock],
      reflectionBlock: Nullable[typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock],
      worldPosVarName: String,
      generateTBNSpace: Boolean,
      vTBNAvailable: Boolean,
      worldNormalVarName: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(state.asInstanceOf[js.Any], ccBlock.asInstanceOf[js.Any], reflectionBlock.asInstanceOf[js.Any], worldPosVarName.asInstanceOf[js.Any], generateTBNSpace.asInstanceOf[js.Any], vTBNAvailable.asInstanceOf[js.Any], worldNormalVarName.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "PBRMetallicRoughnessBlock")
  @js.native
  open class PBRMetallicRoughnessBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrPbrMetallicRoughnessBlockMod.PBRMetallicRoughnessBlock {
    /**
      * Create a new ReflectionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  /* static members */
  object PBRMetallicRoughnessBlock {
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "PBRMetallicRoughnessBlock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "PBRMetallicRoughnessBlock._OnGenerateOnlyFragmentCodeChanged")
    @js.native
    def _OnGenerateOnlyFragmentCodeChanged: Any = js.native
    inline def _OnGenerateOnlyFragmentCodeChanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OnGenerateOnlyFragmentCodeChanged")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "ReflectionBlock")
  @js.native
  open class ReflectionBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock {
    /**
      * Create a new ReflectionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "RefractionBlock")
  @js.native
  open class RefractionBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrRefractionBlockMod.RefractionBlock {
    /**
      * Create a new RefractionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "SheenBlock")
  @js.native
  open class SheenBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrSheenBlockMod.SheenBlock {
    /**
      * Create a new SheenBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "SubSurfaceBlock")
  @js.native
  open class SubSurfaceBlock protected ()
    extends typings.babylonjs.materialsNodeBlocksPbrSubSurfaceBlockMod.SubSurfaceBlock {
    /**
      * Create a new SubSurfaceBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  /* static members */
  object SubSurfaceBlock {
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/index", "SubSurfaceBlock")
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
      ssBlock: Nullable[typings.babylonjs.materialsNodeBlocksPbrSubSurfaceBlockMod.SubSurfaceBlock],
      reflectionBlock: Nullable[typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock],
      worldPosVarName: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(state.asInstanceOf[js.Any], ssBlock.asInstanceOf[js.Any], reflectionBlock.asInstanceOf[js.Any], worldPosVarName.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
