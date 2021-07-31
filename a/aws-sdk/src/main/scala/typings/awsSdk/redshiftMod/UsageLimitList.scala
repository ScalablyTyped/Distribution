package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageLimitList extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the output from the DescribeUsageLimits action. 
    */
  var UsageLimits: js.UndefOr[typings.awsSdk.redshiftMod.UsageLimits] = js.undefined
}
object UsageLimitList {
  
  @scala.inline
  def apply(): UsageLimitList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageLimitList]
  }
  
  @scala.inline
  implicit class UsageLimitListMutableBuilder[Self <: UsageLimitList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setUsageLimits(value: UsageLimits): Self = StObject.set(x, "UsageLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageLimitsUndefined: Self = StObject.set(x, "UsageLimits", js.undefined)
    
    @scala.inline
    def setUsageLimitsVarargs(value: UsageLimit*): Self = StObject.set(x, "UsageLimits", js.Array(value :_*))
  }
}
