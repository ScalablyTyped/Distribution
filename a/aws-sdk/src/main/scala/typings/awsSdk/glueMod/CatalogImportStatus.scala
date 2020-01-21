package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogImportStatus extends js.Object {
  /**
    *  True if the migration has completed, or False otherwise.
    */
  var ImportCompleted: js.UndefOr[Boolean] = js.native
  /**
    * The time that the migration was started.
    */
  var ImportTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the person who initiated the migration.
    */
  var ImportedBy: js.UndefOr[NameString] = js.native
}

object CatalogImportStatus {
  @scala.inline
  def apply(
    ImportCompleted: js.UndefOr[scala.Boolean] = js.undefined,
    ImportTime: Timestamp = null,
    ImportedBy: NameString = null
  ): CatalogImportStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ImportCompleted)) __obj.updateDynamic("ImportCompleted")(ImportCompleted.asInstanceOf[js.Any])
    if (ImportTime != null) __obj.updateDynamic("ImportTime")(ImportTime.asInstanceOf[js.Any])
    if (ImportedBy != null) __obj.updateDynamic("ImportedBy")(ImportedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogImportStatus]
  }
}

