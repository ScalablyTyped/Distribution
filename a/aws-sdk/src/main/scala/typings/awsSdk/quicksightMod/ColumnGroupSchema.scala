package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroupSchema extends js.Object {
  /**
    * A structure containing the list of schemas for column group columns.
    */
  var ColumnGroupColumnSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnGroupColumnSchemaList] = js.native
  /**
    * The name of the column group schema.
    */
  var Name: js.UndefOr[String] = js.native
}

object ColumnGroupSchema {
  @scala.inline
  def apply(ColumnGroupColumnSchemaList: ColumnGroupColumnSchemaList = null, Name: String = null): ColumnGroupSchema = {
    val __obj = js.Dynamic.literal()
    if (ColumnGroupColumnSchemaList != null) __obj.updateDynamic("ColumnGroupColumnSchemaList")(ColumnGroupColumnSchemaList.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupSchema]
  }
}

