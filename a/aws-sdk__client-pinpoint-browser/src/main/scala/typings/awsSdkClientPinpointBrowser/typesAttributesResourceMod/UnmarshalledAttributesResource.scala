package typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAttributesResource extends AttributesResource {
  /**
    * The attributes for the application.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledAttributesResource: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledAttributesResource {
  @scala.inline
  def apply(): UnmarshalledAttributesResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAttributesResource]
  }
  @scala.inline
  implicit class UnmarshalledAttributesResourceOps[Self <: UnmarshalledAttributesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

