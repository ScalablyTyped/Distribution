package typings.awsSdkClientCodecommitNode.typesCommitMod

import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UserInfo
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  /**
    * <p>Any additional data associated with the specified commit.</p>
    */
  var additionalData: js.UndefOr[String] = js.undefined
  /**
    * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
    */
  var author: js.UndefOr[UserInfo] = js.undefined
  /**
    * <p>The full SHA of the specified commit. </p>
    */
  var commitId: js.UndefOr[String] = js.undefined
  /**
    * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
    */
  var committer: js.UndefOr[UserInfo] = js.undefined
  /**
    * <p>The commit message associated with the specified commit.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
    */
  var parents: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>Tree information for the specified commit.</p>
    */
  var treeId: js.UndefOr[String] = js.undefined
}

object Commit {
  @scala.inline
  def apply(
    additionalData: String = null,
    author: UserInfo = null,
    commitId: String = null,
    committer: UserInfo = null,
    message: String = null,
    parents: js.Array[String] | Iterable[String] = null,
    treeId: String = null
  ): Commit = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (committer != null) __obj.updateDynamic("committer")(committer.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
}

