package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialBlockTargetsMod {
  
  @js.native
  sealed trait NodeMaterialBlockTargets extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockTargets", "NodeMaterialBlockTargets")
  @js.native
  object NodeMaterialBlockTargets extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockTargets with Double] = js.native
    
    /** Fragment shader */
    @js.native
    sealed trait Fragment extends NodeMaterialBlockTargets
    /* 2 */ val Fragment: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.Fragment with Double = js.native
    
    /** Neutral */
    @js.native
    sealed trait Neutral extends NodeMaterialBlockTargets
    /* 4 */ val Neutral: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.Neutral with Double = js.native
    
    /** Vertex shader */
    @js.native
    sealed trait Vertex extends NodeMaterialBlockTargets
    /* 1 */ val Vertex: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.Vertex with Double = js.native
    
    /** Vertex and Fragment */
    @js.native
    sealed trait VertexAndFragment extends NodeMaterialBlockTargets
    /* 3 */ val VertexAndFragment: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets.VertexAndFragment with Double = js.native
  }
}
