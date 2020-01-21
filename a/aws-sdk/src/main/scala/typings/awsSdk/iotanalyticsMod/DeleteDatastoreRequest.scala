package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatastoreRequest extends js.Object {
  /**
    * The name of the data store to delete.
    */
  var datastoreName: DatastoreName = js.native
}

object DeleteDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName): DeleteDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDatastoreRequest]
  }
}

