package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonManagedKafkaEventSourceConfig extends StObject {
  
  /**
    * The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your Kafka event sources. After creating a Kafka event source mapping with the consumer group ID specified, you cannot update this value. For more information, see services-msk-consumer-group-id.
    */
  var ConsumerGroupId: js.UndefOr[URI] = js.undefined
}
object AmazonManagedKafkaEventSourceConfig {
  
  inline def apply(): AmazonManagedKafkaEventSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonManagedKafkaEventSourceConfig]
  }
  
  extension [Self <: AmazonManagedKafkaEventSourceConfig](x: Self) {
    
    inline def setConsumerGroupId(value: URI): Self = StObject.set(x, "ConsumerGroupId", value.asInstanceOf[js.Any])
    
    inline def setConsumerGroupIdUndefined: Self = StObject.set(x, "ConsumerGroupId", js.undefined)
  }
}
