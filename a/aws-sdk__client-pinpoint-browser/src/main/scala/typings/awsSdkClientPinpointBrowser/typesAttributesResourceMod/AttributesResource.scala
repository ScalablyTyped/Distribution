package typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The attribute type for the application.
    */
  var AttributeType: js.UndefOr[String] = js.undefined
  /**
    * The attributes for the application.
    */
  var Attributes: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object AttributesResource {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    AttributeType: String = null,
    Attributes: js.Array[String] | Iterable[String] = null
  ): AttributesResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesResource]
  }
}

