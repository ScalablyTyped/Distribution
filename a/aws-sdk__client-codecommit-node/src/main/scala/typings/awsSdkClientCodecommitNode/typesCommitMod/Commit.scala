package typings.awsSdkClientCodecommitNode.typesCommitMod

import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UserInfo
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commit extends js.Object {
  
  /**
    * <p>Any additional data associated with the specified commit.</p>
    */
  var additionalData: js.UndefOr[String] = js.native
  
  /**
    * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
    */
  var author: js.UndefOr[UserInfo] = js.native
  
  /**
    * <p>The full SHA of the specified commit. </p>
    */
  var commitId: js.UndefOr[String] = js.native
  
  /**
    * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
    */
  var committer: js.UndefOr[UserInfo] = js.native
  
  /**
    * <p>The commit message associated with the specified commit.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
    */
  var parents: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * <p>Tree information for the specified commit.</p>
    */
  var treeId: js.UndefOr[String] = js.native
}
object Commit {
  
  @scala.inline
  def apply(): Commit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commit]
  }
  
  @scala.inline
  implicit class CommitOps[Self <: Commit] (val x: Self) extends AnyVal {
    
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
    def setAdditionalData(value: String): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    
    @scala.inline
    def setAuthor(value: UserInfo): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
    
    @scala.inline
    def setCommitter(value: UserInfo): Self = this.set("committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitter: Self = this.set("committer", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[String] | Iterable[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeId: Self = this.set("treeId", js.undefined)
  }
}
