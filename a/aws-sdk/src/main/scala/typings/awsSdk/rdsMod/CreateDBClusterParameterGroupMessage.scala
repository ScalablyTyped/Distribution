package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group. Constraints:   Must match the name of an existing DB cluster parameter group.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: String = js.native
  /**
    * The DB cluster parameter group family name. A DB cluster parameter group can be associated with one and only one DB cluster parameter group family, and can be applied only to a DB cluster running a database engine and engine version compatible with that DB cluster parameter group family.  Aurora MySQL  Example: aurora5.6, aurora-mysql5.7   Aurora PostgreSQL  Example: aurora-postgresql9.6 
    */
  var DBParameterGroupFamily: String = js.native
  /**
    * The description for the DB cluster parameter group.
    */
  var Description: String = js.native
  /**
    * Tags to assign to the DB cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterParameterGroupMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String, DBParameterGroupFamily: String, Description: String): CreateDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterParameterGroupMessage]
  }
  @scala.inline
  implicit class CreateDBClusterParameterGroupMessageOps[Self <: CreateDBClusterParameterGroupMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterParameterGroupName(value: String): Self = this.set("DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = this.set("DBParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

