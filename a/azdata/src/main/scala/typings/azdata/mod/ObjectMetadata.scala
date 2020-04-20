package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMetadata extends js.Object {
  var metadataType: MetadataType
  var metadataTypeName: String
  var name: String
  var schema: String
  var urn: String
}

object ObjectMetadata {
  @scala.inline
  def apply(metadataType: MetadataType, metadataTypeName: String, name: String, schema: String, urn: String): ObjectMetadata = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any], metadataTypeName = metadataTypeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetadata]
  }
}

