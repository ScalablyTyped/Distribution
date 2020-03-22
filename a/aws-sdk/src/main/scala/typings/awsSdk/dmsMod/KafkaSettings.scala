package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KafkaSettings extends js.Object {
  /**
    * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form  broker-hostname-or-ip:port . For example, "ec2-12-345-678-901.compute-1.amazonaws.com:2345".
    */
  var Broker: js.UndefOr[String] = js.native
  /**
    * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies "kafka-default-topic" as the migration topic.
    */
  var Topic: js.UndefOr[String] = js.native
}

object KafkaSettings {
  @scala.inline
  def apply(Broker: String = null, Topic: String = null): KafkaSettings = {
    val __obj = js.Dynamic.literal()
    if (Broker != null) __obj.updateDynamic("Broker")(Broker.asInstanceOf[js.Any])
    if (Topic != null) __obj.updateDynamic("Topic")(Topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaSettings]
  }
}

