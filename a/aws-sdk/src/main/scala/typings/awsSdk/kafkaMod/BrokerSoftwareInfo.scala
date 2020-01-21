package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerSoftwareInfo extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration used for the cluster. This field isn't visible in this preview release.
    
    */
  var ConfigurationArn: js.UndefOr[string] = js.native
  /**
    * 
    The revision of the configuration to use. This field isn't visible in this preview release.
    
    */
  var ConfigurationRevision: js.UndefOr[long] = js.native
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.native
}

object BrokerSoftwareInfo {
  @scala.inline
  def apply(
    ConfigurationArn: string = null,
    ConfigurationRevision: Int | Double = null,
    KafkaVersion: string = null
  ): BrokerSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationArn != null) __obj.updateDynamic("ConfigurationArn")(ConfigurationArn.asInstanceOf[js.Any])
    if (ConfigurationRevision != null) __obj.updateDynamic("ConfigurationRevision")(ConfigurationRevision.asInstanceOf[js.Any])
    if (KafkaVersion != null) __obj.updateDynamic("KafkaVersion")(KafkaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerSoftwareInfo]
  }
}

