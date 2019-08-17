package typings.atAwsDashSdkUtilDashCreateDashRequest

import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-create-request", JSImport.Namespace)
@js.native
object atAwsDashSdkUtilDashCreateDashRequestMod extends js.Object {
  def createRequest[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, StreamType, OutputType /* <: MetadataBearer */](
    client: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWSClient<InputTypesUnion, MetadataBearer, StreamType> */ js.Any,
    command: Command[InputTypesUnion, InputType, MetadataBearer, OutputType, _, StreamType]
  ): js.Promise[HttpRequest[StreamType]] = js.native
}

