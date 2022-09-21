package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceContributorCount extends StObject {
  
  /**
    * Indicates whether the maximum count is reached.
    */
  var CapExceeded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of Amazon Web Services resources or Config rules responsible for the current compliance of the item.
    */
  var CappedCount: js.UndefOr[Integer] = js.undefined
}
object ComplianceContributorCount {
  
  inline def apply(): ComplianceContributorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceContributorCount]
  }
  
  extension [Self <: ComplianceContributorCount](x: Self) {
    
    inline def setCapExceeded(value: Boolean): Self = StObject.set(x, "CapExceeded", value.asInstanceOf[js.Any])
    
    inline def setCapExceededUndefined: Self = StObject.set(x, "CapExceeded", js.undefined)
    
    inline def setCappedCount(value: Integer): Self = StObject.set(x, "CappedCount", value.asInstanceOf[js.Any])
    
    inline def setCappedCountUndefined: Self = StObject.set(x, "CappedCount", js.undefined)
  }
}
