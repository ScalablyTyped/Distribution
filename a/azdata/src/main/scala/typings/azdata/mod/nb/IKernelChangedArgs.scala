package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKernelChangedArgs extends StObject {
  
  var newValue: js.UndefOr[IKernel] = js.undefined
  
  var oldValue: js.UndefOr[IKernel] = js.undefined
}
object IKernelChangedArgs {
  
  inline def apply(): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKernelChangedArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKernelChangedArgs] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: IKernel): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: IKernel): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
