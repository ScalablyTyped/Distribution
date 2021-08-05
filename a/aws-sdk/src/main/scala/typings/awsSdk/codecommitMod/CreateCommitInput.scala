package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommitInput extends StObject {
  
  /**
    * The name of the author who created the commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The name of the branch where you create the commit.
    */
  var branchName: BranchName
  
  /**
    * The commit message you want to include in the commit. Commit messages are limited to 256 KB. If no message is specified, a default message is used.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The files to delete in this commit. These files still exist in earlier commits.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined
  
  /**
    * The email address of the person who created the commit.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If true, a ..gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  
  /**
    * The ID of the commit that is the parent of the commit you create. Not required if this is an empty repository.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The files to add or update in this commit.
    */
  var putFiles: js.UndefOr[PutFileEntries] = js.undefined
  
  /**
    * The name of the repository where you create the commit.
    */
  var repositoryName: RepositoryName
  
  /**
    * The file modes to update for files in this commit.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
}
object CreateCommitInput {
  
  inline def apply(branchName: BranchName, repositoryName: RepositoryName): CreateCommitInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommitInput]
  }
  
  extension [Self <: CreateCommitInput](x: Self) {
    
    inline def setAuthorName(value: Name): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setCommitMessage(value: Message): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
    
    inline def setDeleteFiles(value: DeleteFileEntries): Self = StObject.set(x, "deleteFiles", value.asInstanceOf[js.Any])
    
    inline def setDeleteFilesUndefined: Self = StObject.set(x, "deleteFiles", js.undefined)
    
    inline def setDeleteFilesVarargs(value: DeleteFileEntry*): Self = StObject.set(x, "deleteFiles", js.Array(value :_*))
    
    inline def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKeepEmptyFolders(value: KeepEmptyFolders): Self = StObject.set(x, "keepEmptyFolders", value.asInstanceOf[js.Any])
    
    inline def setKeepEmptyFoldersUndefined: Self = StObject.set(x, "keepEmptyFolders", js.undefined)
    
    inline def setParentCommitId(value: CommitId): Self = StObject.set(x, "parentCommitId", value.asInstanceOf[js.Any])
    
    inline def setParentCommitIdUndefined: Self = StObject.set(x, "parentCommitId", js.undefined)
    
    inline def setPutFiles(value: PutFileEntries): Self = StObject.set(x, "putFiles", value.asInstanceOf[js.Any])
    
    inline def setPutFilesUndefined: Self = StObject.set(x, "putFiles", js.undefined)
    
    inline def setPutFilesVarargs(value: PutFileEntry*): Self = StObject.set(x, "putFiles", js.Array(value :_*))
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setSetFileModes(value: SetFileModeEntries): Self = StObject.set(x, "setFileModes", value.asInstanceOf[js.Any])
    
    inline def setSetFileModesUndefined: Self = StObject.set(x, "setFileModes", js.undefined)
    
    inline def setSetFileModesVarargs(value: SetFileModeEntry*): Self = StObject.set(x, "setFileModes", js.Array(value :_*))
  }
}
