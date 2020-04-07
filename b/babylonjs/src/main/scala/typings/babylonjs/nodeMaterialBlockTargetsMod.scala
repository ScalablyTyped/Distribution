package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockTargets", JSImport.Namespace)
@js.native
object nodeMaterialBlockTargetsMod extends js.Object {
  @js.native
  sealed trait NodeMaterialBlockTargets extends js.Object
  
  @js.native
  object NodeMaterialBlockTargets extends js.Object {
    /** Fragment shader */
    @js.native
    sealed trait Fragment extends NodeMaterialBlockTargets
    
    /** Neutral */
    @js.native
    sealed trait Neutral extends NodeMaterialBlockTargets
    
    /** Vertex shader */
    @js.native
    sealed trait Vertex extends NodeMaterialBlockTargets
    
    /** Vertex and Fragment */
    @js.native
    sealed trait VertexAndFragment extends NodeMaterialBlockTargets
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockTargets with Double] = js.native
    /* 2 */ @js.native
    object Fragment extends TopLevel[Fragment with Double]
    
    /* 4 */ @js.native
    object Neutral extends TopLevel[Neutral with Double]
    
    /* 1 */ @js.native
    object Vertex extends TopLevel[Vertex with Double]
    
    /* 3 */ @js.native
    object VertexAndFragment extends TopLevel[VertexAndFragment with Double]
    
  }
  
}

