package typings.atAwsDashSdkProtocolDashQuery.atAwsDashSdkProtocolDashQueryMod

import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", "QueryParser")
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

