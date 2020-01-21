package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableVersion extends js.Object {
  /**
    * The table in question.
    */
  var Table: js.UndefOr[typings.awsSdk.glueMod.Table] = js.native
  /**
    * The ID value that identifies this table version. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionId: js.UndefOr[VersionString] = js.native
}

object TableVersion {
  @scala.inline
  def apply(Table: Table = null, VersionId: VersionString = null): TableVersion = {
    val __obj = js.Dynamic.literal()
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableVersion]
  }
}

