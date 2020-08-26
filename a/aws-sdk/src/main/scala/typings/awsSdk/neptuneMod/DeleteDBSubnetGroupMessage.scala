package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBSubnetGroupMessage extends js.Object {
  /**
    * The name of the database subnet group to delete.  You can't delete the default subnet group.  Constraints: Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String = js.native
}

object DeleteDBSubnetGroupMessage {
  @scala.inline
  def apply(DBSubnetGroupName: String): DeleteDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSubnetGroupMessage]
  }
  @scala.inline
  implicit class DeleteDBSubnetGroupMessageOps[Self <: DeleteDBSubnetGroupMessage] (val x: Self) extends AnyVal {
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
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
  }
  
}

