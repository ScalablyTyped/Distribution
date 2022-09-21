package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputIdentifier extends StObject {
  
  /**
    *  The identifier of the input routed to AWS IoT Events. 
    */
  var iotEventsInputIdentifier: js.UndefOr[IotEventsInputIdentifier] = js.undefined
  
  /**
    *  The identifer of the input routed from AWS IoT SiteWise. 
    */
  var iotSiteWiseInputIdentifier: js.UndefOr[IotSiteWiseInputIdentifier] = js.undefined
}
object InputIdentifier {
  
  inline def apply(): InputIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputIdentifier]
  }
  
  extension [Self <: InputIdentifier](x: Self) {
    
    inline def setIotEventsInputIdentifier(value: IotEventsInputIdentifier): Self = StObject.set(x, "iotEventsInputIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIotEventsInputIdentifierUndefined: Self = StObject.set(x, "iotEventsInputIdentifier", js.undefined)
    
    inline def setIotSiteWiseInputIdentifier(value: IotSiteWiseInputIdentifier): Self = StObject.set(x, "iotSiteWiseInputIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseInputIdentifierUndefined: Self = StObject.set(x, "iotSiteWiseInputIdentifier", js.undefined)
  }
}
