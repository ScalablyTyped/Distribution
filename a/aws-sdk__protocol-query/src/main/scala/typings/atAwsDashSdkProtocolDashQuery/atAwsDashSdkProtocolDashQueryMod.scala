package typings.atAwsDashSdkProtocolDashQuery

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", JSImport.Namespace)
@js.native
object atAwsDashSdkProtocolDashQueryMod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected ()
    extends typings.atAwsDashSdkProtocolDashQuery.buildQueryParserMod.QueryParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends typings.atAwsDashSdkProtocolDashQuery.buildQuerySerializerMod.QuerySerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

