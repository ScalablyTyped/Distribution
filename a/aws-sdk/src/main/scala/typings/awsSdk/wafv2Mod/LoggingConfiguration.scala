package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * The logging destination configuration that you want to associate with the web ACL.  You can associate one logging destination to a web ACL. 
    */
  var LogDestinationConfigs: typings.awsSdk.wafv2Mod.LogDestinationConfigs
  
  /**
    * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. 
    */
  var LoggingFilter: js.UndefOr[typings.awsSdk.wafv2Mod.LoggingFilter] = js.undefined
  
  /**
    * Indicates whether the logging configuration was created by Firewall Manager, as part of an WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parts of the request that you want to keep out of the logs. For example, if you redact the SingleHeader field, the HEADER field in the logs will be xxx.   You can specify only the following fields for redaction: UriPath, QueryString, SingleHeader, Method, and JsonBody. 
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
    
    inline def setLogDestinationConfigsVarargs(value: ResourceArn*): Self = StObject.set(x, "LogDestinationConfigs", js.Array(value*))
    
    inline def setLoggingFilter(value: LoggingFilter): Self = StObject.set(x, "LoggingFilter", value.asInstanceOf[js.Any])
    
    inline def setLoggingFilterUndefined: Self = StObject.set(x, "LoggingFilter", js.undefined)
    
    inline def setManagedByFirewallManager(value: Boolean): Self = StObject.set(x, "ManagedByFirewallManager", value.asInstanceOf[js.Any])
    
    inline def setManagedByFirewallManagerUndefined: Self = StObject.set(x, "ManagedByFirewallManager", js.undefined)
    
    inline def setRedactedFields(value: RedactedFields): Self = StObject.set(x, "RedactedFields", value.asInstanceOf[js.Any])
    
    inline def setRedactedFieldsUndefined: Self = StObject.set(x, "RedactedFields", js.undefined)
    
    inline def setRedactedFieldsVarargs(value: FieldToMatch*): Self = StObject.set(x, "RedactedFields", js.Array(value*))
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
