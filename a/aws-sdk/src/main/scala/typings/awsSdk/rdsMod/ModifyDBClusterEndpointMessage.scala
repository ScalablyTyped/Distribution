package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier of the endpoint to modify. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: js.UndefOr[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
}

object ModifyDBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String): ModifyDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterEndpointMessage]
  }
  @scala.inline
  implicit class ModifyDBClusterEndpointMessageOps[Self <: ModifyDBClusterEndpointMessage] (val x: Self) extends AnyVal {
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
    def setEndpointType(value: String): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
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
  }
  
}

