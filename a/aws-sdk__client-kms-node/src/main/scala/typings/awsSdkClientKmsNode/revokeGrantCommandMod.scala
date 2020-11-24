package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
import typings.awsSdkClientKmsNode.typesRevokeGrantOutputMod.RevokeGrantOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/RevokeGrantCommand", JSImport.Namespace)
@js.native
object revokeGrantCommandMod extends js.Object {
  
  @js.native
  class RevokeGrantCommand protected () extends Command[
          InputTypesUnion, 
          RevokeGrantInput, 
          OutputTypesUnion, 
          RevokeGrantOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: RevokeGrantInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  }
}
