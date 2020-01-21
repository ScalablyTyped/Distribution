package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseResponse extends js.Object {
  /**
    * The definition of the specified database in the Data Catalog.
    */
  var Database: js.UndefOr[typings.awsSdk.glueMod.Database] = js.native
}

object GetDatabaseResponse {
  @scala.inline
  def apply(Database: Database = null): GetDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    if (Database != null) __obj.updateDynamic("Database")(Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabaseResponse]
  }
}

