package typings.awsSdkClientS3Node.typesMetadataEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataEntry extends js.Object {
  /**
    * _MetadataKey shape
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * _MetadataValue shape
    */
  var Value: js.UndefOr[String] = js.undefined
}

object MetadataEntry {
  @scala.inline
  def apply(Name: String = null, Value: String = null): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataEntry]
  }
}

