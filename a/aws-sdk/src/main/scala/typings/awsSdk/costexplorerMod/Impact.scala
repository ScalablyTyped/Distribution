package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impact extends StObject {
  
  /**
    *  The maximum dollar value observed for an anomaly. 
    */
  var MaxImpact: GenericDouble = js.native
  
  /**
    *  The cumulative dollar value observed for an anomaly. 
    */
  var TotalImpact: js.UndefOr[GenericDouble] = js.native
}
object Impact {
  
  @scala.inline
  def apply(MaxImpact: GenericDouble): Impact = {
    val __obj = js.Dynamic.literal(MaxImpact = MaxImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impact]
  }
  
  @scala.inline
  implicit class ImpactMutableBuilder[Self <: Impact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxImpact(value: GenericDouble): Self = StObject.set(x, "MaxImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalImpact(value: GenericDouble): Self = StObject.set(x, "TotalImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalImpactUndefined: Self = StObject.set(x, "TotalImpact", js.undefined)
  }
}
