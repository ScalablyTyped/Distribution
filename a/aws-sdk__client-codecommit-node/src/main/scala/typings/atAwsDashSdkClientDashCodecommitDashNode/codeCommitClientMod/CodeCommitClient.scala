package typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitClientMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/CodeCommitClient", "CodeCommitClient")
@js.native
class CodeCommitClient protected () extends js.Object {
  def this(configuration: CodeCommitConfiguration) = this()
  val config: CodeCommitResolvedConfiguration = js.native
  val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable] = js.native
  def destroy(): Unit = js.native
  /**
    * This will need to be revised when the command interface lands.
    */
  def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
    command: Command[
      InputTypesUnion, 
      InputType, 
      OutputTypesUnion, 
      OutputType, 
      CodeCommitResolvedConfiguration, 
      Readable
    ]
  ): js.Promise[OutputType] = js.native
  def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
    command: Command[
      InputTypesUnion, 
      InputType, 
      OutputTypesUnion, 
      OutputType, 
      CodeCommitResolvedConfiguration, 
      Readable
    ],
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
  ): Unit = js.native
}

