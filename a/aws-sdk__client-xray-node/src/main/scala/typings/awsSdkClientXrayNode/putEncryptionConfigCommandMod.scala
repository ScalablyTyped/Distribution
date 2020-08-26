package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutEncryptionConfigCommand", JSImport.Namespace)
@js.native
object putEncryptionConfigCommandMod extends js.Object {
  @js.native
  class PutEncryptionConfigCommand protected () extends Command[
          InputTypesUnion, 
          PutEncryptionConfigInput, 
          OutputTypesUnion, 
          PutEncryptionConfigOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutEncryptionConfigInput) = this()
    val middlewareStack: MiddlewareStack[PutEncryptionConfigInput, PutEncryptionConfigOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
  }
  
}

