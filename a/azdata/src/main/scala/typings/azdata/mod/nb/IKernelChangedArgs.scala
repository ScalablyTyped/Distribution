package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKernelChangedArgs extends StObject {
  
  var newValue: IKernel | Null
  
  var oldValue: IKernel | Null
}
object IKernelChangedArgs {
  
  inline def apply(): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal(newValue = null, oldValue = null)
    __obj.asInstanceOf[IKernelChangedArgs]
  }
  
  extension [Self <: IKernelChangedArgs](x: Self) {
    
    inline def setNewValue(value: IKernel): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setOldValue(value: IKernel): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
  }
}
