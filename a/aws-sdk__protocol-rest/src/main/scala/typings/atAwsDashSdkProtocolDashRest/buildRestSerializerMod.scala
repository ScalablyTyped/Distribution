package typings.atAwsDashSdkProtocolDashRest

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typings.atAwsDashSdkTypes.buildMarshallerMod.RequestSerializer
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest/build/RestSerializer", JSImport.Namespace)
@js.native
object buildRestSerializerMod extends js.Object {
  @js.native
  class RestSerializer[StreamType] protected () extends RequestSerializer[StreamType] {
    def this(
      endpoint: HttpEndpoint,
      bodySerializer: BodySerializer[String],
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
    val base64Encoder: js.Any = js.native
    val bodySerializer: js.Any = js.native
    val endpoint: js.Any = js.native
    /**
      * Used to parse modeled paths that already include query strings.
      * Does not attempt to unescape values.
      * @param queryString
      */
    var parseQueryString: js.Any = js.native
    var populateHeader: js.Any = js.native
    var populateQuery: js.Any = js.native
    var populateUri: js.Any = js.native
    var serializeBody: js.Any = js.native
    var serializeNonBody: js.Any = js.native
    var utf8Decoder: js.Any = js.native
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
  
  type UserInput = StringDictionary[js.Any]
}

