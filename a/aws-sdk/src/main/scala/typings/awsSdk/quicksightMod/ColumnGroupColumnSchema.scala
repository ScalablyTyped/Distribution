package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroupColumnSchema extends js.Object {
  /**
    * The name of the column group's column schema.
    */
  var Name: js.UndefOr[String] = js.native
}

object ColumnGroupColumnSchema {
  @scala.inline
  def apply(Name: String = null): ColumnGroupColumnSchema = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupColumnSchema]
  }
}

