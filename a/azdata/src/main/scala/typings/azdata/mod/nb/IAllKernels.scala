package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAllKernels extends StObject {
  
  var defaultKernel: String
  
  var kernels: js.Array[IKernelSpec]
}
object IAllKernels {
  
  inline def apply(defaultKernel: String, kernels: js.Array[IKernelSpec]): IAllKernels = {
    val __obj = js.Dynamic.literal(defaultKernel = defaultKernel.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllKernels]
  }
  
  extension [Self <: IAllKernels](x: Self) {
    
    inline def setDefaultKernel(value: String): Self = StObject.set(x, "defaultKernel", value.asInstanceOf[js.Any])
    
    inline def setKernels(value: js.Array[IKernelSpec]): Self = StObject.set(x, "kernels", value.asInstanceOf[js.Any])
    
    inline def setKernelsVarargs(value: IKernelSpec*): Self = StObject.set(x, "kernels", js.Array(value*))
  }
}
