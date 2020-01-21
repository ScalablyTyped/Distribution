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
  def apply(size: EstimatedResourceSize = null): DatastoreStatistics = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreStatistics]
  }
}

