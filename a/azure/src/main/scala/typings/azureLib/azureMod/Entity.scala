package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date]] {
  var PartitionKey: java.lang.String
  var RowKey: java.lang.String
  var Timestamp: js.UndefOr[stdLib.Date] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    PartitionKey: java.lang.String,
    RowKey: java.lang.String,
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date]] = null,
    Timestamp: stdLib.Date = null,
    etag: java.lang.String = null
  ): Entity = {
    val __obj = js.Dynamic.literal(PartitionKey = PartitionKey, RowKey = RowKey)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    __obj.asInstanceOf[Entity]
  }
}

