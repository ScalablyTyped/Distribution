package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectoriesResult extends StObject {
  
  /**
    * The list of DirectoryDescription objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var DirectoryDescriptions: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryDescriptions] = js.native
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object DescribeDirectoriesResult {
  
  @scala.inline
  def apply(): DescribeDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoriesResult]
  }
  
  @scala.inline
  implicit class DescribeDirectoriesResultMutableBuilder[Self <: DescribeDirectoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryDescriptions(value: DirectoryDescriptions): Self = StObject.set(x, "DirectoryDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryDescriptionsUndefined: Self = StObject.set(x, "DirectoryDescriptions", js.undefined)
    
    @scala.inline
    def setDirectoryDescriptionsVarargs(value: DirectoryDescription*): Self = StObject.set(x, "DirectoryDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
