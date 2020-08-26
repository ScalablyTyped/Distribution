package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMetadata extends js.Object {
  var metadataType: MetadataType = js.native
  var metadataTypeName: String = js.native
  var name: String = js.native
  var schema: String = js.native
  var urn: String = js.native
}

object ObjectMetadata {
  @scala.inline
  def apply(metadataType: MetadataType, metadataTypeName: String, name: String, schema: String, urn: String): ObjectMetadata = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any], metadataTypeName = metadataTypeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetadata]
  }
  @scala.inline
  implicit class ObjectMetadataOps[Self <: ObjectMetadata] (val x: Self) extends AnyVal {
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
    def setMetadataType(value: MetadataType): Self = this.set("metadataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataTypeName(value: String): Self = this.set("metadataTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrn(value: String): Self = this.set("urn", value.asInstanceOf[js.Any])
  }
  
}

