package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabasesResponse extends js.Object {
  /**
    * A list of Database objects from the specified catalog.
    */
  var DatabaseList: typings.awsSdk.glueMod.DatabaseList = js.native
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetDatabasesResponse {
  @scala.inline
  def apply(DatabaseList: DatabaseList, NextToken: Token = null): GetDatabasesResponse = {
    val __obj = js.Dynamic.literal(DatabaseList = DatabaseList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabasesResponse]
  }
}

