package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
    */
  var LogDestinationConfigs: typings.awsSdk.wafv2Mod.LogDestinationConfigs
  
  /**
    * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parts of the request that you want to keep out of the logs. For example, if you redact the HEADER field, the HEADER field in the firehose will be xxx.   You must use one of the following values: URI, QUERY_STRING, HEADER, or METHOD. 
    */
  var RedactedFields: js.UndefOr[typings.awsSdk.wafv2Mod.RedactedFields] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn
}
object LoggingConfiguration {
  
  inline def apply(LogDestinationConfigs: LogDestinationConfigs, ResourceArn: ResourceArn): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  extension [Self <: LoggingConfiguration](x: Self) {
    
    inline def setLogDestinationConfigs(value: LogDestinationConfigs): Self = StObject.set(x, "LogDestinationConfigs", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationConfigsVarargs(value: ResourceArn*): Self = StObject.set(x, "LogDestinationConfigs", js.Array(value :_*))
    
    inline def setManagedByFirewallManager(value: Boolean): Self = StObject.set(x, "ManagedByFirewallManager", value.asInstanceOf[js.Any])
    
    inline def setManagedByFirewallManagerUndefined: Self = StObject.set(x, "ManagedByFirewallManager", js.undefined)
    
    inline def setRedactedFields(value: RedactedFields): Self = StObject.set(x, "RedactedFields", value.asInstanceOf[js.Any])
    
    inline def setRedactedFieldsUndefined: Self = StObject.set(x, "RedactedFields", js.undefined)
    
    inline def setRedactedFieldsVarargs(value: FieldToMatch*): Self = StObject.set(x, "RedactedFields", js.Array(value :_*))
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
