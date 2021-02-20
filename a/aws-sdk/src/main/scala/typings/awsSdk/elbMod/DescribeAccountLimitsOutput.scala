package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountLimitsOutput extends StObject {
  
  /**
    * Information about the limits.
    */
  var Limits: js.UndefOr[typings.awsSdk.elbMod.Limits] = js.native
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}
object DescribeAccountLimitsOutput {
  
  @scala.inline
  def apply(): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
  
  @scala.inline
  implicit class DescribeAccountLimitsOutputMutableBuilder[Self <: DescribeAccountLimitsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimits(value: Limits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setLimitsVarargs(value: Limit*): Self = StObject.set(x, "Limits", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
