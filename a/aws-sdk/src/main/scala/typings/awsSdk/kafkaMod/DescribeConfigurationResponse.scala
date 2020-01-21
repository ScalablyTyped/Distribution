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
  def apply(
    Arn: string = null,
    CreationTime: timestampIso8601 = null,
    Description: string = null,
    KafkaVersions: listOfString = null,
    LatestRevision: ConfigurationRevision = null,
    Name: string = null
  ): DescribeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (KafkaVersions != null) __obj.updateDynamic("KafkaVersions")(KafkaVersions.asInstanceOf[js.Any])
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationResponse]
  }
}

