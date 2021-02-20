package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrafficMirrorTargetsResult extends StObject {
  
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
  implicit class DescribeTrafficMirrorTargetsResultMutableBuilder[Self <: DescribeTrafficMirrorTargetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorTargets(value: TrafficMirrorTargetSet): Self = StObject.set(x, "TrafficMirrorTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorTargetsUndefined: Self = StObject.set(x, "TrafficMirrorTargets", js.undefined)
    
    @scala.inline
    def setTrafficMirrorTargetsVarargs(value: TrafficMirrorTarget*): Self = StObject.set(x, "TrafficMirrorTargets", js.Array(value :_*))
  }
}
