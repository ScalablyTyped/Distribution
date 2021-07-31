package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purchaseProvisionedCapacityCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/PurchaseProvisionedCapacityCommand", "PurchaseProvisionedCapacityCommand")
  @js.native
  class PurchaseProvisionedCapacityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PurchaseProvisionedCapacityInput, 
          OutputTypesUnion, 
          PurchaseProvisionedCapacityOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: PurchaseProvisionedCapacityInput) = this()
    
    /* CompleteClass */
    override val input: PurchaseProvisionedCapacityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
  }
}
