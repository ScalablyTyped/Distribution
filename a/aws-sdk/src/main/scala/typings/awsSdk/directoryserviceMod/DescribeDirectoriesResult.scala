package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectoriesResult extends js.Object {
  
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
  implicit class DescribeDirectoriesResultOps[Self <: DescribeDirectoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectoryDescriptionsVarargs(value: DirectoryDescription*): Self = this.set("DirectoryDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setDirectoryDescriptions(value: DirectoryDescriptions): Self = this.set("DirectoryDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryDescriptions: Self = this.set("DirectoryDescriptions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
