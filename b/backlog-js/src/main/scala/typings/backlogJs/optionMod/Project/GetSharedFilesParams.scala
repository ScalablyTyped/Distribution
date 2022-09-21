package typings.backlogJs.optionMod.Project

import typings.backlogJs.optionMod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSharedFilesParams extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
}
object GetSharedFilesParams {
  
  inline def apply(): GetSharedFilesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSharedFilesParams]
  }
  
  extension [Self <: GetSharedFilesParams](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
