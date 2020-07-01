package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataItem extends js.Object {
  /**
    * The formatted value of the data. e.g. John Smith.
    */
  var formattedValue: js.UndefOr[FormattedValue] = js.native
  /**
    *  The overrideFormat is optional and is specified only if a particular row of data has a different format for the data than the default format defined on the screen or the table. 
    */
  var overrideFormat: js.UndefOr[Format] = js.native
  /**
    * The raw value of the data. e.g. jsmith@example.com
    */
  var rawValue: js.UndefOr[RawValue] = js.native
}

object DataItem {
  @scala.inline
  def apply(formattedValue: FormattedValue = null, overrideFormat: Format = null, rawValue: RawValue = null): DataItem = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (overrideFormat != null) __obj.updateDynamic("overrideFormat")(overrideFormat.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
}

