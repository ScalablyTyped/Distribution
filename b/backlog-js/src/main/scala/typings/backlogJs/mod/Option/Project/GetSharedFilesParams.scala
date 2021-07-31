package typings.backlogJs.mod.Option.Project

import typings.backlogJs.mod.Option.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSharedFilesParams extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
}
object GetSharedFilesParams {
  
  @scala.inline
  def apply(): GetSharedFilesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSharedFilesParams]
  }
  
  @scala.inline
  implicit class GetSharedFilesParamsMutableBuilder[Self <: GetSharedFilesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
