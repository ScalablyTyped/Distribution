package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBlendComponent extends StObject {
  
  var dstFactor: js.UndefOr[GPUBlendFactor] = js.undefined
  
  var operation: js.UndefOr[GPUBlendOperation] = js.undefined
  
  var srcFactor: js.UndefOr[GPUBlendFactor] = js.undefined
}
object GPUBlendComponent {
  
  inline def apply(): GPUBlendComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUBlendComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBlendComponent] (val x: Self) extends AnyVal {
    
    inline def setDstFactor(value: GPUBlendFactor): Self = StObject.set(x, "dstFactor", value.asInstanceOf[js.Any])
    
    inline def setDstFactorUndefined: Self = StObject.set(x, "dstFactor", js.undefined)
    
    inline def setOperation(value: GPUBlendOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setSrcFactor(value: GPUBlendFactor): Self = StObject.set(x, "srcFactor", value.asInstanceOf[js.Any])
    
    inline def setSrcFactorUndefined: Self = StObject.set(x, "srcFactor", js.undefined)
  }
}
