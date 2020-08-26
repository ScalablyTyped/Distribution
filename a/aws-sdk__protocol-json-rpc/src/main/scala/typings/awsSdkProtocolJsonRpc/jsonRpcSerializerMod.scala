package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.marshallerMod.RequestSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc/build/JsonRpcSerializer", JSImport.Namespace)
@js.native
object jsonRpcSerializerMod extends js.Object {
  @js.native
  class JsonRpcSerializer[StreamType] protected () extends RequestSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
    val bodySerializer: js.Any = js.native
    val endpoint: js.Any = js.native
  }
  
}

