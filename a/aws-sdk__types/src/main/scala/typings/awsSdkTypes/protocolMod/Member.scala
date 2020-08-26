package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  var flattened: js.UndefOr[scala.Boolean] = js.native
  var location: js.UndefOr[MemberLocation] = js.native
  var locationName: js.UndefOr[java.lang.String] = js.native
  var queryName: js.UndefOr[java.lang.String] = js.native
  var resultWrapper: js.UndefOr[java.lang.String] = js.native
  var sensitive: js.UndefOr[scala.Boolean] = js.native
  var shape: SerializationModel = js.native
  var streaming: js.UndefOr[scala.Boolean] = js.native
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.native
  var xmlNamespace: js.UndefOr[XmlNamespace] = js.native
}

object Member {
  @scala.inline
  def apply(shape: SerializationModel): Member = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShape(value: SerializationModel): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = this.set("flattened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattened: Self = this.set("flattened", js.undefined)
    @scala.inline
    def setLocation(value: MemberLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationName(value: java.lang.String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
    @scala.inline
    def setQueryName(value: java.lang.String): Self = this.set("queryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryName: Self = this.set("queryName", js.undefined)
    @scala.inline
    def setResultWrapper(value: java.lang.String): Self = this.set("resultWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultWrapper: Self = this.set("resultWrapper", js.undefined)
    @scala.inline
    def setSensitive(value: scala.Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setStreaming(value: scala.Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    @scala.inline
    def setXmlAttribute(value: scala.Boolean): Self = this.set("xmlAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlAttribute: Self = this.set("xmlAttribute", js.undefined)
    @scala.inline
    def setXmlNamespace(value: XmlNamespace): Self = this.set("xmlNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlNamespace: Self = this.set("xmlNamespace", js.undefined)
  }
  
}

