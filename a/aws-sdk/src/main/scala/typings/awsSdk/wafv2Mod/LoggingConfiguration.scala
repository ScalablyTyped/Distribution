package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfiguration extends StObject {
  
  /**
    * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
    */
  var LogDestinationConfigs: typings.awsSdk.wafv2Mod.LogDestinationConfigs = js.native
  
  /**
    * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.native
  
  /**
    * The parts of the request that you want to keep out of the logs. For example, if you redact the HEADER field, the HEADER field in the firehose will be xxx.   You must use one of the following values: URI, QUERY_STRING, HEADER, or METHOD. 
    */
  var RedactedFields: js.UndefOr[typings.awsSdk.wafv2Mod.RedactedFields] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
}
object LoggingConfiguration {
  
  @scala.inline
  def apply(LogDestinationConfigs: LogDestinationConfigs, ResourceArn: ResourceArn): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit class LoggingConfigurationMutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogDestinationConfigs(value: LogDestinationConfigs): Self = StObject.set(x, "LogDestinationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationConfigsVarargs(value: ResourceArn*): Self = StObject.set(x, "LogDestinationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setManagedByFirewallManager(value: Boolean): Self = StObject.set(x, "ManagedByFirewallManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByFirewallManagerUndefined: Self = StObject.set(x, "ManagedByFirewallManager", js.undefined)
    
    @scala.inline
    def setRedactedFields(value: RedactedFields): Self = StObject.set(x, "RedactedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedFieldsUndefined: Self = StObject.set(x, "RedactedFields", js.undefined)
    
    @scala.inline
    def setRedactedFieldsVarargs(value: FieldToMatch*): Self = StObject.set(x, "RedactedFields", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
