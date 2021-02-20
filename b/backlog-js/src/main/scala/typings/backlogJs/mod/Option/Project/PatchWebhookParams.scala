package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchWebhookParams extends StObject {
  
  var activityTypeIds: js.UndefOr[js.Array[Double]] = js.native
  
  var allEvent: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var hookUrl: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object PatchWebhookParams {
  
  @scala.inline
  def apply(): PatchWebhookParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchWebhookParams]
  }
  
  @scala.inline
  implicit class PatchWebhookParamsMutableBuilder[Self <: PatchWebhookParams] (val x: Self) extends AnyVal {
    
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
