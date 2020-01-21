package typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAttributesResource extends AttributesResource {
  /**
    * The attributes for the application.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledAttributesResource: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledAttributesResource {
  @scala.inline
  def apply(ApplicationId: String = null, AttributeType: String = null, Attributes: js.Array[String] = null): UnmarshalledAttributesResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAttributesResource]
  }
}

