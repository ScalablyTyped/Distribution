package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput
import typings.awsSdkClientKmsBrowser.typesDescribeKeyOutputMod.DescribeKeyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DescribeKeyCommand", JSImport.Namespace)
@js.native
object describeKeyCommandMod extends js.Object {
  @js.native
  class DescribeKeyCommand protected () extends Command[
          InputTypesUnion, 
          DescribeKeyInput, 
          OutputTypesUnion, 
          DescribeKeyOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeKeyInput) = this()
    val middlewareStack: MiddlewareStack[DescribeKeyInput, DescribeKeyOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  }
  
}

