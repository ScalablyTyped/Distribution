package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
import typings.awsSdkClientGlacierNode.typesGetVaultLockOutputMod.GetVaultLockOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVaultLockCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/GetVaultLockCommand", "GetVaultLockCommand")
  @js.native
  class GetVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultLockInput, 
          OutputTypesUnion, 
          GetVaultLockOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetVaultLockInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
  }
}
