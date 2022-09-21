package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorRequest extends StObject {
  
  /**
    * Information about the capacity allocated to the connector. Exactly one of the two properties must be specified.
    */
  var capacity: Capacity
  
  /**
    * A map of keys to values that represent the configuration for the connector.
    */
  var connectorConfiguration: SyntheticCreateConnectorRequestMapOfString
  
  /**
    * A summary description of the connector.
    */
  var connectorDescription: js.UndefOr[stringMax1024] = js.undefined
  
  /**
    * The name of the connector.
    */
  var connectorName: stringMin1Max128
  
  /**
    * Specifies which Apache Kafka cluster to connect to.
    */
  var kafkaCluster: KafkaCluster
  
  /**
    * Details of the client authentication used by the Apache Kafka cluster.
    */
  var kafkaClusterClientAuthentication: KafkaClusterClientAuthentication
  
  /**
    * Details of encryption in transit to the Apache Kafka cluster.
    */
  var kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransit
  
  /**
    * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
    */
  var kafkaConnectVersion: string
  
  /**
    * Details about log delivery.
    */
  var logDelivery: js.UndefOr[LogDelivery] = js.undefined
  
  /**
    * Specifies which plugins to use for the connector.
    */
  var plugins: listOfPlugin
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
    */
  var serviceExecutionRoleArn: string
  
  /**
    * Specifies which worker configuration to use with the connector.
    */
  var workerConfiguration: js.UndefOr[WorkerConfiguration] = js.undefined
}
object CreateConnectorRequest {
  
  inline def apply(
    capacity: Capacity,
    connectorConfiguration: SyntheticCreateConnectorRequestMapOfString,
    connectorName: stringMin1Max128,
    kafkaCluster: KafkaCluster,
    kafkaClusterClientAuthentication: KafkaClusterClientAuthentication,
    kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransit,
    kafkaConnectVersion: string,
    plugins: listOfPlugin,
    serviceExecutionRoleArn: string
  ): CreateConnectorRequest = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], connectorConfiguration = connectorConfiguration.asInstanceOf[js.Any], connectorName = connectorName.asInstanceOf[js.Any], kafkaCluster = kafkaCluster.asInstanceOf[js.Any], kafkaClusterClientAuthentication = kafkaClusterClientAuthentication.asInstanceOf[js.Any], kafkaClusterEncryptionInTransit = kafkaClusterEncryptionInTransit.asInstanceOf[js.Any], kafkaConnectVersion = kafkaConnectVersion.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], serviceExecutionRoleArn = serviceExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorRequest]
  }
  
  extension [Self <: CreateConnectorRequest](x: Self) {
    
    inline def setCapacity(value: Capacity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setConnectorConfiguration(value: SyntheticCreateConnectorRequestMapOfString): Self = StObject.set(x, "connectorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConnectorDescription(value: stringMax1024): Self = StObject.set(x, "connectorDescription", value.asInstanceOf[js.Any])
    
    inline def setConnectorDescriptionUndefined: Self = StObject.set(x, "connectorDescription", js.undefined)
    
    inline def setConnectorName(value: stringMin1Max128): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setKafkaCluster(value: KafkaCluster): Self = StObject.set(x, "kafkaCluster", value.asInstanceOf[js.Any])
    
    inline def setKafkaClusterClientAuthentication(value: KafkaClusterClientAuthentication): Self = StObject.set(x, "kafkaClusterClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setKafkaClusterEncryptionInTransit(value: KafkaClusterEncryptionInTransit): Self = StObject.set(x, "kafkaClusterEncryptionInTransit", value.asInstanceOf[js.Any])
    
    inline def setKafkaConnectVersion(value: string): Self = StObject.set(x, "kafkaConnectVersion", value.asInstanceOf[js.Any])
    
    inline def setLogDelivery(value: LogDelivery): Self = StObject.set(x, "logDelivery", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryUndefined: Self = StObject.set(x, "logDelivery", js.undefined)
    
    inline def setPlugins(value: listOfPlugin): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setServiceExecutionRoleArn(value: string): Self = StObject.set(x, "serviceExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfiguration(value: WorkerConfiguration): Self = StObject.set(x, "workerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationUndefined: Self = StObject.set(x, "workerConfiguration", js.undefined)
  }
}
