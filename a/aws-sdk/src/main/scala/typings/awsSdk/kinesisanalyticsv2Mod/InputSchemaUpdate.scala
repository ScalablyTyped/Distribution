package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSchemaUpdate extends js.Object {
  /**
    * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream.
    */
  var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.native
  /**
    * Specifies the encoding of the records in the streaming source; for example, UTF-8.
    */
  var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.native
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.native
}

object InputSchemaUpdate {
  @scala.inline
  def apply(
    RecordColumnUpdates: RecordColumns = null,
    RecordEncodingUpdate: RecordEncoding = null,
    RecordFormatUpdate: RecordFormat = null
  ): InputSchemaUpdate = {
    val __obj = js.Dynamic.literal()
    if (RecordColumnUpdates != null) __obj.updateDynamic("RecordColumnUpdates")(RecordColumnUpdates.asInstanceOf[js.Any])
    if (RecordEncodingUpdate != null) __obj.updateDynamic("RecordEncodingUpdate")(RecordEncodingUpdate.asInstanceOf[js.Any])
    if (RecordFormatUpdate != null) __obj.updateDynamic("RecordFormatUpdate")(RecordFormatUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSchemaUpdate]
  }
}

