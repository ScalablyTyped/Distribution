package typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var nbRetry: Double
  var request: js.Any
}

object RequestInfo {
  @scala.inline
  def apply(nbRetry: Double, request: js.Any): RequestInfo = {
    val __obj = js.Dynamic.literal(nbRetry = nbRetry, request = request)
  
    __obj.asInstanceOf[RequestInfo]
  }
}

