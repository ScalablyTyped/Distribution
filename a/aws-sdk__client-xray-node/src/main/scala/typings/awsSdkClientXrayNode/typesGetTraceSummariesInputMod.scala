package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTraceSummariesInputMod {
  
  @js.native
  trait GetTraceSummariesInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>The end of the time frame for which to retrieve traces.</p>
      */
    var EndTime: Date | String | Double = js.native
    
    /**
      * <p>Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.</p>
      */
    var FilterExpression: js.UndefOr[String] = js.native
    
    /**
      * <p>Specify the pagination token returned by a previous request to retrieve the next page of results.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>Set to <code>true</code> to get summaries for only a subset of available traces.</p>
      */
    var Sampling: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The start of the time frame for which to retrieve traces.</p>
      */
    var StartTime: Date | String | Double = js.native
  }
  object GetTraceSummariesInput {
    
    @scala.inline
    def apply(EndTime: Date | String | Double, StartTime: Date | String | Double): GetTraceSummariesInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTraceSummariesInput]
    }
    
    @scala.inline
    implicit class GetTraceSummariesInputMutableBuilder[Self <: GetTraceSummariesInput] (val x: Self) extends AnyVal {
      
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
      def setEndTime(value: Date | String | Double): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterExpression(value: String): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setSampling(value: Boolean): Self = StObject.set(x, "Sampling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingUndefined: Self = StObject.set(x, "Sampling", js.undefined)
      
      @scala.inline
      def setStartTime(value: Date | String | Double): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    }
  }
}
