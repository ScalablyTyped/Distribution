package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * An array of Amazon Kinesis Data Firehose ARNs.
    */
  var LogDestinationConfigs: typings.awsSdk.wafMod.LogDestinationConfigs
  
  /**
    * The parts of the request that you want redacted from the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
    */
  var RedactedFields: js.UndefOr[typings.awsSdk.wafMod.RedactedFields] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsSdk.wafMod.ResourceArn
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
    def setRedactedFields(value: RedactedFields): Self = StObject.set(x, "RedactedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedFieldsUndefined: Self = StObject.set(x, "RedactedFields", js.undefined)
    
    @scala.inline
    def setRedactedFieldsVarargs(value: FieldToMatch*): Self = StObject.set(x, "RedactedFields", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
