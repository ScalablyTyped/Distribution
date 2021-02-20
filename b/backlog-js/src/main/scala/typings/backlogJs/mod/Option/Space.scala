package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Space {
  
  @js.native
  trait GetActivitiesParams extends StObject {
    
    var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var maxId: js.UndefOr[Double] = js.native
    
    var minId: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetActivitiesParams {
    
    @scala.inline
    def apply(): GetActivitiesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetActivitiesParams]
    }
    
    @scala.inline
    implicit class GetActivitiesParamsMutableBuilder[Self <: GetActivitiesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityTypeId(value: js.Array[ActivityType]): Self = StObject.set(x, "activityTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTypeIdUndefined: Self = StObject.set(x, "activityTypeId", js.undefined)
      
      @scala.inline
      def setActivityTypeIdVarargs(value: ActivityType*): Self = StObject.set(x, "activityTypeId", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      @scala.inline
      def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait PutSpaceNotificationParams extends StObject {
    
    var content: String = js.native
  }
  object PutSpaceNotificationParams {
    
    @scala.inline
    def apply(content: String): PutSpaceNotificationParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutSpaceNotificationParams]
    }
    
    @scala.inline
    implicit class PutSpaceNotificationParamsMutableBuilder[Self <: PutSpaceNotificationParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
