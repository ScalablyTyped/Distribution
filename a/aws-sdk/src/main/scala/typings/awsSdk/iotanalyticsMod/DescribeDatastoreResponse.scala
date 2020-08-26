package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatastoreResponse extends js.Object {
  /**
    * Information about the data store.
    */
  var datastore: js.UndefOr[Datastore] = js.native
  /**
    * Additional statistical information about the data store. Included if the 'includeStatistics' parameter is set to true in the request.
    */
  var statistics: js.UndefOr[DatastoreStatistics] = js.native
}

object DescribeDatastoreResponse {
  @scala.inline
  def apply(): DescribeDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatastoreResponse]
  }
  @scala.inline
  implicit class DescribeDatastoreResponseOps[Self <: DescribeDatastoreResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatastore(value: Datastore): Self = this.set("datastore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatastore: Self = this.set("datastore", js.undefined)
    @scala.inline
    def setStatistics(value: DatastoreStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
  }
  
}

