package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.partitionHashMod.PartitionHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolvedPartitionMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo/getResolvedPartition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResolvedPartition(region: String, hasPartitionHash: GetResolvedPartitionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolvedPartition")(region.asInstanceOf[js.Any], hasPartitionHash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait GetResolvedPartitionOptions extends StObject {
    
    var partitionHash: PartitionHash
  }
  object GetResolvedPartitionOptions {
    
    inline def apply(partitionHash: PartitionHash): GetResolvedPartitionOptions = {
      val __obj = js.Dynamic.literal(partitionHash = partitionHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolvedPartitionOptions]
    }
    
    extension [Self <: GetResolvedPartitionOptions](x: Self) {
      
      inline def setPartitionHash(value: PartitionHash): Self = StObject.set(x, "partitionHash", value.asInstanceOf[js.Any])
    }
  }
}
