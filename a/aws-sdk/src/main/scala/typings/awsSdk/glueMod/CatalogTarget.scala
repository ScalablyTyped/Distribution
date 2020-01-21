package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTarget extends js.Object {
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString = js.native
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList = js.native
}

object CatalogTarget {
  @scala.inline
  def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CatalogTarget]
  }
}

