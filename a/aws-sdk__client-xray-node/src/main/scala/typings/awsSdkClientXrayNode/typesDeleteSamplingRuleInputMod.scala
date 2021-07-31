package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteSamplingRuleInputMod {
  
  trait DeleteSamplingRuleInput
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
      * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
      */
    var RuleARN: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
      */
    var RuleName: js.UndefOr[String] = js.undefined
  }
  object DeleteSamplingRuleInput {
    
    @scala.inline
    def apply(): DeleteSamplingRuleInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSamplingRuleInput]
    }
    
    @scala.inline
    implicit class DeleteSamplingRuleInputMutableBuilder[Self <: DeleteSamplingRuleInput] (val x: Self) extends AnyVal {
      
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
      def setRuleARN(value: String): Self = StObject.set(x, "RuleARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleARNUndefined: Self = StObject.set(x, "RuleARN", js.undefined)
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    }
  }
}
