package typings.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unmarshallerMod {
  type ServiceExceptionParser = js.Function3[
    /* operation */ typings.awsSdkTypes.protocolMod.OperationModel, 
    /* response */ typings.awsSdkTypes.httpMod.ResolvedHttpResponse, 
    /* errorBodyParser */ typings.awsSdkTypes.unmarshallerMod.BodyParser[java.lang.String], 
    typings.awsSdkTypes.exceptionMod.ServiceException[js.Any]
  ]
  type StreamCollector[StreamType] = js.Function1[/* stream */ StreamType, js.Promise[typings.std.Uint8Array]]
}
