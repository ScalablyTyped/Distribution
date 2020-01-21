package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommitInput extends js.Object {
  /**
    * The name of the author who created the commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.native
  /**
    * The name of the branch where you create the commit.
    */
  var branchName: BranchName = js.native
  /**
    * The commit message you want to include in the commit. Commit messages are limited to 256 KB. If no message is specified, a default message is used.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  /**
    * The files to delete in this commit. These files still exist in earlier commits.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.native
  /**
    * The email address of the person who created the commit.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If true, a ..gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.native
  /**
    * The ID of the commit that is the parent of the commit you create. Not required if this is an empty repository.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The files to add or update in this commit.
    */
  var putFiles: js.UndefOr[PutFileEntries] = js.native
  /**
    * The name of the repository where you create the commit.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The file modes to update for files in this commit.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.native
}

object CreateCommitInput {
  @scala.inline
  def apply(
    branchName: BranchName,
    repositoryName: RepositoryName,
    authorName: Name = null,
    commitMessage: Message = null,
    deleteFiles: DeleteFileEntries = null,
    email: Email = null,
    keepEmptyFolders: js.UndefOr[Boolean] = js.undefined,
    parentCommitId: CommitId = null,
    putFiles: PutFileEntries = null,
    setFileModes: SetFileModeEntries = null
  ): CreateCommitInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage.asInstanceOf[js.Any])
    if (deleteFiles != null) __obj.updateDynamic("deleteFiles")(deleteFiles.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders.asInstanceOf[js.Any])
    if (parentCommitId != null) __obj.updateDynamic("parentCommitId")(parentCommitId.asInstanceOf[js.Any])
    if (putFiles != null) __obj.updateDynamic("putFiles")(putFiles.asInstanceOf[js.Any])
    if (setFileModes != null) __obj.updateDynamic("setFileModes")(setFileModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommitInput]
  }
}

