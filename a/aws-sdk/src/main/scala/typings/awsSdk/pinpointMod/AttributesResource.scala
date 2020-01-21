package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributesResource extends js.Object {
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: string = js.native
  /**
    * The type of attribute or attributes that were removed from the endpoints. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints. endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints. endpoint-user-attributes - Custom attributes that describe users.
    */
  var AttributeType: string = js.native
  /**
    * An array that specifies the names of the attributes that were removed from the endpoints.
    */
  var Attributes: js.UndefOr[ListOfString] = js.native
}

object AttributesResource {
  @scala.inline
  def apply(ApplicationId: string, AttributeType: string, Attributes: ListOfString = null): AttributesResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesResource]
  }
}

