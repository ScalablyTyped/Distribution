package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTraceSummariesInputMod {
  
  trait GetTraceSummariesInput
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
      * <p>The end of the time frame for which to retrieve traces.</p>
      */
    var EndTime: js.Date | String | Double
    
    /**
      * <p>Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.</p>
      */
    var FilterExpression: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specify the pagination token returned by a previous request to retrieve the next page of results.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Set to <code>true</code> to get summaries for only a subset of available traces.</p>
      */
    var Sampling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The start of the time frame for which to retrieve traces.</p>
      */
    var StartTime: js.Date | String | Double
  }
  object GetTraceSummariesInput {
    
    inline def apply(EndTime: js.Date | String | Double, StartTime: js.Date | String | Double): GetTraceSummariesInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTraceSummariesInput]
    }
    
    extension [Self <: GetTraceSummariesInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setFilterExpression(value: String): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setSampling(value: Boolean): Self = StObject.set(x, "Sampling", value.asInstanceOf[js.Any])
      
      inline def setSamplingUndefined: Self = StObject.set(x, "Sampling", js.undefined)
      
      inline def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    }
  }
}
