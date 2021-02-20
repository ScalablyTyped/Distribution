package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod.SamplingStatisticsDocument
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSamplingTargetsInputMod {
  
  @js.native
  trait GetSamplingTargetsInput extends InputTypesUnion {
    
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
      * <p>Information about rules that the service is using to sample requests.</p>
      */
    var SamplingStatisticsDocuments: js.Array[SamplingStatisticsDocument] | Iterable[SamplingStatisticsDocument] = js.native
  }
  object GetSamplingTargetsInput {
    
    @scala.inline
    def apply(
      SamplingStatisticsDocuments: js.Array[SamplingStatisticsDocument] | Iterable[SamplingStatisticsDocument]
    ): GetSamplingTargetsInput = {
      val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingTargetsInput]
    }
    
    @scala.inline
    implicit class GetSamplingTargetsInputMutableBuilder[Self <: GetSamplingTargetsInput] (val x: Self) extends AnyVal {
      
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
      def setSamplingStatisticsDocuments(value: js.Array[SamplingStatisticsDocument] | Iterable[SamplingStatisticsDocument]): Self = StObject.set(x, "SamplingStatisticsDocuments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingStatisticsDocumentsVarargs(value: SamplingStatisticsDocument*): Self = StObject.set(x, "SamplingStatisticsDocuments", js.Array(value :_*))
    }
  }
}
