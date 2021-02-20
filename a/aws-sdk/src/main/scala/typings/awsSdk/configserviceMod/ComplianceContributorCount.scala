package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceContributorCount extends StObject {
  
  /**
    * Indicates whether the maximum count is reached.
    */
  var CapExceeded: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
    */
  var CappedCount: js.UndefOr[Integer] = js.native
}
object ComplianceContributorCount {
  
  @scala.inline
  def apply(): ComplianceContributorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceContributorCount]
  }
  
  @scala.inline
  implicit class ComplianceContributorCountMutableBuilder[Self <: ComplianceContributorCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapExceeded(value: Boolean): Self = StObject.set(x, "CapExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapExceededUndefined: Self = StObject.set(x, "CapExceeded", js.undefined)
    
    @scala.inline
    def setCappedCount(value: Integer): Self = StObject.set(x, "CappedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCappedCountUndefined: Self = StObject.set(x, "CappedCount", js.undefined)
  }
}
