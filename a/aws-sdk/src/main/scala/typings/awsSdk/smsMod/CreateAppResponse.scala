package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppResponse extends StObject {
  
  /**
    * A summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.undefined
  
  /**
    * The server groups included in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  
  /**
    * The tags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateAppResponse {
  
  inline def apply(): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  extension [Self <: CreateAppResponse](x: Self) {
    
    inline def setAppSummary(value: AppSummary): Self = StObject.set(x, "appSummary", value.asInstanceOf[js.Any])
    
    inline def setAppSummaryUndefined: Self = StObject.set(x, "appSummary", js.undefined)
    
    inline def setServerGroups(value: ServerGroups): Self = StObject.set(x, "serverGroups", value.asInstanceOf[js.Any])
    
    inline def setServerGroupsUndefined: Self = StObject.set(x, "serverGroups", js.undefined)
    
    inline def setServerGroupsVarargs(value: ServerGroup*): Self = StObject.set(x, "serverGroups", js.Array(value :_*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
