package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected ()
    extends typings.awsSdkProtocolJsonRpc.jsonRpcParserMod.JsonRpcParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typings.awsSdkProtocolJsonRpc.jsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

