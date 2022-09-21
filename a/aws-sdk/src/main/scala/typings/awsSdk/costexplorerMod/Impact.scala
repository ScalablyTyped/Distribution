package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impact extends StObject {
  
  /**
    * The maximum dollar value that's observed for an anomaly. 
    */
  var MaxImpact: GenericDouble
  
  /**
    * The cumulative dollar value that's observed for an anomaly. 
    */
  var TotalImpact: js.UndefOr[GenericDouble] = js.undefined
}
object Impact {
  
  inline def apply(MaxImpact: GenericDouble): Impact = {
    val __obj = js.Dynamic.literal(MaxImpact = MaxImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impact]
  }
  
  extension [Self <: Impact](x: Self) {
    
    inline def setMaxImpact(value: GenericDouble): Self = StObject.set(x, "MaxImpact", value.asInstanceOf[js.Any])
    
    inline def setTotalImpact(value: GenericDouble): Self = StObject.set(x, "TotalImpact", value.asInstanceOf[js.Any])
    
    inline def setTotalImpactUndefined: Self = StObject.set(x, "TotalImpact", js.undefined)
  }
}
