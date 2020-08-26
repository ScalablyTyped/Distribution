package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: string = js.native
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: timestampIso8601 = js.native
  /**
    * 
    The description of the configuration.
    
    */
  var Description: string = js.native
  /**
    * 
    An array of the versions of Apache Kafka with which you can use this MSK configuration. You can use this configuration for an MSK cluster only if the Apache Kafka version specified for the cluster appears in this array.
    
    */
  var KafkaVersions: listOfString = js.native
  /**
    * 
    Latest revision of the configuration.
    
    */
  var LatestRevision: ConfigurationRevision = js.native
  /**
    * 
    The name of the configuration.
    
    */
  var Name: string = js.native
}

object Configuration {
  @scala.inline
  def apply(
    Arn: string,
    CreationTime: timestampIso8601,
    Description: string,
    KafkaVersions: listOfString,
    LatestRevision: ConfigurationRevision,
    Name: string
  ): Configuration = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], KafkaVersions = KafkaVersions.asInstanceOf[js.Any], LatestRevision = LatestRevision.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKafkaVersionsVarargs(value: string*): Self = this.set("KafkaVersions", js.Array(value :_*))
    @scala.inline
    def setKafkaVersions(value: listOfString): Self = this.set("KafkaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestRevision(value: ConfigurationRevision): Self = this.set("LatestRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

