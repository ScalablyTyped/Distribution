package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighPriority
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Average response time for the high priority tier
    */
  var highPriority: Dictk
  
  /**
    * Average response time for the large payload tier
    */
  var largePayload: Dictk
  
  /**
    * Average response time for the large payload tier.  Mandatory for data holders designated for a Shared Responsibility Data Request data cluster
    */
  var largeSecondary: js.UndefOr[Primary | Null] = js.undefined
  
  /**
    * Average response time for the low priority tier
    */
  var lowPriority: Dictk
  
  /**
    * Average response time for the secondary tier.  Mandatory for data holders designated for a Shared Responsibility Data Request data cluster
    */
  var secondary: js.UndefOr[Primary | Null] = js.undefined
  
  /**
    * Average response time for the unattended tier
    */
  var unattended: Dictk
  
  /**
    * Average response time for the unauthenticated tier
    */
  var unauthenticated: Dictk
}
object HighPriority {
  
  inline def apply(
    highPriority: Dictk,
    largePayload: Dictk,
    lowPriority: Dictk,
    unattended: Dictk,
    unauthenticated: Dictk
  ): HighPriority = {
    val __obj = js.Dynamic.literal(highPriority = highPriority.asInstanceOf[js.Any], largePayload = largePayload.asInstanceOf[js.Any], lowPriority = lowPriority.asInstanceOf[js.Any], unattended = unattended.asInstanceOf[js.Any], unauthenticated = unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighPriority]
  }
  
  extension [Self <: HighPriority](x: Self) {
    
    inline def setHighPriority(value: Dictk): Self = StObject.set(x, "highPriority", value.asInstanceOf[js.Any])
    
    inline def setLargePayload(value: Dictk): Self = StObject.set(x, "largePayload", value.asInstanceOf[js.Any])
    
    inline def setLargeSecondary(value: Primary): Self = StObject.set(x, "largeSecondary", value.asInstanceOf[js.Any])
    
    inline def setLargeSecondaryNull: Self = StObject.set(x, "largeSecondary", null)
    
    inline def setLargeSecondaryUndefined: Self = StObject.set(x, "largeSecondary", js.undefined)
    
    inline def setLowPriority(value: Dictk): Self = StObject.set(x, "lowPriority", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: Primary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryNull: Self = StObject.set(x, "secondary", null)
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setUnattended(value: Dictk): Self = StObject.set(x, "unattended", value.asInstanceOf[js.Any])
    
    inline def setUnauthenticated(value: Dictk): Self = StObject.set(x, "unauthenticated", value.asInstanceOf[js.Any])
  }
}
