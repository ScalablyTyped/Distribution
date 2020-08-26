package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.protocolMod.MemberLocation
import typings.awsSdkTypes.protocolMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented> */
/* Inlined parent @aws-sdk/types.@aws-sdk/types.Member */
@js.native
trait TreeModelMember extends js.Object {
  var documentation: js.UndefOr[String] = js.native
  var flattened: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[MemberLocation] = js.native
  var locationName: js.UndefOr[String] = js.native
  var queryName: js.UndefOr[String] = js.native
  var resultWrapper: js.UndefOr[String] = js.native
  var sensitive: js.UndefOr[Boolean] = js.native
  var shape: TreeModelShape = js.native
  var streaming: js.UndefOr[Boolean] = js.native
  var xmlAttribute: js.UndefOr[Boolean] = js.native
  var xmlNamespace: js.UndefOr[XmlNamespace] = js.native
}

object TreeModelMember {
  @scala.inline
  def apply(shape: TreeModelShape): TreeModelMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelMember]
  }
  @scala.inline
  implicit class TreeModelMemberOps[Self <: TreeModelMember] (val x: Self) extends AnyVal {
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
    def setShape(value: TreeModelShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setFlattened(value: Boolean): Self = this.set("flattened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattened: Self = this.set("flattened", js.undefined)
    @scala.inline
    def setLocation(value: MemberLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationName(value: String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
    @scala.inline
    def setQueryName(value: String): Self = this.set("queryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryName: Self = this.set("queryName", js.undefined)
    @scala.inline
    def setResultWrapper(value: String): Self = this.set("resultWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultWrapper: Self = this.set("resultWrapper", js.undefined)
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setStreaming(value: Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    @scala.inline
    def setXmlAttribute(value: Boolean): Self = this.set("xmlAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlAttribute: Self = this.set("xmlAttribute", js.undefined)
    @scala.inline
    def setXmlNamespace(value: XmlNamespace): Self = this.set("xmlNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlNamespace: Self = this.set("xmlNamespace", js.undefined)
  }
  
}

