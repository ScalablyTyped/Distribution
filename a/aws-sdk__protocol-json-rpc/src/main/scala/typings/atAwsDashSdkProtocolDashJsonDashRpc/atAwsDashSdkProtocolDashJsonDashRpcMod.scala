package typings.atAwsDashSdkProtocolDashJsonDashRpc

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", JSImport.Namespace)
@js.native
object atAwsDashSdkProtocolDashJsonDashRpcMod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected ()
    extends typings.atAwsDashSdkProtocolDashJsonDashRpc.buildJsonRpcParserMod.JsonRpcParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typings.atAwsDashSdkProtocolDashJsonDashRpc.buildJsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

