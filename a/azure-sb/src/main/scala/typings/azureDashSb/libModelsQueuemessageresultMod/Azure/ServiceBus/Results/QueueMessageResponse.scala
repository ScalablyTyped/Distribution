package typings.azureDashSb.libModelsQueuemessageresultMod.Azure.ServiceBus.Results

import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.BrokerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueMessageResponse extends js.Object {
  var body: js.Any
  var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var customProperties: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
  ] = js.undefined
  var location: js.UndefOr[String] = js.undefined
}

object QueueMessageResponse {
  @scala.inline
  def apply(
    body: js.Any,
    brokerProperties: BrokerProperties = null,
    contentType: String = null,
    customProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any = null,
    location: String = null
  ): QueueMessageResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (brokerProperties != null) __obj.updateDynamic("brokerProperties")(brokerProperties.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (customProperties != null) __obj.updateDynamic("customProperties")(customProperties.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueMessageResponse]
  }
}

