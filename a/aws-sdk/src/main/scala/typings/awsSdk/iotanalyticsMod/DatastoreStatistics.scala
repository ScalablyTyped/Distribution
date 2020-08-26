package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreStatistics extends js.Object {
  /**
    * The estimated size of the data store.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.native
}

object DatastoreStatistics {
  @scala.inline
  def apply(): DatastoreStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStatistics]
  }
  @scala.inline
  implicit class DatastoreStatisticsOps[Self <: DatastoreStatistics] (val x: Self) extends AnyVal {
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
    def setSize(value: EstimatedResourceSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

