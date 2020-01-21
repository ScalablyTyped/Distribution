package typings.awsSdkS3ErrorUnmarshaller

import typings.awsSdkTypes.protocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-error-unmarshaller/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  @js.native
  trait ParsedErrorResponse extends js.Object {
    @JSName("$metadata")
    var $metadata: AnonRequestId = js.native
    var Code: String = js.native
    var Message: String = js.native
  }
  
  val ERR_RESP_SHAPE: Member = js.native
}

