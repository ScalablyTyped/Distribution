package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountLimitsOutput extends StObject {
  
  /**
    * Information about the limits.
    */
  var Limits: js.UndefOr[typings.awsSdk.elbMod.Limits] = js.undefined
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeAccountLimitsOutput {
  
  inline def apply(): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
  
  extension [Self <: DescribeAccountLimitsOutput](x: Self) {
    
    inline def setLimits(value: Limits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    inline def setLimitsVarargs(value: Limit*): Self = StObject.set(x, "Limits", js.Array(value :_*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
