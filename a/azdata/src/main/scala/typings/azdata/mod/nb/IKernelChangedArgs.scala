package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKernelChangedArgs extends StObject {
  
  var newValue: IKernel | Null = js.native
  
  var oldValue: IKernel | Null = js.native
}
object IKernelChangedArgs {
  
  @scala.inline
  def apply(): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKernelChangedArgs]
  }
  
  @scala.inline
  implicit class IKernelChangedArgsMutableBuilder[Self <: IKernelChangedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: IKernel): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    @scala.inline
    def setOldValue(value: IKernel): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = StObject.set(x, "oldValue", null)
  }
}
