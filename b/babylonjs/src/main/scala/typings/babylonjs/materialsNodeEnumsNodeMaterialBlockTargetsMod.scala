package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeEnumsNodeMaterialBlockTargetsMod {
  
  @js.native
  sealed trait NodeMaterialBlockTargets extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockTargets", "NodeMaterialBlockTargets")
  @js.native
  object NodeMaterialBlockTargets extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockTargets & Double] = js.native
    
    /** Fragment shader */
    @js.native
    sealed trait Fragment
      extends StObject
         with NodeMaterialBlockTargets
    /* 2 */ val Fragment: typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.Fragment & Double = js.native
    
    /** Neutral */
    @js.native
    sealed trait Neutral
      extends StObject
         with NodeMaterialBlockTargets
    /* 4 */ val Neutral: typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.Neutral & Double = js.native
    
    /** Vertex shader */
    @js.native
    sealed trait Vertex
      extends StObject
         with NodeMaterialBlockTargets
    /* 1 */ val Vertex: typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.Vertex & Double = js.native
    
    /** Vertex and Fragment */
    @js.native
    sealed trait VertexAndFragment
      extends StObject
         with NodeMaterialBlockTargets
    /* 3 */ val VertexAndFragment: typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.VertexAndFragment & Double = js.native
  }
}
