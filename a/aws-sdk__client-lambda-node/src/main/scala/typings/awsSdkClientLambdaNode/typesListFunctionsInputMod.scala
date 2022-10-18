package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ALL
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListFunctionsInputMod {
  
  trait ListFunctionsInput
    extends StObject
       with _InputTypesUnion {
    
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
      * <p>Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN is returned.</p>
      */
    var FunctionVersion: js.UndefOr[ALL | String] = js.undefined
    
    /**
      * <p>Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If present, indicates where to continue the listing. </p>
      */
    var Marker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the <code>FunctionVersion</code>.</p>
      */
    var MasterRegion: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.</p>
      */
    var MaxItems: js.UndefOr[Double] = js.undefined
  }
  object ListFunctionsInput {
    
    inline def apply(): ListFunctionsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListFunctionsInput]
    }
    
    extension [Self <: ListFunctionsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setFunctionVersion(value: ALL | String): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      inline def setMasterRegion(value: String): Self = StObject.set(x, "MasterRegion", value.asInstanceOf[js.Any])
      
      inline def setMasterRegionUndefined: Self = StObject.set(x, "MasterRegion", js.undefined)
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    }
  }
}
