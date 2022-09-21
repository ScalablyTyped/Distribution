package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putEncryptionConfigCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/PutEncryptionConfigCommand", "PutEncryptionConfigCommand")
  @js.native
  open class PutEncryptionConfigCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutEncryptionConfigInput, 
          OutputTypesUnion, 
          PutEncryptionConfigOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: PutEncryptionConfigInput) = this()
    
    /* CompleteClass */
    override val input: PutEncryptionConfigInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
  }
}
