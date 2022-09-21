package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPipeline
  extends StObject
     with GPUObjectBase
     with GPUPipelineBase
object GPURenderPipeline {
  
  inline def apply(getBindGroupLayout: Double => GPUBindGroupLayout): GPURenderPipeline = {
    val __obj = js.Dynamic.literal(getBindGroupLayout = js.Any.fromFunction1(getBindGroupLayout))
    __obj.asInstanceOf[GPURenderPipeline]
  }
}
