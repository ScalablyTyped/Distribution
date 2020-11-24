package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlayerSessionsOutput extends js.Object {
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A collection of objects containing properties for each player session that matches the request.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}
object DescribePlayerSessionsOutput {
  
  @scala.inline
  def apply(): DescribePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlayerSessionsOutput]
  }
  
  @scala.inline
  implicit class DescribePlayerSessionsOutputOps[Self <: DescribePlayerSessionsOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPlayerSessionsVarargs(value: PlayerSession*): Self = this.set("PlayerSessions", js.Array(value :_*))
    
    @scala.inline
    def setPlayerSessions(value: PlayerSessionList): Self = this.set("PlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerSessions: Self = this.set("PlayerSessions", js.undefined)
  }
}
