package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typings.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListProvisionedCapacityCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListProvisionedCapacityCommand", "ListProvisionedCapacityCommand")
  @js.native
  open class ListProvisionedCapacityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListProvisionedCapacityInput, 
          OutputTypesUnion, 
          ListProvisionedCapacityOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListProvisionedCapacityInput) = this()
    
    /* CompleteClass */
    override val input: ListProvisionedCapacityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
  }
}
