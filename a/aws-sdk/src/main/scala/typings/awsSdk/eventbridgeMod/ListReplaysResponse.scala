package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReplaysResponse extends js.Object {
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  
  /**
    * An array of Replay objects that contain information about the replay.
    */
  var Replays: js.UndefOr[ReplayList] = js.native
}
object ListReplaysResponse {
  
  @scala.inline
  def apply(): ListReplaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplaysResponse]
  }
  
  @scala.inline
  implicit class ListReplaysResponseOps[Self <: ListReplaysResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setReplaysVarargs(value: Replay*): Self = this.set("Replays", js.Array(value :_*))
    
    @scala.inline
    def setReplays(value: ReplayList): Self = this.set("Replays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplays: Self = this.set("Replays", js.undefined)
  }
}
