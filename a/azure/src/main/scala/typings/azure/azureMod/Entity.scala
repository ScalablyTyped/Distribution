package typings.azure.azureMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity
  extends /* property */ StringDictionary[js.UndefOr[String | Double | Boolean | Date]] {
  var PartitionKey: String
  var RowKey: String
  var Timestamp: js.UndefOr[Date] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    PartitionKey: String,
    RowKey: String,
    StringDictionary: /* property */ StringDictionary[js.UndefOr[String | Double | Boolean | Date]] = null,
    Timestamp: Date = null,
    etag: String = null
  ): Entity = {
    val __obj = js.Dynamic.literal(PartitionKey = PartitionKey.asInstanceOf[js.Any], RowKey = RowKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

