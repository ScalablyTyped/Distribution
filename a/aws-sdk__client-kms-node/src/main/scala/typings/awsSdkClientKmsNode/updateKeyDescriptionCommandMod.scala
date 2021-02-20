package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateKeyDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/UpdateKeyDescriptionCommand", "UpdateKeyDescriptionCommand")
  @js.native
  class UpdateKeyDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateKeyDescriptionInput, 
          OutputTypesUnion, 
          UpdateKeyDescriptionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: UpdateKeyDescriptionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  }
}
