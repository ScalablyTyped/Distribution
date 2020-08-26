package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod.GetEncryptionConfigOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetEncryptionConfigCommand", JSImport.Namespace)
@js.native
object getEncryptionConfigCommandMod extends js.Object {
  @js.native
  class GetEncryptionConfigCommand protected () extends Command[
          InputTypesUnion, 
          GetEncryptionConfigInput, 
          OutputTypesUnion, 
          GetEncryptionConfigOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetEncryptionConfigInput) = this()
    val middlewareStack: MiddlewareStack[GetEncryptionConfigInput, GetEncryptionConfigOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
  }
  
}

