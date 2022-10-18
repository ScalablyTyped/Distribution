package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceGraphResult extends StObject {
  
  /**
    * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may show traces from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The end of the time frame for which the graph was generated.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The services that have processed a traced request during the specified time frame.
    */
  var Services: js.UndefOr[ServiceList] = js.undefined
  
  /**
    * The start of the time frame for which the graph was generated.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object GetServiceGraphResult {
  
  inline def apply(): GetServiceGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceGraphResult]
  }
  
  extension [Self <: GetServiceGraphResult](x: Self) {
    
    inline def setContainsOldGroupVersions(value: Boolean): Self = StObject.set(x, "ContainsOldGroupVersions", value.asInstanceOf[js.Any])
    
    inline def setContainsOldGroupVersionsUndefined: Self = StObject.set(x, "ContainsOldGroupVersions", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServices(value: ServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "Services", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
