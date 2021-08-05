package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficMirrorTargetsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more Traffic Mirror targets.
    */
  var TrafficMirrorTargets: js.UndefOr[TrafficMirrorTargetSet] = js.undefined
}
object DescribeTrafficMirrorTargetsResult {
  
  inline def apply(): DescribeTrafficMirrorTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorTargetsResult]
  }
  
  extension [Self <: DescribeTrafficMirrorTargetsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrafficMirrorTargets(value: TrafficMirrorTargetSet): Self = StObject.set(x, "TrafficMirrorTargets", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorTargetsUndefined: Self = StObject.set(x, "TrafficMirrorTargets", js.undefined)
    
    inline def setTrafficMirrorTargetsVarargs(value: TrafficMirrorTarget*): Self = StObject.set(x, "TrafficMirrorTargets", js.Array(value :_*))
  }
}
