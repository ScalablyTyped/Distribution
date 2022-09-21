package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuickConnectRequest extends StObject {
  
  /**
    * The description of the quick connect.
    */
  var Description: js.UndefOr[QuickConnectDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The name of the quick connect.
    */
  var Name: QuickConnectName
  
  /**
    * Configuration settings for the quick connect.
    */
  var QuickConnectConfig: typings.awsSdk.connectMod.QuickConnectConfig
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateQuickConnectRequest {
  
  inline def apply(InstanceId: InstanceId, Name: QuickConnectName, QuickConnectConfig: QuickConnectConfig): CreateQuickConnectRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QuickConnectConfig = QuickConnectConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuickConnectRequest]
  }
  
  extension [Self <: CreateQuickConnectRequest](x: Self) {
    
    inline def setDescription(value: QuickConnectDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: QuickConnectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectConfig(value: QuickConnectConfig): Self = StObject.set(x, "QuickConnectConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
