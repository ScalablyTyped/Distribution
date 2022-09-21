package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShaderStage extends StObject
@JSGlobal("BABYLON.ShaderStage")
@js.native
object ShaderStage extends StObject {
  
  @js.native
  sealed trait Compute
    extends StObject
       with ShaderStage
  
  @js.native
  sealed trait Fragment
    extends StObject
       with ShaderStage
  
  @js.native
  sealed trait Vertex
    extends StObject
       with ShaderStage
}
