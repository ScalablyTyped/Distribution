package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notification {
  
  trait GetNotificationsCountParams extends StObject {
    
    var alreadyRead: Boolean
    
    var resourceAlreadyRead: Boolean
  }
  object GetNotificationsCountParams {
    
    inline def apply(alreadyRead: Boolean, resourceAlreadyRead: Boolean): GetNotificationsCountParams = {
      val __obj = js.Dynamic.literal(alreadyRead = alreadyRead.asInstanceOf[js.Any], resourceAlreadyRead = resourceAlreadyRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNotificationsCountParams]
    }
    
    extension [Self <: GetNotificationsCountParams](x: Self) {
      
      inline def setAlreadyRead(value: Boolean): Self = StObject.set(x, "alreadyRead", value.asInstanceOf[js.Any])
      
      inline def setResourceAlreadyRead(value: Boolean): Self = StObject.set(x, "resourceAlreadyRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetNotificationsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetNotificationsParams {
    
    inline def apply(): GetNotificationsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNotificationsParams]
    }
    
    extension [Self <: GetNotificationsParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      inline def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      inline def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      inline def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
