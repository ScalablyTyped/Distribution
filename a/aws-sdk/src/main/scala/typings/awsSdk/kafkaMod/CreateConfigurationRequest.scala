package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationRequest extends js.Object {
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * 
    The versions of Apache Kafka with which you can use this MSK configuration.
    
    */
  var KafkaVersions: listOfString = js.native
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
  def apply(KafkaVersions: listOfString, Name: string, ServerProperties: _Blob, Description: string = null): CreateConfigurationRequest = {
    val __obj = js.Dynamic.literal(KafkaVersions = KafkaVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServerProperties = ServerProperties.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationRequest]
  }
}

