package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModule
  extends StObject
     with GPUObjectBase {
  
  def compilationInfo(): js.Promise[GPUCompilationInfo]
}
object GPUShaderModule {
  
  inline def apply(compilationInfo: () => js.Promise[GPUCompilationInfo]): GPUShaderModule = {
    val __obj = js.Dynamic.literal(compilationInfo = js.Any.fromFunction0(compilationInfo))
    __obj.asInstanceOf[GPUShaderModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUShaderModule] (val x: Self) extends AnyVal {
    
    inline def setCompilationInfo(value: () => js.Promise[GPUCompilationInfo]): Self = StObject.set(x, "compilationInfo", js.Any.fromFunction0(value))
  }
}
