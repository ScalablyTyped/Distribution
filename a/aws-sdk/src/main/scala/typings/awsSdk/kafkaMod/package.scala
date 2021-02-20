package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kafkaMod {
  
  type BrokerAZDistribution = typings.awsSdk.awsSdkStrings.DEFAULT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TLS
    - typings.awsSdk.awsSdkStrings.TLS_PLAINTEXT
    - typings.awsSdk.awsSdkStrings.PLAINTEXT
    - java.lang.String
  */
  type ClientBroker = typings.awsSdk.kafkaMod._ClientBroker | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kafkaMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ClusterState = typings.awsSdk.kafkaMod._ClusterState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type ConfigurationState = typings.awsSdk.kafkaMod._ConfigurationState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.PER_BROKER
    - typings.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER
    - typings.awsSdk.awsSdkStrings.PER_TOPIC_PER_PARTITION
    - java.lang.String
  */
  type EnhancedMonitoring = typings.awsSdk.kafkaMod._EnhancedMonitoring | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type KafkaVersionStatus = typings.awsSdk.kafkaMod._KafkaVersionStatus | java.lang.String
  
  type MaxResults = scala.Double
  
  type NodeType = typings.awsSdk.awsSdkStrings.BROKER | java.lang.String
  
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kafkaMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-14`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kafkaMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type double = scala.Double
  
  type integer = scala.Double
  
  type integerMin1Max15 = scala.Double
  
  type integerMin1Max16384 = scala.Double
  
  type listOfBrokerEBSVolumeInfo = js.Array[typings.awsSdk.kafkaMod.BrokerEBSVolumeInfo]
  
  type listOfClusterInfo = js.Array[typings.awsSdk.kafkaMod.ClusterInfo]
  
  type listOfClusterOperationInfo = js.Array[typings.awsSdk.kafkaMod.ClusterOperationInfo]
  
  type listOfClusterOperationStep = js.Array[typings.awsSdk.kafkaMod.ClusterOperationStep]
  
  type listOfCompatibleKafkaVersion = js.Array[typings.awsSdk.kafkaMod.CompatibleKafkaVersion]
  
  type listOfConfiguration = js.Array[typings.awsSdk.kafkaMod.Configuration]
  
  type listOfConfigurationRevision = js.Array[typings.awsSdk.kafkaMod.ConfigurationRevision]
  
  type listOfKafkaVersion = js.Array[typings.awsSdk.kafkaMod.KafkaVersion]
  
  type listOfNodeInfo = js.Array[typings.awsSdk.kafkaMod.NodeInfo]
  
  type listOfString = js.Array[typings.awsSdk.kafkaMod.string]
  
  type listOfUnprocessedScramSecret = js.Array[typings.awsSdk.kafkaMod.UnprocessedScramSecret]
  
  type long = scala.Double
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.kafkaMod.string]
  
  type string = java.lang.String
  
  type stringMin1Max128 = java.lang.String
  
  type stringMin1Max64 = java.lang.String
  
  type stringMin5Max32 = java.lang.String
  
  type timestampIso8601 = typings.std.Date
}
