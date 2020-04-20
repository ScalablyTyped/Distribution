package typings.azureSb.queuemessageresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueResponse extends js.Object {
  var body: js.Any
  var headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
}

object QueueResponse {
  @scala.inline
  def apply(
    body: js.Any,
    headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
  ): QueueResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueResponse]
  }
}

