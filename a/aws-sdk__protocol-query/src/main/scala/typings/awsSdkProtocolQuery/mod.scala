package typings.awsSdkProtocolQuery

import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected ()
    extends typings.awsSdkProtocolQuery.queryParserMod.QueryParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends typings.awsSdkProtocolQuery.querySerializerMod.QuerySerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

