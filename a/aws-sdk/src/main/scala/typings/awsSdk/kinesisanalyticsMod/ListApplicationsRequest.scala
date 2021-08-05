package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsRequest extends StObject {
  
  /**
    * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to specify this parameter in the first request. However, in subsequent requests, you add the last application name from the previous response to get the next page of applications.
    */
  var ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * Maximum number of applications to list.
    */
  var Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined
}
object ListApplicationsRequest {
  
  inline def apply(): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsRequest]
  }
  
  extension [Self <: ListApplicationsRequest](x: Self) {
    
    inline def setExclusiveStartApplicationName(value: ApplicationName): Self = StObject.set(x, "ExclusiveStartApplicationName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartApplicationNameUndefined: Self = StObject.set(x, "ExclusiveStartApplicationName", js.undefined)
    
    inline def setLimit(value: ListApplicationsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
