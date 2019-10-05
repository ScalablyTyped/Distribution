package typings.atAwsDashSdkProtocolDashJsonDashRpc

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typings.atAwsDashSdkTypes.buildMarshallerMod.RequestSerializer
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc/build/JsonRpcSerializer", JSImport.Namespace)
@js.native
object buildJsonRpcSerializerMod extends js.Object {
  @js.native
  class JsonRpcSerializer[StreamType] protected () extends RequestSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
    val bodySerializer: js.Any = js.native
    val endpoint: js.Any = js.native
    /**
      * Converts the provided `input` into an HTTP request
      *
      * @param operation The operation to be executed via the returned HTTP
      *                  request.
      * @param input     The user input to serialize.
      */
    /* CompleteClass */
    override def serialize(operation: OperationModel, input: js.Any): HttpRequest[StreamType] = js.native
  }
  
}

