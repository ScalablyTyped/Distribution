package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNodesResponse extends js.Object {
  /**
    * 
    The paginated results marker. When the result of a ListNodes operation is truncated, the call returns NextToken in the response. 
    To get another batch of nodes, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * 
    List containing a NodeInfo object.
    
    */
  var NodeInfoList: js.UndefOr[listOfNodeInfo] = js.native
}

object ListNodesResponse {
  @scala.inline
  def apply(): ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesResponse]
  }
  @scala.inline
  implicit class ListNodesResponseOps[Self <: ListNodesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setNodeInfoListVarargs(value: NodeInfo*): Self = this.set("NodeInfoList", js.Array(value :_*))
    @scala.inline
    def setNodeInfoList(value: listOfNodeInfo): Self = this.set("NodeInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeInfoList: Self = this.set("NodeInfoList", js.undefined)
  }
  
}

