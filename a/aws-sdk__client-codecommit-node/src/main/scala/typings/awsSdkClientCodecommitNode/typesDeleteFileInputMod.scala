package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteFileInputMod {
  
  trait DeleteFileInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The name of the branch where the commit will be made deleting the file.</p>
      */
    var branchName: String
    
    /**
      * <p>The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.</p>
      */
    var commitMessage: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The email address for the commit that deletes the file. If no email address is specified, the email address will be left blank.</p>
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.</p>
      */
    var filePath: String
    
    /**
      * <p>Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.</p>
      */
    var keepEmptyFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used as the author name and committer name.</p>
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit ID.</p>
      */
    var parentCommitId: String
    
    /**
      * <p>The name of the repository that contains the file to delete.</p>
      */
    var repositoryName: String
  }
  object DeleteFileInput {
    
    inline def apply(branchName: String, filePath: String, parentCommitId: String, repositoryName: String): DeleteFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileInput]
    }
    
    extension [Self <: DeleteFileInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
      
      inline def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
      
      inline def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setKeepEmptyFolders(value: Boolean): Self = StObject.set(x, "keepEmptyFolders", value.asInstanceOf[js.Any])
      
      inline def setKeepEmptyFoldersUndefined: Self = StObject.set(x, "keepEmptyFolders", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentCommitId(value: String): Self = StObject.set(x, "parentCommitId", value.asInstanceOf[js.Any])
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
