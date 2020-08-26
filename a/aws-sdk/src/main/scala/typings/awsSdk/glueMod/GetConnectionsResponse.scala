package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionsResponse extends js.Object {
  /**
    * A list of requested connection definitions.
    */
  var ConnectionList: js.UndefOr[typings.awsSdk.glueMod.ConnectionList] = js.native
  /**
    * A continuation token, if the list of connections returned does not include the last of the filtered connections.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetConnectionsResponse {
  @scala.inline
  def apply(): GetConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsResponse]
  }
  @scala.inline
  implicit class GetConnectionsResponseOps[Self <: GetConnectionsResponse] (val x: Self) extends AnyVal {
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
    def setConnectionListVarargs(value: Connection*): Self = this.set("ConnectionList", js.Array(value :_*))
    @scala.inline
    def setConnectionList(value: ConnectionList): Self = this.set("ConnectionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionList: Self = this.set("ConnectionList", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

