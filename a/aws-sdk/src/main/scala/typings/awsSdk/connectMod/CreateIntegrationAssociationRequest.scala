package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationAssociationRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The Amazon Resource Name (ARN) of the integration.  When integrating with Amazon Pinpoint, the Amazon Connect and Amazon Pinpoint instances must be in the same account. 
    */
  var IntegrationArn: ARN
  
  /**
    * The type of information to be ingested.
    */
  var IntegrationType: typings.awsSdk.connectMod.IntegrationType
  
  /**
    * The name of the external application. This field is only required for the EVENT integration type.
    */
  var SourceApplicationName: js.UndefOr[typings.awsSdk.connectMod.SourceApplicationName] = js.undefined
  
  /**
    * The URL for the external application. This field is only required for the EVENT integration type.
    */
  var SourceApplicationUrl: js.UndefOr[URI] = js.undefined
  
  /**
    * The type of the data source. This field is only required for the EVENT integration type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.connectMod.SourceType] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateIntegrationAssociationRequest {
  
  inline def apply(InstanceId: InstanceId, IntegrationArn: ARN, IntegrationType: IntegrationType): CreateIntegrationAssociationRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], IntegrationArn = IntegrationArn.asInstanceOf[js.Any], IntegrationType = IntegrationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationAssociationRequest]
  }
  
  extension [Self <: CreateIntegrationAssociationRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationArn(value: ARN): Self = StObject.set(x, "IntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setIntegrationType(value: IntegrationType): Self = StObject.set(x, "IntegrationType", value.asInstanceOf[js.Any])
    
    inline def setSourceApplicationName(value: SourceApplicationName): Self = StObject.set(x, "SourceApplicationName", value.asInstanceOf[js.Any])
    
    inline def setSourceApplicationNameUndefined: Self = StObject.set(x, "SourceApplicationName", js.undefined)
    
    inline def setSourceApplicationUrl(value: URI): Self = StObject.set(x, "SourceApplicationUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceApplicationUrlUndefined: Self = StObject.set(x, "SourceApplicationUrl", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
