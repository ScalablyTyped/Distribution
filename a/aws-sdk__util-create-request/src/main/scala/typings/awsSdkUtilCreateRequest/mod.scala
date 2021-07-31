package typings.awsSdkUtilCreateRequest

import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-create-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRequest[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[js.Any, InputTypesUnion, MetadataBearer, js.Any],
    command: Command[InputType, OutputType, js.Any, InputTypesUnion, MetadataBearer]
  ): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRequest")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
