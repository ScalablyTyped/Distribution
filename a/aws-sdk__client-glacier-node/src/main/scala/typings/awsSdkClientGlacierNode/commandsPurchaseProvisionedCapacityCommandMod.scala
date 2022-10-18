package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPurchaseProvisionedCapacityCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/PurchaseProvisionedCapacityCommand", "PurchaseProvisionedCapacityCommand")
  @js.native
  open class PurchaseProvisionedCapacityCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
  }
}
