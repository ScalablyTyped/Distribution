package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesRegionInfoPartitionHashMod.PartitionHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionInfoGetResolvedPartitionMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo/getResolvedPartition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResolvedPartition(region: String, param1: GetResolvedPartitionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolvedPartition")(region.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait GetResolvedPartitionOptions extends StObject {
    
    var partitionHash: PartitionHash
  }
  object GetResolvedPartitionOptions {
    
    inline def apply(partitionHash: PartitionHash): GetResolvedPartitionOptions = {
      val __obj = js.Dynamic.literal(partitionHash = partitionHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolvedPartitionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetResolvedPartitionOptions] (val x: Self) extends AnyVal {
      
      inline def setPartitionHash(value: PartitionHash): Self = StObject.set(x, "partitionHash", value.asInstanceOf[js.Any])
    }
  }
}
