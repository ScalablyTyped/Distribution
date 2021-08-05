package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigRequest extends StObject {
  
  /**
    * Parameters of a Config.
    */
  var configData: ConfigTypeData
  
  /**
    * Name of a Config.
    */
  var name: SafeName
  
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateConfigRequest {
  
  inline def apply(configData: ConfigTypeData, name: SafeName): CreateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigRequest]
  }
  
  extension [Self <: CreateConfigRequest](x: Self) {
    
    inline def setConfigData(value: ConfigTypeData): Self = StObject.set(x, "configData", value.asInstanceOf[js.Any])
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
