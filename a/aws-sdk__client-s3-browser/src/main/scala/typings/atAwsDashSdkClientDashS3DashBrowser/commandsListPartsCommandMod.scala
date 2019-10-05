package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListPartsInputMod.ListPartsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListPartsOutputMod.ListPartsOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListPartsCommand", JSImport.Namespace)
@js.native
object commandsListPartsCommandMod extends js.Object {
  @js.native
  class ListPartsCommand protected () extends Command[
          InputTypesUnion, 
          ListPartsInput, 
          OutputTypesUnion, 
          ListPartsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListPartsInput) = this()
    /* CompleteClass */
    override val input: ListPartsInput = js.native
    val middlewareStack: MiddlewareStack[ListPartsInput, ListPartsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListPartsInput, ListPartsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListPartsInput, ListPartsOutput] = js.native
  }
  
}

