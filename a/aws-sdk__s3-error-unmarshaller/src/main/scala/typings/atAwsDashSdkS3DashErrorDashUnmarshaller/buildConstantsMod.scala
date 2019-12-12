package typings.atAwsDashSdkS3DashErrorDashUnmarshaller

import typings.atAwsDashSdkTypes.buildProtocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-error-unmarshaller/build/constants", JSImport.Namespace)
@js.native
object buildConstantsMod extends js.Object {
  @js.native
  trait ParsedErrorResponse extends js.Object {
    @JSName("$metadata")
    var $metadata: Anon_RequestId = js.native
    var Code: String = js.native
    var Message: String = js.native
  }
  
  val ERR_RESP_SHAPE: Member = js.native
}

