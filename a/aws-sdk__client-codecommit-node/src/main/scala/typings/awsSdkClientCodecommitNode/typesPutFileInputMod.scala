package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutFileInputMod {
  
  trait PutFileInput
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The name of the branch where you want to add or update the file. If this is an empty repository, this branch will be created.</p>
      */
    var branchName: String
    
    /**
      * <p>A message about why this file was added or updated. While optional, adding a message is strongly encouraged in order to provide a more useful commit history for your repository.</p>
      */
    var commitMessage: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An email address for the person adding or updating the file.</p>
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The content of the file, in binary object format. </p>
      */
    var fileContent: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String
    
    /**
      * <p>The file mode permissions of the blob. Valid file mode permissions are listed below.</p>
      */
    var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.undefined
    
    /**
      * <p>The name of the file you want to add or update, including the relative path to the file in the repository.</p> <note> <p>If the path does not currently exist in the repository, the path will be created as part of adding the file.</p> </note>
      */
    var filePath: String
    
    /**
      * <p>The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order to provide a more useful commit history for your repository.</p>
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required. </p> <p>The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the file will not be added or updated.</p>
      */
    var parentCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository where you want to add or update the file.</p>
      */
    var repositoryName: String
  }
  object PutFileInput {
    
    inline def apply(
      branchName: String,
      fileContent: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      filePath: String,
      repositoryName: String
    ): PutFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutFileInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutFileInput] (val x: Self) extends AnyVal {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
      
      inline def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
      
      inline def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFileContent(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      inline def setFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      inline def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentCommitId(value: String): Self = StObject.set(x, "parentCommitId", value.asInstanceOf[js.Any])
      
      inline def setParentCommitIdUndefined: Self = StObject.set(x, "parentCommitId", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
