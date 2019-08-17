package typings.atAwsDashSdkProtocolDashJsonDashRpc.atAwsDashSdkProtocolDashJsonDashRpcMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", "JsonRpcSerializer")
@js.native
class JsonRpcSerializer[StreamType] protected ()
  extends typings.atAwsDashSdkProtocolDashJsonDashRpc.buildJsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
  def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
}

