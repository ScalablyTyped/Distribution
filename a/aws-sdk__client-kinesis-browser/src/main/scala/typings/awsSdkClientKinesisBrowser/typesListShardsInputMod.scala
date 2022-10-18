package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListShardsInputMod {
  
  trait ListShardsInput
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
      * <p>Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately follows <code>ExclusiveStartShardId</code>.</p> <p>If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the shards starting with the first one in the stream.</p> <p>You cannot specify this parameter if you specify <code>NextToken</code>.</p>
      */
    var ExclusiveStartShardId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you can specify for this parameter is 1, and the maximum is 1,000, which is also the default.</p> <p>When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code> to list the next set of shards.</p>
      */
    var MaxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.</p> <p>Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify <code>NextToken</code> because the latter unambiguously identifies the stream.</p> <p>You can optionally specify a value for the <code>MaxResults</code> parameter when you specify <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of shards that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the <code>ListShards</code> operation.</p> <important> <p>Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.</p> </important>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the shards for.</p> <p>You cannot specify this parameter if you specify the <code>NextToken</code> parameter.</p>
      */
    var StreamCreationTimestamp: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The name of the data stream whose shards you want to list. </p> <p>You cannot specify this parameter if you specify the <code>NextToken</code> parameter.</p>
      */
    var StreamName: js.UndefOr[String] = js.undefined
  }
  object ListShardsInput {
    
    inline def apply(): ListShardsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListShardsInput]
    }
    
    extension [Self <: ListShardsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setExclusiveStartShardId(value: String): Self = StObject.set(x, "ExclusiveStartShardId", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartShardIdUndefined: Self = StObject.set(x, "ExclusiveStartShardId", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setStreamCreationTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStreamCreationTimestampUndefined: Self = StObject.set(x, "StreamCreationTimestamp", js.undefined)
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    }
  }
}
