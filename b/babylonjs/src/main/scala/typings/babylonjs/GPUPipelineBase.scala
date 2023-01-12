package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineBase extends StObject {
  
  def getBindGroupLayout(index: Double): GPUBindGroupLayout
}
object GPUPipelineBase {
  
  inline def apply(getBindGroupLayout: Double => GPUBindGroupLayout): GPUPipelineBase = {
    val __obj = js.Dynamic.literal(getBindGroupLayout = js.Any.fromFunction1(getBindGroupLayout))
    __obj.asInstanceOf[GPUPipelineBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUPipelineBase] (val x: Self) extends AnyVal {
    
    inline def setGetBindGroupLayout(value: Double => GPUBindGroupLayout): Self = StObject.set(x, "getBindGroupLayout", js.Any.fromFunction1(value))
  }
}
