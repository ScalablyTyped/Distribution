package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlueTable extends js.Object {
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var CatalogId: js.UndefOr[NameString] = js.native
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var ConnectionName: js.UndefOr[NameString] = js.native
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var DatabaseName: NameString = js.native
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var TableName: NameString = js.native
}

object GlueTable {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableName: NameString,
    CatalogId: NameString = null,
    ConnectionName: NameString = null
  ): GlueTable = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    if (ConnectionName != null) __obj.updateDynamic("ConnectionName")(ConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueTable]
  }
}

