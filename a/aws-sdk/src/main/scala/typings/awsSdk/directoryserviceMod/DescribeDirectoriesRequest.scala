package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectoriesRequest extends StObject {
  
  /**
    * A list of identifiers of the directories for which to obtain the information. If this member is null, all directories that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var DirectoryIds: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryIds] = js.native
  
  /**
    * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.native
  
  /**
    * The DescribeDirectoriesResult.NextToken value from a previous call to DescribeDirectories. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object DescribeDirectoriesRequest {
  
  @scala.inline
  def apply(): DescribeDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoriesRequest]
  }
  
  @scala.inline
  implicit class DescribeDirectoriesRequestMutableBuilder[Self <: DescribeDirectoriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryIds(value: DirectoryIds): Self = StObject.set(x, "DirectoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdsUndefined: Self = StObject.set(x, "DirectoryIds", js.undefined)
    
    @scala.inline
    def setDirectoryIdsVarargs(value: DirectoryId*): Self = StObject.set(x, "DirectoryIds", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
