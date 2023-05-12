package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointPartition
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkUtilEndpoints.distTypesLibAwsPartitionMod.PartitionsInfo
import typings.awsSdkUtilEndpoints.distTypesTypesRuleSetObjectMod.RuleSetObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EndpointResolverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-endpoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/util-endpoints", "EndpointError")
  @js.native
  open class EndpointError protected ()
    extends typings.awsSdkUtilEndpoints.distTypesTypesMod.EndpointError {
    def this(message: String) = this()
  }
  
  inline def getUserAgentPrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentPrefix")().asInstanceOf[String]
  
  inline def partition(value: String): EndpointPartition = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointPartition]
  
  inline def resolveEndpoint(ruleSetObject: RuleSetObject, options: EndpointResolverOptions): EndpointV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpoint")(ruleSetObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointV2]
  
  inline def setPartitionInfo(partitionsInfo: PartitionsInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPartitionInfo")(partitionsInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setPartitionInfo(partitionsInfo: PartitionsInfo, userAgentPrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPartitionInfo")(partitionsInfo.asInstanceOf[js.Any], userAgentPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDefaultPartitionInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDefaultPartitionInfo")().asInstanceOf[Unit]
}
