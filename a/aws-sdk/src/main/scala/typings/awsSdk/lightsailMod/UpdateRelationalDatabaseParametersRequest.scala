package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRelationalDatabaseParametersRequest extends js.Object {
  /**
    * The database parameters to update.
    */
  var parameters: RelationalDatabaseParameterList = js.native
  /**
    * The name of your database for which to update parameters.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object UpdateRelationalDatabaseParametersRequest {
  @scala.inline
  def apply(parameters: RelationalDatabaseParameterList, relationalDatabaseName: ResourceName): UpdateRelationalDatabaseParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelationalDatabaseParametersRequest]
  }
}

