package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrafficMirrorSessionsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  var TrafficMirrorSessions: js.UndefOr[TrafficMirrorSessionSet] = js.native
}
object DescribeTrafficMirrorSessionsResult {
  
  @scala.inline
  def apply(): DescribeTrafficMirrorSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorSessionsResult]
  }
  
  @scala.inline
  implicit class DescribeTrafficMirrorSessionsResultOps[Self <: DescribeTrafficMirrorSessionsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorSessionsVarargs(value: TrafficMirrorSession*): Self = this.set("TrafficMirrorSessions", js.Array(value :_*))
    
    @scala.inline
    def setTrafficMirrorSessions(value: TrafficMirrorSessionSet): Self = this.set("TrafficMirrorSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorSessions: Self = this.set("TrafficMirrorSessions", js.undefined)
  }
}
