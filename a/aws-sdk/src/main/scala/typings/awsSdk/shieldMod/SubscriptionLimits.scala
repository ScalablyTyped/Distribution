package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionLimits extends StObject {
  
  /**
    * Limits settings on protection groups for your subscription. 
    */
  var ProtectionGroupLimits: typings.awsSdk.shieldMod.ProtectionGroupLimits = js.native
  
  /**
    * Limits settings on protections for your subscription. 
    */
  var ProtectionLimits: typings.awsSdk.shieldMod.ProtectionLimits = js.native
}
object SubscriptionLimits {
  
  @scala.inline
  def apply(ProtectionGroupLimits: ProtectionGroupLimits, ProtectionLimits: ProtectionLimits): SubscriptionLimits = {
    val __obj = js.Dynamic.literal(ProtectionGroupLimits = ProtectionGroupLimits.asInstanceOf[js.Any], ProtectionLimits = ProtectionLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionLimits]
  }
  
  @scala.inline
  implicit class SubscriptionLimitsMutableBuilder[Self <: SubscriptionLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionGroupLimits(value: ProtectionGroupLimits): Self = StObject.set(x, "ProtectionGroupLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLimits(value: ProtectionLimits): Self = StObject.set(x, "ProtectionLimits", value.asInstanceOf[js.Any])
  }
}
