package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModule
  extends StObject
     with GPUObjectBase {
  
  def getCompilationInfo(): js.Promise[GPUCompilationInfo]
}
object GPUShaderModule {
  
  inline def apply(getCompilationInfo: () => js.Promise[GPUCompilationInfo]): GPUShaderModule = {
    val __obj = js.Dynamic.literal(getCompilationInfo = js.Any.fromFunction0(getCompilationInfo))
    __obj.asInstanceOf[GPUShaderModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUShaderModule] (val x: Self) extends AnyVal {
    
    inline def setGetCompilationInfo(value: () => js.Promise[GPUCompilationInfo]): Self = StObject.set(x, "getCompilationInfo", js.Any.fromFunction0(value))
  }
}
