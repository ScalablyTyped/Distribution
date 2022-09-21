package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationComponentSummary extends StObject {
  
  /**
    *  Contains the name of application types. 
    */
  var appType: js.UndefOr[AppType] = js.undefined
  
  /**
    *  Contains the count of application type. 
    */
  var count: js.UndefOr[Integer] = js.undefined
}
object ApplicationComponentSummary {
  
  inline def apply(): ApplicationComponentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponentSummary]
  }
  
  extension [Self <: ApplicationComponentSummary](x: Self) {
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    inline def setCount(value: Integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
