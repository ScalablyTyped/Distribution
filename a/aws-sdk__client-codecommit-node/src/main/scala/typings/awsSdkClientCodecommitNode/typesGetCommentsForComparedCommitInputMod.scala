package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommentsForComparedCommitInputMod {
  
  trait GetCommentsForComparedCommitInput
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
      * <p>To establish the directionality of the comparison, the full commit ID of the 'after' commit.</p>
      */
    var afterCommitId: String
    
    /**
      * <p>To establish the directionality of the comparison, the full commit ID of the 'before' commit.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A non-negative integer used to limit the number of returned results. The default is 100 comments, and is configurable up to 500.</p>
      */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results. </p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository where you want to compare commits.</p>
      */
    var repositoryName: String
  }
  object GetCommentsForComparedCommitInput {
    
    @scala.inline
    def apply(afterCommitId: String, repositoryName: String): GetCommentsForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommentsForComparedCommitInput]
    }
    
    @scala.inline
    implicit class GetCommentsForComparedCommitInputMutableBuilder[Self <: GetCommentsForComparedCommitInput] (val x: Self) extends AnyVal {
      
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
      def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
