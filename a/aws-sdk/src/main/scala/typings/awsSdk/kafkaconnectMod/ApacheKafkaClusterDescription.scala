package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApacheKafkaClusterDescription extends StObject {
  
  /**
    * The bootstrap servers of the cluster.
    */
  var bootstrapServers: js.UndefOr[string] = js.undefined
  
  /**
    * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
    */
  var vpc: js.UndefOr[VpcDescription] = js.undefined
}
object ApacheKafkaClusterDescription {
  
  inline def apply(): ApacheKafkaClusterDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApacheKafkaClusterDescription]
  }
  
  extension [Self <: ApacheKafkaClusterDescription](x: Self) {
    
    inline def setBootstrapServers(value: string): Self = StObject.set(x, "bootstrapServers", value.asInstanceOf[js.Any])
    
    inline def setBootstrapServersUndefined: Self = StObject.set(x, "bootstrapServers", js.undefined)
    
    inline def setVpc(value: VpcDescription): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
