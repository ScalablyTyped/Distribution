package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to start.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object StartRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): StartRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRelationalDatabaseRequest]
  }
}

