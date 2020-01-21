package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSchema extends js.Object {
  /**
    * The data type of the column schema.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * The geographic role of the column schema.
    */
  var GeographicRole: js.UndefOr[String] = js.native
  /**
    * The name of the column schema.
    */
  var Name: js.UndefOr[String] = js.native
}

object ColumnSchema {
  @scala.inline
  def apply(DataType: String = null, GeographicRole: String = null, Name: String = null): ColumnSchema = {
    val __obj = js.Dynamic.literal()
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (GeographicRole != null) __obj.updateDynamic("GeographicRole")(GeographicRole.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSchema]
  }
}

