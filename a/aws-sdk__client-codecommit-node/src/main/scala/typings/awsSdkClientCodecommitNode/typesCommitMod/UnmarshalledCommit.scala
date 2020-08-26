package typings.awsSdkClientCodecommitNode.typesCommitMod

import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UnmarshalledUserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCommit extends Commit {
  /**
    * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
    */
  @JSName("author")
  var author_UnmarshalledCommit: js.UndefOr[UnmarshalledUserInfo] = js.native
  /**
    * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
    */
  @JSName("committer")
  var committer_UnmarshalledCommit: js.UndefOr[UnmarshalledUserInfo] = js.native
  /**
    * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
    */
  @JSName("parents")
  var parents_UnmarshalledCommit: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledCommit {
  @scala.inline
  def apply(): UnmarshalledCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCommit]
  }
  @scala.inline
  implicit class UnmarshalledCommitOps[Self <: UnmarshalledCommit] (val x: Self) extends AnyVal {
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
    def setAuthor(value: UnmarshalledUserInfo): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCommitter(value: UnmarshalledUserInfo): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitter: Self = this.set("committer", js.undefined)
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
  }
  
}

