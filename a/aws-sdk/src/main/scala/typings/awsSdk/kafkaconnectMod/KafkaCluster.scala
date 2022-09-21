package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaCluster extends StObject {
  
  /**
    * The Apache Kafka cluster to which the connector is connected.
    */
  var apacheKafkaCluster: ApacheKafkaCluster
}
object KafkaCluster {
  
  inline def apply(apacheKafkaCluster: ApacheKafkaCluster): KafkaCluster = {
    val __obj = js.Dynamic.literal(apacheKafkaCluster = apacheKafkaCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaCluster]
  }
  
  extension [Self <: KafkaCluster](x: Self) {
    
    inline def setApacheKafkaCluster(value: ApacheKafkaCluster): Self = StObject.set(x, "apacheKafkaCluster", value.asInstanceOf[js.Any])
  }
}
