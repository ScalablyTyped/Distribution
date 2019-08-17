package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommitMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreUserInfoMod._UnmarshalledUserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCommit extends _Commit {
  /**
    * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
    */
  @JSName("author")
  var author__UnmarshalledCommit: js.UndefOr[_UnmarshalledUserInfo] = js.undefined
  /**
    * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
    */
  @JSName("committer")
  var committer__UnmarshalledCommit: js.UndefOr[_UnmarshalledUserInfo] = js.undefined
  /**
    * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
    */
  @JSName("parents")
  var parents__UnmarshalledCommit: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledCommit {
  @scala.inline
  def apply(
    additionalData: String = null,
    author: _UnmarshalledUserInfo = null,
    commitId: String = null,
    committer: _UnmarshalledUserInfo = null,
    message: String = null,
    parents: js.Array[String] = null,
    treeId: String = null
  ): _UnmarshalledCommit = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData)
    if (author != null) __obj.updateDynamic("author")(author)
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[_UnmarshalledCommit]
  }
}

