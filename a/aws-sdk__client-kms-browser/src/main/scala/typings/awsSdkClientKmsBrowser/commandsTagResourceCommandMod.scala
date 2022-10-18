package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput
import typings.awsSdkClientKmsBrowser.typesTagResourceOutputMod.TagResourceOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsTagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/TagResourceCommand", "TagResourceCommand")
  @js.native
  open class TagResourceCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          TagResourceInput, 
          OutputTypesUnion, 
          TagResourceOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: TagResourceInput) = this()
    
    /* CompleteClass */
    override val input: TagResourceInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
  }
}
