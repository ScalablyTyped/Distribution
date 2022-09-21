package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput
import typings.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteAppCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteAppCommand", "DeleteAppCommand")
  @js.native
  open class DeleteAppCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteAppInput, 
          OutputTypesUnion, 
          DeleteAppOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteAppInput) = this()
    
    /* CompleteClass */
    override val input: DeleteAppInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteAppInput, DeleteAppOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
  }
}
