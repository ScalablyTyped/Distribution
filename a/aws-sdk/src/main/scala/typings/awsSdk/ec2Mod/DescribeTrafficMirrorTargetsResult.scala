package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrafficMirrorTargetsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about one or more Traffic Mirror targets.
    */
  var TrafficMirrorTargets: js.UndefOr[TrafficMirrorTargetSet] = js.native
}
object DescribeTrafficMirrorTargetsResult {
  
  @scala.inline
  def apply(): DescribeTrafficMirrorTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorTargetsResult]
  }
  
  @scala.inline
  implicit class DescribeTrafficMirrorTargetsResultOps[Self <: DescribeTrafficMirrorTargetsResult] (val x: Self) extends AnyVal {
    
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
    def setTrafficMirrorTargetsVarargs(value: TrafficMirrorTarget*): Self = this.set("TrafficMirrorTargets", js.Array(value :_*))
    
    @scala.inline
    def setTrafficMirrorTargets(value: TrafficMirrorTargetSet): Self = this.set("TrafficMirrorTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorTargets: Self = this.set("TrafficMirrorTargets", js.undefined)
  }
}
