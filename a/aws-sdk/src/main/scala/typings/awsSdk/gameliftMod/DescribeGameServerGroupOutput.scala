package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameServerGroupOutput extends js.Object {
  
  /**
    * An object with the property settings for the requested game server group resource. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}
object DescribeGameServerGroupOutput {
  
  @scala.inline
  def apply(): DescribeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class DescribeGameServerGroupOutputOps[Self <: DescribeGameServerGroupOutput] (val x: Self) extends AnyVal {
    
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
    def setGameServerGroup(value: GameServerGroup): Self = this.set("GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroup: Self = this.set("GameServerGroup", js.undefined)
  }
}
