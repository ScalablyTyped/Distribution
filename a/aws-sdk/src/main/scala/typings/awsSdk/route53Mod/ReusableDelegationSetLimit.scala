package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReusableDelegationSetLimit extends StObject {
  
  /**
    * The limit that you requested: MAX_ZONES_BY_REUSABLE_DELEGATION_SET, the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
  
  /**
    * The current value for the MAX_ZONES_BY_REUSABLE_DELEGATION_SET limit.
    */
  var Value: LimitValue = js.native
}
object ReusableDelegationSetLimit {
  
  @scala.inline
  def apply(Type: ReusableDelegationSetLimitType, Value: LimitValue): ReusableDelegationSetLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReusableDelegationSetLimit]
  }
  
  @scala.inline
  implicit class ReusableDelegationSetLimitMutableBuilder[Self <: ReusableDelegationSetLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ReusableDelegationSetLimitType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: LimitValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
