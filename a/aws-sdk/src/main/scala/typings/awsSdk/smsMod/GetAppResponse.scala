package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppResponse extends StObject {
  
  /**
    * Information about the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.undefined
  
  /**
    * The server groups that belong to the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  
  /**
    * The tags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object GetAppResponse {
  
  @scala.inline
  def apply(): GetAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppResponse]
  }
  
  @scala.inline
  implicit class GetAppResponseMutableBuilder[Self <: GetAppResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppSummary(value: AppSummary): Self = StObject.set(x, "appSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSummaryUndefined: Self = StObject.set(x, "appSummary", js.undefined)
    
    @scala.inline
    def setServerGroups(value: ServerGroups): Self = StObject.set(x, "serverGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupsUndefined: Self = StObject.set(x, "serverGroups", js.undefined)
    
    @scala.inline
    def setServerGroupsVarargs(value: ServerGroup*): Self = StObject.set(x, "serverGroups", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
