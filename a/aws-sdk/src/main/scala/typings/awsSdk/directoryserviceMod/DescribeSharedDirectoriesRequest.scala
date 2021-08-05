package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSharedDirectoriesRequest extends StObject {
  
  /**
    * The number of shared directories to return in the response object.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.undefined
  
  /**
    * The DescribeSharedDirectoriesResult.NextToken value from a previous call to DescribeSharedDirectories. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
  
  /**
    * Returns the identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: DirectoryId
  
  /**
    * A list of identifiers of all shared directories in your account. 
    */
  var SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.undefined
}
object DescribeSharedDirectoriesRequest {
  
  inline def apply(OwnerDirectoryId: DirectoryId): DescribeSharedDirectoriesRequest = {
    val __obj = js.Dynamic.literal(OwnerDirectoryId = OwnerDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSharedDirectoriesRequest]
  }
  
  extension [Self <: DescribeSharedDirectoriesRequest](x: Self) {
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwnerDirectoryId(value: DirectoryId): Self = StObject.set(x, "OwnerDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryIds(value: DirectoryIds): Self = StObject.set(x, "SharedDirectoryIds", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryIdsUndefined: Self = StObject.set(x, "SharedDirectoryIds", js.undefined)
    
    inline def setSharedDirectoryIdsVarargs(value: DirectoryId*): Self = StObject.set(x, "SharedDirectoryIds", js.Array(value :_*))
  }
}
