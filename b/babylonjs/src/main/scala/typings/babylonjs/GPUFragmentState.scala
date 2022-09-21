package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUFragmentState
  extends StObject
     with GPUProgrammableStage {
  
  var targets: js.Array[GPUColorTargetState | Null]
}
object GPUFragmentState {
  
  inline def apply(
    entryPoint: String | js.typedarray.Uint32Array,
    module: GPUShaderModule,
    targets: js.Array[GPUColorTargetState | Null]
  ): GPUFragmentState = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUFragmentState]
  }
  
  extension [Self <: GPUFragmentState](x: Self) {
    
    inline def setTargets(value: js.Array[GPUColorTargetState | Null]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: (GPUColorTargetState | Null)*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
