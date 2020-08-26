package typings.awsSdkProtocolQuery

import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.marshallerMod.RequestSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query/build/QuerySerializer", JSImport.Namespace)
@js.native
object querySerializerMod extends js.Object {
  @js.native
  class QuerySerializer[StreamType] protected () extends RequestSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
    val bodySerializer: js.Any = js.native
    val endpoint: js.Any = js.native
  }
  
}

