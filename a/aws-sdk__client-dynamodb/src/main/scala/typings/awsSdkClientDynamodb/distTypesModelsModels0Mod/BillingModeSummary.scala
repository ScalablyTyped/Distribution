package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingModeSummary extends StObject {
  
  /**
    * <p>Controls how you are charged for read and write throughput and how you manage
    *             capacity. This setting can be changed later.</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>PROVISIONED</code> - Sets the read/write capacity mode to
    *                         <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
    *                     predictable workloads.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
    *                         <code>PAY_PER_REQUEST</code>. We recommend using
    *                         <code>PAY_PER_REQUEST</code> for unpredictable workloads. </p>
    *             </li>
    *          </ul>
    */
  var BillingMode: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BillingMode | String] = js.undefined
  
  /**
    * <p>Represents the time when <code>PAY_PER_REQUEST</code> was last set as the read/write
    *             capacity mode.</p>
    */
  var LastUpdateToPayPerRequestDateTime: js.UndefOr[js.Date] = js.undefined
}
object BillingModeSummary {
  
  inline def apply(): BillingModeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingModeSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingModeSummary] (val x: Self) extends AnyVal {
    
    inline def setBillingMode(value: BillingMode | String): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setLastUpdateToPayPerRequestDateTime(value: js.Date): Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateToPayPerRequestDateTimeUndefined: Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", js.undefined)
  }
}
