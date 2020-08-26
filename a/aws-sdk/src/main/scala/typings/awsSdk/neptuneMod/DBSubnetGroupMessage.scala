package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSubnetGroupMessage extends js.Object {
  /**
    *  A list of DBSubnetGroup instances.
    */
  var DBSubnetGroups: js.UndefOr[typings.awsSdk.neptuneMod.DBSubnetGroups] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBSubnetGroupMessage {
  @scala.inline
  def apply(): DBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroupMessage]
  }
  @scala.inline
  implicit class DBSubnetGroupMessageOps[Self <: DBSubnetGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBSubnetGroupsVarargs(value: DBSubnetGroup*): Self = this.set("DBSubnetGroups", js.Array(value :_*))
    @scala.inline
    def setDBSubnetGroups(value: DBSubnetGroups): Self = this.set("DBSubnetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroups: Self = this.set("DBSubnetGroups", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

