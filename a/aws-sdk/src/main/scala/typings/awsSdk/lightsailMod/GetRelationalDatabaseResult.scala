package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the specified database.
    */
  var relationalDatabase: js.UndefOr[RelationalDatabase] = js.native
}

object GetRelationalDatabaseResult {
  @scala.inline
  def apply(relationalDatabase: RelationalDatabase = null): GetRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (relationalDatabase != null) __obj.updateDynamic("relationalDatabase")(relationalDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseResult]
  }
}

