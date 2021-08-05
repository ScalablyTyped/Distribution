package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetGroupsOutput extends StObject {
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * Information about the target groups.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroups] = js.undefined
}
object DescribeTargetGroupsOutput {
  
  inline def apply(): DescribeTargetGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetGroupsOutput]
  }
  
  extension [Self <: DescribeTargetGroupsOutput](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTargetGroups(value: TargetGroups): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    inline def setTargetGroupsVarargs(value: TargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value :_*))
  }
}
