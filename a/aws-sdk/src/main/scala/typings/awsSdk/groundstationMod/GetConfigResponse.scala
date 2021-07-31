package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigResponse extends StObject {
  
  /**
    * ARN of a Config 
    */
  var configArn: ConfigArn
  
  /**
    * Data elements in a Config.
    */
  var configData: ConfigTypeData
  
  /**
    * UUID of a Config.
    */
  var configId: String
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
  
  /**
    * Name of a Config.
    */
  var name: String
  
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object GetConfigResponse {
  
  @scala.inline
  def apply(configArn: ConfigArn, configData: ConfigTypeData, configId: String, name: String): GetConfigResponse = {
    val __obj = js.Dynamic.literal(configArn = configArn.asInstanceOf[js.Any], configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigResponse]
  }
  
  @scala.inline
  implicit class GetConfigResponseMutableBuilder[Self <: GetConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigArn(value: ConfigArn): Self = StObject.set(x, "configArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigData(value: ConfigTypeData): Self = StObject.set(x, "configData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
