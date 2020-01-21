package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to reboot.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object RebootRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): RebootRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RebootRelationalDatabaseRequest]
  }
}

