package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod.GetEncryptionConfigOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEncryptionConfigCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetEncryptionConfigCommand", "GetEncryptionConfigCommand")
  @js.native
  class GetEncryptionConfigCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetEncryptionConfigInput, 
          OutputTypesUnion, 
          GetEncryptionConfigOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetEncryptionConfigInput) = this()
    
    /* CompleteClass */
    override val input: GetEncryptionConfigInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: js.Any
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
  }
}
