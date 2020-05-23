package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  /**
    * By default, UpdateTable always creates an archived version of the table before updating it. However, if skipArchive is set to true, UpdateTable does not create the archived version.
    */
  var SkipArchive: js.UndefOr[BooleanNullable] = js.native
  /**
    * An updated TableInput object to define the metadata table in the catalog.
    */
  var TableInput: typings.awsSdk.glueMod.TableInput = js.native
}

object UpdateTableRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableInput: TableInput,
    CatalogId: CatalogIdString = null,
    SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
  ): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableInput = TableInput.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    if (!js.isUndefined(SkipArchive)) __obj.updateDynamic("SkipArchive")(SkipArchive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
}

