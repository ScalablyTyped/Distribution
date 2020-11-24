package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameServerInstancesOutput extends js.Object {
  
  /**
    *  The collection of requested game server instances. 
    */
  var GameServerInstances: js.UndefOr[typings.awsSdk.gameliftMod.GameServerInstances] = js.native
  
  /**
    *  A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list. 
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameServerInstancesOutput {
  
  @scala.inline
  def apply(): DescribeGameServerInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerInstancesOutput]
  }
  
  @scala.inline
  implicit class DescribeGameServerInstancesOutputOps[Self <: DescribeGameServerInstancesOutput] (val x: Self) extends AnyVal {
    
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
    def setGameServerInstancesVarargs(value: GameServerInstance*): Self = this.set("GameServerInstances", js.Array(value :_*))
    
    @scala.inline
    def setGameServerInstances(value: GameServerInstances): Self = this.set("GameServerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerInstances: Self = this.set("GameServerInstances", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
