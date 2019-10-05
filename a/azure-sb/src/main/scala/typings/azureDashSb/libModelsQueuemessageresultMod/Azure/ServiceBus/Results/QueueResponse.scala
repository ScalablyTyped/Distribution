package typings.azureDashSb.libModelsQueuemessageresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueResponse extends js.Object {
  var body: js.Any
  var headers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
}

object QueueResponse {
  @scala.inline
  def apply(
    body: js.Any,
    headers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
  ): QueueResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers)
  
    __obj.asInstanceOf[QueueResponse]
  }
}

