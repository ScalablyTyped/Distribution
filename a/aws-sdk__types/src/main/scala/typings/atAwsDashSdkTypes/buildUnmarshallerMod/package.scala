package typings.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildUnmarshallerMod {
  import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
  import typings.atAwsDashSdkTypes.buildHttpMod.ResolvedHttpResponse
  import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
  import typings.std.Uint8Array

  type ServiceExceptionParser = js.Function3[
    /* operation */ OperationModel, 
    /* response */ ResolvedHttpResponse, 
    /* errorBodyParser */ BodyParser[String], 
    ServiceException[js.Any]
  ]
  type StreamCollector[StreamType] = js.Function1[/* stream */ StreamType, js.Promise[Uint8Array]]
}
