package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionsFilter extends js.Object {
  /**
    * The type of connections to return. Currently, SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typings.awsSdk.glueMod.ConnectionType] = js.native
  /**
    * A criteria string that must match the criteria recorded in the connection definition for that connection definition to be returned.
    */
  var MatchCriteria: js.UndefOr[typings.awsSdk.glueMod.MatchCriteria] = js.native
}

object GetConnectionsFilter {
  @scala.inline
  def apply(): GetConnectionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsFilter]
  }
  @scala.inline
  implicit class GetConnectionsFilterOps[Self <: GetConnectionsFilter] (val x: Self) extends AnyVal {
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
    def setConnectionType(value: ConnectionType): Self = this.set("ConnectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionType: Self = this.set("ConnectionType", js.undefined)
    @scala.inline
    def setMatchCriteriaVarargs(value: NameString*): Self = this.set("MatchCriteria", js.Array(value :_*))
    @scala.inline
    def setMatchCriteria(value: MatchCriteria): Self = this.set("MatchCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCriteria: Self = this.set("MatchCriteria", js.undefined)
  }
  
}

