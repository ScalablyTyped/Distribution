package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[timestampIso8601] = js.native
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
    Latest revision of the configuration.
    
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.native
  /**
    * 
    The name of the configuration.
    
    */
  var Name: js.UndefOr[string] = js.native
}

object DescribeConfigurationResponse {
  @scala.inline
  def apply(): DescribeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationResponseOps[Self <: DescribeConfigurationResponse] (val x: Self) extends AnyVal {
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
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
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
    @scala.inline
    def setLatestRevision(value: ConfigurationRevision): Self = this.set("LatestRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestRevision: Self = this.set("LatestRevision", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

