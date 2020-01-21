package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceMessage extends js.Object {
  /**
    *  A list of DBInstance instances.
    */
  var DBInstances: js.UndefOr[DBInstanceList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBInstanceMessage {
  @scala.inline
  def apply(DBInstances: DBInstanceList = null, Marker: String = null): DBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    if (DBInstances != null) __obj.updateDynamic("DBInstances")(DBInstances.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBInstanceMessage]
  }
}

