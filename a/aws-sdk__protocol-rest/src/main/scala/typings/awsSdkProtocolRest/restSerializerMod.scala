package typings.awsSdkProtocolRest

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.marshallerMod.RequestSerializer
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest/build/RestSerializer", JSImport.Namespace)
@js.native
object restSerializerMod extends js.Object {
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

