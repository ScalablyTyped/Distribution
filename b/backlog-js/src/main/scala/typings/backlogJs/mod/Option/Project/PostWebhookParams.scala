package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostWebhookParams extends StObject {
  
  var activityTypeIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var allEvent: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var hookUrl: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PostWebhookParams {
  
  @scala.inline
  def apply(): PostWebhookParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostWebhookParams]
  }
  
  @scala.inline
  implicit class PostWebhookParamsMutableBuilder[Self <: PostWebhookParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityTypeIds(value: js.Array[Double]): Self = StObject.set(x, "activityTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeIdsUndefined: Self = StObject.set(x, "activityTypeIds", js.undefined)
    
    @scala.inline
    def setActivityTypeIdsVarargs(value: Double*): Self = StObject.set(x, "activityTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setAllEvent(value: Boolean): Self = StObject.set(x, "allEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllEventUndefined: Self = StObject.set(x, "allEvent", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHookUrl(value: String): Self = StObject.set(x, "hookUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookUrlUndefined: Self = StObject.set(x, "hookUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
