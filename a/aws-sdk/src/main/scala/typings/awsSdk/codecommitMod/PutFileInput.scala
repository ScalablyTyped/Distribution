package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFileInput extends StObject {
  
  /**
    * The name of the branch where you want to add or update the file. If this is an empty repository, this branch is created.
    */
  var branchName: BranchName
  
  /**
    * A message about why this file was added or updated. Although it is optional, a message makes the commit history for your repository more useful.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * An email address for the person adding or updating the file.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * The content of the file, in binary object format. 
    */
  var fileContent: FileContent
  
  /**
    * The file mode permissions of the blob. Valid file mode permissions are listed here.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  
  /**
    * The name of the file you want to add or update, including the relative path to the file in the repository.  If the path does not currently exist in the repository, the path is created as part of adding the file. 
    */
  var filePath: Path
  
  /**
    * The name of the person adding or updating the file. Although it is optional, a name makes the commit history for your repository more useful.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required.  The commit ID must match the ID of the head commit at the time of the operation. Otherwise, an error occurs, and the file is not added or updated.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The name of the repository where you want to add or update the file.
    */
  var repositoryName: RepositoryName
}
object PutFileInput {
  
  @scala.inline
  def apply(branchName: BranchName, fileContent: FileContent, filePath: Path, repositoryName: RepositoryName): PutFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileInput]
  }
  
  @scala.inline
  implicit class PutFileInputMutableBuilder[Self <: PutFileInput] (val x: Self) extends AnyVal {
    
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
    def setFileContent(value: FileContent): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentCommitId(value: CommitId): Self = StObject.set(x, "parentCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommitIdUndefined: Self = StObject.set(x, "parentCommitId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
