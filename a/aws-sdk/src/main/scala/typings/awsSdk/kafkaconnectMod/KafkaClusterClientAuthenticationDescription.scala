package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaClusterClientAuthenticationDescription extends StObject {
  
  /**
    * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client authentication is used.
    */
  var authenticationType: js.UndefOr[KafkaClusterClientAuthenticationType] = js.undefined
}
object KafkaClusterClientAuthenticationDescription {
  
  inline def apply(): KafkaClusterClientAuthenticationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClusterClientAuthenticationDescription]
  }
  
  extension [Self <: KafkaClusterClientAuthenticationDescription](x: Self) {
    
    inline def setAuthenticationType(value: KafkaClusterClientAuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
  }
}
