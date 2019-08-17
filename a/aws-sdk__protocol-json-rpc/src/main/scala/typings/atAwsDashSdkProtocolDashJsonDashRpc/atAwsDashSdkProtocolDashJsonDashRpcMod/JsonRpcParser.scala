package typings.atAwsDashSdkProtocolDashJsonDashRpc.atAwsDashSdkProtocolDashJsonDashRpcMod

import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", "JsonRpcParser")
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

