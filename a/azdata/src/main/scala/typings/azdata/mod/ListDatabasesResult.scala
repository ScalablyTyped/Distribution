package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatabasesResult extends js.Object {
  var databaseNames: js.Array[String]
}

object ListDatabasesResult {
  @scala.inline
  def apply(databaseNames: js.Array[String]): ListDatabasesResult = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatabasesResult]
  }
}

