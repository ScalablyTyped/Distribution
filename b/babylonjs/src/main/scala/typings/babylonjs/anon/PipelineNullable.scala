package typings.babylonjs.anon

import typings.babylonjs.BABYLON.NodeState
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.GPURenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineNullable extends StObject {
  
  var pipeline: Nullable[GPURenderPipeline]
  
  var token: NodeState
}
object PipelineNullable {
  
  inline def apply(token: NodeState): PipelineNullable = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], pipeline = null)
    __obj.asInstanceOf[PipelineNullable]
  }
  
  extension [Self <: PipelineNullable](x: Self) {
    
    inline def setPipeline(value: Nullable[GPURenderPipeline]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setToken(value: NodeState): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
