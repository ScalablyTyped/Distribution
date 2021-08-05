package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingOptions extends StObject {
  
  /**
    * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
    */
  var CustomRedirectDomain: js.UndefOr[typings.awsSdk.sesMod.CustomRedirectDomain] = js.undefined
}
object TrackingOptions {
  
  inline def apply(): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingOptions]
  }
  
  extension [Self <: TrackingOptions](x: Self) {
    
    inline def setCustomRedirectDomain(value: CustomRedirectDomain): Self = StObject.set(x, "CustomRedirectDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomRedirectDomainUndefined: Self = StObject.set(x, "CustomRedirectDomain", js.undefined)
  }
}
