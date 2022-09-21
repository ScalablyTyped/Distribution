package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationAssociationSummary extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.connectMod.InstanceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the AppIntegration.
    */
  var IntegrationArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the AppIntegration association.
    */
  var IntegrationAssociationArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the AppIntegration association.
    */
  var IntegrationAssociationId: js.UndefOr[typings.awsSdk.connectMod.IntegrationAssociationId] = js.undefined
  
  /**
    * The integration type.
    */
  var IntegrationType: js.UndefOr[typings.awsSdk.connectMod.IntegrationType] = js.undefined
  
  /**
    * The user-provided, friendly name for the external application.
    */
  var SourceApplicationName: js.UndefOr[typings.awsSdk.connectMod.SourceApplicationName] = js.undefined
  
  /**
    * The URL for the external application.
    */
  var SourceApplicationUrl: js.UndefOr[URI] = js.undefined
  
  /**
    * The name of the source.
    */
  var SourceType: js.UndefOr[typings.awsSdk.connectMod.SourceType] = js.undefined
}
object IntegrationAssociationSummary {
  
  inline def apply(): IntegrationAssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationAssociationSummary]
  }
  
  extension [Self <: IntegrationAssociationSummary](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setIntegrationArn(value: ARN): Self = StObject.set(x, "IntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setIntegrationArnUndefined: Self = StObject.set(x, "IntegrationArn", js.undefined)
    
    inline def setIntegrationAssociationArn(value: ARN): Self = StObject.set(x, "IntegrationAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationArnUndefined: Self = StObject.set(x, "IntegrationAssociationArn", js.undefined)
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationIdUndefined: Self = StObject.set(x, "IntegrationAssociationId", js.undefined)
    
    inline def setIntegrationType(value: IntegrationType): Self = StObject.set(x, "IntegrationType", value.asInstanceOf[js.Any])
    
    inline def setIntegrationTypeUndefined: Self = StObject.set(x, "IntegrationType", js.undefined)
    
    inline def setSourceApplicationName(value: SourceApplicationName): Self = StObject.set(x, "SourceApplicationName", value.asInstanceOf[js.Any])
    
    inline def setSourceApplicationNameUndefined: Self = StObject.set(x, "SourceApplicationName", js.undefined)
    
    inline def setSourceApplicationUrl(value: URI): Self = StObject.set(x, "SourceApplicationUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceApplicationUrlUndefined: Self = StObject.set(x, "SourceApplicationUrl", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
