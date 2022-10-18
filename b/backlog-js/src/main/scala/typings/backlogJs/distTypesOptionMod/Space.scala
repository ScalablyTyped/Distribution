package typings.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Space {
  
  trait GetActivitiesParams extends StObject {
    
    var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetActivitiesParams {
    
    inline def apply(): GetActivitiesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetActivitiesParams]
    }
    
    extension [Self <: GetActivitiesParams](x: Self) {
      
      inline def setActivityTypeId(value: js.Array[ActivityType]): Self = StObject.set(x, "activityTypeId", value.asInstanceOf[js.Any])
      
      inline def setActivityTypeIdUndefined: Self = StObject.set(x, "activityTypeId", js.undefined)
      
      inline def setActivityTypeIdVarargs(value: ActivityType*): Self = StObject.set(x, "activityTypeId", js.Array(value*))
      
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
  
  trait PutSpaceNotificationParams extends StObject {
    
    var content: String
  }
  object PutSpaceNotificationParams {
    
    inline def apply(content: String): PutSpaceNotificationParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutSpaceNotificationParams]
    }
    
    extension [Self <: PutSpaceNotificationParams](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
