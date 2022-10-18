package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.AliasRoutingConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateAliasInputMod {
  
  trait UpdateAliasInput
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
      * <p>You can change the description of the alias using this parameter.</p>
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String
    
    /**
      * <p>Using this parameter you can change the Lambda function version to which the alias points.</p>
      */
    var FunctionVersion: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The alias name.</p>
      */
    var Name: String
    
    /**
      * <p>An optional value you can use to ensure you are updating the latest update of the function version or alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias, it will fail with an error message, advising you retrieve the latest function version or alias <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>.</p>
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies an additional version your alias can point to, allowing you to dictate what percentage of traffic will invoke each version. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">Traffic Shifting Using Aliases</a>.</p>
      */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
  }
  object UpdateAliasInput {
    
    inline def apply(FunctionName: String, Name: String): UpdateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAliasInput]
    }
    
    extension [Self <: UpdateAliasInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersion(value: String): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      inline def setRoutingConfig(value: AliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
      
      inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    }
  }
}
