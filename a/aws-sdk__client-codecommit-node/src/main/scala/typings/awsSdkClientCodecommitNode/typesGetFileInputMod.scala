package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetFileInputMod {
  
  trait GetFileInput
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
      * <p>The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the head commit will be used.</p>
      */
    var commitSpecifier: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The fully-qualified path to the file, including the full name and extension of the file. For example, /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.</p>
      */
    var filePath: String
    
    /**
      * <p>The name of the repository that contains the file.</p>
      */
    var repositoryName: String
  }
  object GetFileInput {
    
    @scala.inline
    def apply(filePath: String, repositoryName: String): GetFileInput = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFileInput]
    }
    
    @scala.inline
    implicit class GetFileInputMutableBuilder[Self <: GetFileInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setCommitSpecifier(value: String): Self = StObject.set(x, "commitSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitSpecifierUndefined: Self = StObject.set(x, "commitSpecifier", js.undefined)
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
