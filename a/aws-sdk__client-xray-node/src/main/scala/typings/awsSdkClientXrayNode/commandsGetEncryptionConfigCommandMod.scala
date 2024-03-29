package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod.GetEncryptionConfigOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetEncryptionConfigCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetEncryptionConfigCommand", "GetEncryptionConfigCommand")
  @js.native
  open class GetEncryptionConfigCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
  }
}
