package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileInput extends StObject {
  
  /**
    * The name of the branch where the commit that deletes the file is made.
    */
  var branchName: BranchName = js.native
  
  /**
    * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no message is specified, a default message is used.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  
  /**
    * The email address for the commit that deletes the file. If no email address is specified, the email address is left blank.
    */
  var email: js.UndefOr[Email] = js.native
  
  /**
    * The fully qualified path to the file that to be deleted, including the full name and extension of that file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
    */
  var filePath: Path = js.native
  
  /**
    * If a file is the only object in the folder or directory, specifies whether to delete the folder or directory that contains the file. By default, empty folders are deleted. This includes empty folders that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 also deletes the empty folders dir4, dir3, and dir2.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.native
  
  /**
    * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN is used as the author name and committer name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The ID of the commit that is the tip of the branch where you want to create the commit that deletes the file. This must be the HEAD commit for the branch. The commit that deletes the file is created from this commit ID.
    */
  var parentCommitId: CommitId = js.native
  
  /**
    * The name of the repository that contains the file to delete.
    */
  var repositoryName: RepositoryName = js.native
}
object DeleteFileInput {
  
  @scala.inline
  def apply(branchName: BranchName, filePath: Path, parentCommitId: CommitId, repositoryName: RepositoryName): DeleteFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileInput]
  }
  
  @scala.inline
  implicit class DeleteFileInputMutableBuilder[Self <: DeleteFileInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitMessage(value: Message): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEmptyFolders(value: KeepEmptyFolders): Self = StObject.set(x, "keepEmptyFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEmptyFoldersUndefined: Self = StObject.set(x, "keepEmptyFolders", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentCommitId(value: CommitId): Self = StObject.set(x, "parentCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
