package typings.awsSdkQueryErrorUnmarshaller

import typings.awsSdkTypes.protocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/query-error-unmarshaller/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  @js.native
  trait ParsedErrorResponse extends js.Object {
    @JSName("$metadata")
    var $metadata: AnonRequestId = js.native
    var Error: js.UndefOr[AnonCode] = js.native
  }
  
  val ERR_RESP_SHAPE: Member = js.native
}

