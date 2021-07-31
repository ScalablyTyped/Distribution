package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationResponse extends StObject {
  
  /**
    * Required. The ARN of the configuration.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The authentication strategy associated with the configuration.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.mqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Required. The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.undefined
  
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The list of all tags associated with this configuration.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object DescribeConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationResponseMutableBuilder[Self <: DescribeConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    @scala.inline
    def setCreated(value: timestampIso8601): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLatestRevision(value: ConfigurationRevision): Self = StObject.set(x, "LatestRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestRevisionUndefined: Self = StObject.set(x, "LatestRevision", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
