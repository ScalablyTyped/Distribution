package typings.atAwsDashSdkProtocolDashQuery.atAwsDashSdkProtocolDashQueryMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", "QuerySerializer")
@js.native
class QuerySerializer[StreamType] protected ()
  extends typings.atAwsDashSdkProtocolDashQuery.buildQuerySerializerMod.QuerySerializer[StreamType] {
  def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
}

