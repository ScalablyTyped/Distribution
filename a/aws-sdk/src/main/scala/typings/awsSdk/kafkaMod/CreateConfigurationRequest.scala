package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationRequest extends StObject {
  
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * 
    The versions of Apache Kafka with which you can use this MSK configuration.
    
    */
  var KafkaVersions: js.UndefOr[listOfString] = js.native
  
  /**
    * 
    The name of the configuration.
    
    */
  var Name: string = js.native
  
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: _Blob = js.native
}
object CreateConfigurationRequest {
  
  @scala.inline
  def apply(Name: string, ServerProperties: _Blob): CreateConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ServerProperties = ServerProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationRequestMutableBuilder[Self <: CreateConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKafkaVersions(value: listOfString): Self = StObject.set(x, "KafkaVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaVersionsUndefined: Self = StObject.set(x, "KafkaVersions", js.undefined)
    
    @scala.inline
    def setKafkaVersionsVarargs(value: string*): Self = StObject.set(x, "KafkaVersions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerProperties(value: _Blob): Self = StObject.set(x, "ServerProperties", value.asInstanceOf[js.Any])
  }
}
