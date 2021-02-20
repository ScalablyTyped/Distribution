package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTagsRequest extends StObject {
  
  /**
    * A list of configuration items that you want to tag.
    */
  var configurationIds: ConfigurationIdList = js.native
  
  /**
    * Tags that you want to associate with one or more configuration items. Specify the tags that you want to create in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: TagSet = js.native
}
object CreateTagsRequest {
  
  @scala.inline
  def apply(configurationIds: ConfigurationIdList, tags: TagSet): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  
  @scala.inline
  implicit class CreateTagsRequestMutableBuilder[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagSet): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
