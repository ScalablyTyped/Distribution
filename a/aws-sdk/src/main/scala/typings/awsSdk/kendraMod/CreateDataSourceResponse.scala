package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceResponse extends js.Object {
  /**
    * A unique identifier for the data source.
    */
  var Id: DataSourceId = js.native
}

object CreateDataSourceResponse {
  @scala.inline
  def apply(Id: DataSourceId): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
}

