package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreActivity extends js.Object {
  /**
    * The name of the data store where processed messages are stored.
    */
  var datastoreName: DatastoreName = js.native
  /**
    * The name of the 'datastore' activity.
    */
  var name: ActivityName = js.native
}

object DatastoreActivity {
  @scala.inline
  def apply(datastoreName: DatastoreName, name: ActivityName): DatastoreActivity = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreActivity]
  }
}

