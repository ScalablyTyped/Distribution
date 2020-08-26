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
  implicit class CreateConfigurationRequestOps[Self <: CreateConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerProperties(value: _Blob): Self = this.set("ServerProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setKafkaVersionsVarargs(value: string*): Self = this.set("KafkaVersions", js.Array(value :_*))
    @scala.inline
    def setKafkaVersions(value: listOfString): Self = this.set("KafkaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKafkaVersions: Self = this.set("KafkaVersions", js.undefined)
  }
  
}

