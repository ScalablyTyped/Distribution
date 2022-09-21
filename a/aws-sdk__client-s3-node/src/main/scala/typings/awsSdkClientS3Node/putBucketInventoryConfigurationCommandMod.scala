package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketInventoryConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketInventoryConfigurationCommand", "PutBucketInventoryConfigurationCommand")
  @js.native
  open class PutBucketInventoryConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          PutBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketInventoryConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketInventoryConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
  }
}
