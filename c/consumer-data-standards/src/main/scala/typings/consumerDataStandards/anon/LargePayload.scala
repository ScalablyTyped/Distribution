package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargePayload
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * API call counts for the high priority tier
    */
  var highPriority: Dictk
  
  /**
    * API call counts for the large payload tier
    */
  var largePayload: Dictk
  
  /**
    * API call counts for the large Shared Responsibility Data Requests tier.  Mandatory for data holders designated for a Shared Responsibility Data Request data cluster
    */
  var largeSecondary: js.UndefOr[Dictk | Null] = js.undefined
  
  /**
    * API call counts for the low priority tier
    */
  var lowPriority: Dictk
  
  /**
    * API call counts for the Shared Responsibility Data Requests tier.  Mandatory for data holders designated for a Shared Responsibility Data Request data cluster
    */
  var secondary: js.UndefOr[Dictk | Null] = js.undefined
  
  /**
    * API call counts for the unattended tier
    */
  var unattended: Dictk
  
  /**
    * API call counts for the unauthenticated tier
    */
  var unauthenticated: Dictk
}
object LargePayload {
  
  inline def apply(
    highPriority: Dictk,
    largePayload: Dictk,
    lowPriority: Dictk,
    unattended: Dictk,
    unauthenticated: Dictk
  ): LargePayload = {
    val __obj = js.Dynamic.literal(highPriority = highPriority.asInstanceOf[js.Any], largePayload = largePayload.asInstanceOf[js.Any], lowPriority = lowPriority.asInstanceOf[js.Any], unattended = unattended.asInstanceOf[js.Any], unauthenticated = unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargePayload] (val x: Self) extends AnyVal {
    
    inline def setHighPriority(value: Dictk): Self = StObject.set(x, "highPriority", value.asInstanceOf[js.Any])
    
    inline def setLargePayload(value: Dictk): Self = StObject.set(x, "largePayload", value.asInstanceOf[js.Any])
    
    inline def setLargeSecondary(value: Dictk): Self = StObject.set(x, "largeSecondary", value.asInstanceOf[js.Any])
    
    inline def setLargeSecondaryNull: Self = StObject.set(x, "largeSecondary", null)
    
    inline def setLargeSecondaryUndefined: Self = StObject.set(x, "largeSecondary", js.undefined)
    
    inline def setLowPriority(value: Dictk): Self = StObject.set(x, "lowPriority", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: Dictk): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryNull: Self = StObject.set(x, "secondary", null)
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setUnattended(value: Dictk): Self = StObject.set(x, "unattended", value.asInstanceOf[js.Any])
    
    inline def setUnauthenticated(value: Dictk): Self = StObject.set(x, "unauthenticated", value.asInstanceOf[js.Any])
  }
}
