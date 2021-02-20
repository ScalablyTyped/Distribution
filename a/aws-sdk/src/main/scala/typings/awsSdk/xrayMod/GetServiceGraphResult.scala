package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceGraphResult extends StObject {
  
  /**
    * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may show traces from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.native
  
  /**
    * The end of the time frame for which the graph was generated.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The services that have processed a traced request during the specified time frame.
    */
  var Services: js.UndefOr[ServiceList] = js.native
  
  /**
    * The start of the time frame for which the graph was generated.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}
object GetServiceGraphResult {
  
  @scala.inline
  def apply(): GetServiceGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceGraphResult]
  }
  
  @scala.inline
  implicit class GetServiceGraphResultMutableBuilder[Self <: GetServiceGraphResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsOldGroupVersions(value: Boolean): Self = StObject.set(x, "ContainsOldGroupVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsOldGroupVersionsUndefined: Self = StObject.set(x, "ContainsOldGroupVersions", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServices(value: ServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: Service*): Self = StObject.set(x, "Services", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
