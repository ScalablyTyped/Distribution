package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchConfigurationTemplateRequest extends StObject {
  
  /**
    * Request to associate the default Application Migration Service Security group with the Replication Settings template.
    */
  var postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined
  
  /**
    * Request to associate the default Application Migration Service Security group with the Replication Settings template.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateLaunchConfigurationTemplateRequest {
  
  inline def apply(): CreateLaunchConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchConfigurationTemplateRequest]
  }
  
  extension [Self <: CreateLaunchConfigurationTemplateRequest](x: Self) {
    
    inline def setPostLaunchActions(value: PostLaunchActions): Self = StObject.set(x, "postLaunchActions", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsUndefined: Self = StObject.set(x, "postLaunchActions", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
