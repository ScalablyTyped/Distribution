package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
  /**
    * The name of your database for which to get log streams.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseLogStreamsRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseLogStreamsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
  }
}

