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
  def apply(NextToken: string = null, NodeInfoList: listOfNodeInfo = null): ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NodeInfoList != null) __obj.updateDynamic("NodeInfoList")(NodeInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodesResponse]
  }
}

