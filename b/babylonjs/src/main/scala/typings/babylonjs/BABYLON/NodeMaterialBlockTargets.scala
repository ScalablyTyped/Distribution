package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeMaterialBlockTargets extends StObject
@JSGlobal("BABYLON.NodeMaterialBlockTargets")
@js.native
object NodeMaterialBlockTargets extends StObject {
  
  /** Fragment shader */
  @js.native
  sealed trait Fragment
    extends StObject
       with NodeMaterialBlockTargets
  
  /** Neutral */
  @js.native
  sealed trait Neutral
    extends StObject
       with NodeMaterialBlockTargets
  
  /** Vertex shader */
  @js.native
  sealed trait Vertex
    extends StObject
       with NodeMaterialBlockTargets
  
  /** Vertex and Fragment */
  @js.native
  sealed trait VertexAndFragment
    extends StObject
       with NodeMaterialBlockTargets
}
