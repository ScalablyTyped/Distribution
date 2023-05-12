package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksMeshAttributeExistsBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/meshAttributeExistsBlock", "MeshAttributeExistsBlock")
  @js.native
  open class MeshAttributeExistsBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new MeshAttributeExistsBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Defines which mesh attribute to use
      */
    var attributeType: MeshAttributeExistsBlockTypes = js.native
    
    /**
      * Gets the fallback component when speciefied attribute doesn't exist
      */
    def fallback: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
  @js.native
  sealed trait MeshAttributeExistsBlockTypes extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/meshAttributeExistsBlock", "MeshAttributeExistsBlockTypes")
  @js.native
  object MeshAttributeExistsBlockTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MeshAttributeExistsBlockTypes & Double] = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 0 */ val None: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.None & Double = js.native
    
    @js.native
    sealed trait Normal
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 1 */ val Normal: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.Normal & Double = js.native
    
    @js.native
    sealed trait Tangent
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 2 */ val Tangent: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.Tangent & Double = js.native
    
    @js.native
    sealed trait UV1
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 4 */ val UV1: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.UV1 & Double = js.native
    
    @js.native
    sealed trait UV2
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 5 */ val UV2: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.UV2 & Double = js.native
    
    @js.native
    sealed trait UV3
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 6 */ val UV3: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.UV3 & Double = js.native
    
    @js.native
    sealed trait UV4
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 7 */ val UV4: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.UV4 & Double = js.native
    
    @js.native
    sealed trait UV5
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 8 */ val UV5: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.UV5 & Double = js.native
    
    @js.native
    sealed trait UV6
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 9 */ val UV6: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.UV6 & Double = js.native
    
    @js.native
    sealed trait VertexColor
      extends StObject
         with MeshAttributeExistsBlockTypes
    /* 3 */ val VertexColor: typings.babylonjs.materialsNodeBlocksMeshAttributeExistsBlockMod.MeshAttributeExistsBlockTypes.VertexColor & Double = js.native
  }
}
