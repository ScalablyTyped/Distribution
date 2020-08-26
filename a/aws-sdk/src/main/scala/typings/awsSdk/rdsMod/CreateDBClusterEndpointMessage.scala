package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: String = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
  /**
    * The tags to be assigned to the Amazon RDS resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String, DBClusterIdentifier: String, EndpointType: String): CreateDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any], DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterEndpointMessage]
  }
  @scala.inline
  implicit class CreateDBClusterEndpointMessageOps[Self <: CreateDBClusterEndpointMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterEndpointIdentifier(value: String): Self = this.set("DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointType(value: String): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludedMembersVarargs(value: String*): Self = this.set("ExcludedMembers", js.Array(value :_*))
    @scala.inline
    def setExcludedMembers(value: StringList): Self = this.set("ExcludedMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedMembers: Self = this.set("ExcludedMembers", js.undefined)
    @scala.inline
    def setStaticMembersVarargs(value: String*): Self = this.set("StaticMembers", js.Array(value :_*))
    @scala.inline
    def setStaticMembers(value: StringList): Self = this.set("StaticMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticMembers: Self = this.set("StaticMembers", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

