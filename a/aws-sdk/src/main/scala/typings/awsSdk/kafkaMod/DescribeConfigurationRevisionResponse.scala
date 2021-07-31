package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRevisionResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The revision number.
    
    */
  var Revision: js.UndefOr[long] = js.undefined
  
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: js.UndefOr[_Blob] = js.undefined
}
object DescribeConfigurationRevisionResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRevisionResponseMutableBuilder[Self <: DescribeConfigurationRevisionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
    
    @scala.inline
    def setServerProperties(value: _Blob): Self = StObject.set(x, "ServerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPropertiesUndefined: Self = StObject.set(x, "ServerProperties", js.undefined)
  }
}
