package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
import typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAppsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppsCommand", "GetAppsCommand")
  @js.native
  class GetAppsCommand protected () extends Command[
          InputTypesUnion, 
          GetAppsInput, 
          OutputTypesUnion, 
          GetAppsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetAppsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
  }
}
