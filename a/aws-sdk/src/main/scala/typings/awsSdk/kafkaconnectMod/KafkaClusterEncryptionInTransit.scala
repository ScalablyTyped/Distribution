package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaClusterEncryptionInTransit extends StObject {
  
  /**
    * The type of encryption in transit to the Apache Kafka cluster.
    */
  var encryptionType: KafkaClusterEncryptionInTransitType
}
object KafkaClusterEncryptionInTransit {
  
  inline def apply(encryptionType: KafkaClusterEncryptionInTransitType): KafkaClusterEncryptionInTransit = {
    val __obj = js.Dynamic.literal(encryptionType = encryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaClusterEncryptionInTransit]
  }
  
  extension [Self <: KafkaClusterEncryptionInTransit](x: Self) {
    
    inline def setEncryptionType(value: KafkaClusterEncryptionInTransitType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
  }
}
