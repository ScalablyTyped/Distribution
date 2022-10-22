package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointPartition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibAwsPartitionMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/aws/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def partition(value: String): EndpointPartition = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointPartition]
}
