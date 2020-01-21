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
}

