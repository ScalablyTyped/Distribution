package typings.awsSdkUtilCreateRequest

import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-create-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createRequest[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, StreamType, OutputType /* <: MetadataBearer */](
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSClient<InputTypesUnion, MetadataBearer, StreamType> */ js.Any,
    command: Command[InputTypesUnion, InputType, MetadataBearer, OutputType, _, StreamType]
  ): js.Promise[HttpRequest[StreamType]] = js.native
}

