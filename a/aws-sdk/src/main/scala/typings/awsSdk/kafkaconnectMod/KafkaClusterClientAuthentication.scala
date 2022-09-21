package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaClusterClientAuthentication extends StObject {
  
  /**
    * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client authentication is used.
    */
  var authenticationType: KafkaClusterClientAuthenticationType
}
object KafkaClusterClientAuthentication {
  
  inline def apply(authenticationType: KafkaClusterClientAuthenticationType): KafkaClusterClientAuthentication = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaClusterClientAuthentication]
  }
  
  extension [Self <: KafkaClusterClientAuthentication](x: Self) {
    
    inline def setAuthenticationType(value: KafkaClusterClientAuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
  }
}
