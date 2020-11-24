package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDifferencesInput extends js.Object {
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var MaxResults: js.UndefOr[Limit] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codecommitMod.NextToken] = js.native
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
    */
  var afterCommitSpecifier: CommitName = js.native
  
  /**
    * The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences are shown for all paths.
    */
  var afterPath: js.UndefOr[Path] = js.native
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, the full commit ID). Optional. If not specified, all changes before the afterCommitSpecifier value are shown. If you do not use beforeCommitSpecifier in your request, consider limiting the results with maxResults.
    */
  var beforeCommitSpecifier: js.UndefOr[CommitName] = js.native
  
  /**
    * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If beforePath and afterPath are not specified, differences are shown for all paths.
    */
  var beforePath: js.UndefOr[Path] = js.native
  
  /**
    * The name of the repository where you want to get differences.
    */
  var repositoryName: RepositoryName = js.native
}
object GetDifferencesInput {
  
  @scala.inline
  def apply(afterCommitSpecifier: CommitName, repositoryName: RepositoryName): GetDifferencesInput = {
    val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDifferencesInput]
  }
  
  @scala.inline
  implicit class GetDifferencesInputOps[Self <: GetDifferencesInput] (val x: Self) extends AnyVal {
    
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
    def setAfterCommitSpecifier(value: CommitName): Self = this.set("afterCommitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Limit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setAfterPath(value: Path): Self = this.set("afterPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterPath: Self = this.set("afterPath", js.undefined)
    
    @scala.inline
    def setBeforeCommitSpecifier(value: CommitName): Self = this.set("beforeCommitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCommitSpecifier: Self = this.set("beforeCommitSpecifier", js.undefined)
    
    @scala.inline
    def setBeforePath(value: Path): Self = this.set("beforePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforePath: Self = this.set("beforePath", js.undefined)
  }
}
