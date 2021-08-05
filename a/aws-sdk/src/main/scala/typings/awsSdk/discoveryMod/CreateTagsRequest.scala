package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagsRequest extends StObject {
  
  /**
    * A list of configuration items that you want to tag.
    */
  var configurationIds: ConfigurationIdList
  
  /**
    * Tags that you want to associate with one or more configuration items. Specify the tags that you want to create in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: TagSet
}
object CreateTagsRequest {
  
  inline def apply(configurationIds: ConfigurationIdList, tags: TagSet): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  
  extension [Self <: CreateTagsRequest](x: Self) {
    
    inline def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
    
    inline def setTags(value: TagSet): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
