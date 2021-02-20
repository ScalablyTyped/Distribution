package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrafficMirrorFiltersResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about one or more Traffic Mirror filters.
    */
  var TrafficMirrorFilters: js.UndefOr[TrafficMirrorFilterSet] = js.native
}
object DescribeTrafficMirrorFiltersResult {
  
  @scala.inline
  def apply(): DescribeTrafficMirrorFiltersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorFiltersResult]
  }
  
  @scala.inline
  implicit class DescribeTrafficMirrorFiltersResultMutableBuilder[Self <: DescribeTrafficMirrorFiltersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilters(value: TrafficMirrorFilterSet): Self = StObject.set(x, "TrafficMirrorFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFiltersUndefined: Self = StObject.set(x, "TrafficMirrorFilters", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFiltersVarargs(value: TrafficMirrorFilter*): Self = StObject.set(x, "TrafficMirrorFilters", js.Array(value :_*))
  }
}
