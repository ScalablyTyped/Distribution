package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
import typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListBucketAnalyticsConfigurationsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/ListBucketAnalyticsConfigurationsCommand", "ListBucketAnalyticsConfigurationsCommand")
  @js.native
  open class ListBucketAnalyticsConfigurationsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListBucketAnalyticsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketAnalyticsConfigurationsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListBucketAnalyticsConfigurationsInput) = this()
    
    /* CompleteClass */
    override val input: ListBucketAnalyticsConfigurationsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
  }
}
