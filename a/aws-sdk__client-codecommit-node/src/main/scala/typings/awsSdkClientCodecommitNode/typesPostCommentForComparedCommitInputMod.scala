package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPostCommentForComparedCommitInputMod {
  
  trait PostCommentForComparedCommitInput
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
      * <p>To establish the directionality of the comparison, the full commit ID of the 'after' commit.</p>
      */
    var afterCommitId: String
    
    /**
      * <p>To establish the directionality of the comparison, the full commit ID of the 'before' commit.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
      */
    var clientRequestToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The content of the comment you want to make.</p>
      */
    var content: String
    
    /**
      * <p>The location of the comparison where you want to comment.</p>
      */
    var location: js.UndefOr[Location] = js.undefined
    
    /**
      * <p>The name of the repository where you want to post a comment on the comparison between commits.</p>
      */
    var repositoryName: String
  }
  object PostCommentForComparedCommitInput {
    
    inline def apply(afterCommitId: String, content: String, repositoryName: String): PostCommentForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostCommentForComparedCommitInput]
    }
    
    extension [Self <: PostCommentForComparedCommitInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
