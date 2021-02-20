package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
import typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketInventoryConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketInventoryConfigurationCommand", "GetBucketInventoryConfigurationCommand")
  @js.native
  class GetBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          GetBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketInventoryConfigurationInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketInventoryConfigurationInput, GetBucketInventoryConfigurationOutput] = js.native
  }
}
