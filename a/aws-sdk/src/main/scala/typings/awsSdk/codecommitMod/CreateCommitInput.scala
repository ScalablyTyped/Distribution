package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(branchName: BranchName, repositoryName: RepositoryName): CreateCommitInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommitInput]
  }
  
  @scala.inline
  implicit class CreateCommitInputOps[Self <: CreateCommitInput] (val x: Self) extends AnyVal {
    
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
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorName(value: Name): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    
    @scala.inline
    def setCommitMessage(value: Message): Self = this.set("commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitMessage: Self = this.set("commitMessage", js.undefined)
    
    @scala.inline
    def setDeleteFilesVarargs(value: DeleteFileEntry*): Self = this.set("deleteFiles", js.Array(value :_*))
    
    @scala.inline
    def setDeleteFiles(value: DeleteFileEntries): Self = this.set("deleteFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteFiles: Self = this.set("deleteFiles", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKeepEmptyFolders(value: KeepEmptyFolders): Self = this.set("keepEmptyFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepEmptyFolders: Self = this.set("keepEmptyFolders", js.undefined)
    
    @scala.inline
    def setParentCommitId(value: CommitId): Self = this.set("parentCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentCommitId: Self = this.set("parentCommitId", js.undefined)
    
    @scala.inline
    def setPutFilesVarargs(value: PutFileEntry*): Self = this.set("putFiles", js.Array(value :_*))
    
    @scala.inline
    def setPutFiles(value: PutFileEntries): Self = this.set("putFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePutFiles: Self = this.set("putFiles", js.undefined)
    
    @scala.inline
    def setSetFileModesVarargs(value: SetFileModeEntry*): Self = this.set("setFileModes", js.Array(value :_*))
    
    @scala.inline
    def setSetFileModes(value: SetFileModeEntries): Self = this.set("setFileModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetFileModes: Self = this.set("setFileModes", js.undefined)
  }
}
