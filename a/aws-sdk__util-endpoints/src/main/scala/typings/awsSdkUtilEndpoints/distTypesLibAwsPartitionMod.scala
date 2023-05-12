package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointPartition
import typings.awsSdkUtilEndpoints.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibAwsPartitionMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/aws/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserAgentPrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentPrefix")().asInstanceOf[String]
  
  inline def partition(value: String): EndpointPartition = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointPartition]
  
  inline def setPartitionInfo(partitionsInfo: PartitionsInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPartitionInfo")(partitionsInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setPartitionInfo(partitionsInfo: PartitionsInfo, userAgentPrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPartitionInfo")(partitionsInfo.asInstanceOf[js.Any], userAgentPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDefaultPartitionInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDefaultPartitionInfo")().asInstanceOf[Unit]
  
  trait PartitionsInfo extends StObject {
    
    var partitions: js.Array[Id]
  }
  object PartitionsInfo {
    
    inline def apply(partitions: js.Array[Id]): PartitionsInfo = {
      val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartitionsInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartitionsInfo] (val x: Self) extends AnyVal {
      
      inline def setPartitions(value: js.Array[Id]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
      
      inline def setPartitionsVarargs(value: Id*): Self = StObject.set(x, "partitions", js.Array(value*))
    }
  }
}
