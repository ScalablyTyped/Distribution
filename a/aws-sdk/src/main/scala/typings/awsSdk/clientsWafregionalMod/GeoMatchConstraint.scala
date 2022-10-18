package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchConstraint extends StObject {
  
  /**
    * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
    */
  var Type: GeoMatchConstraintType
  
  /**
    * The country that you want AWS WAF to search for.
    */
  var Value: GeoMatchConstraintValue
}
object GeoMatchConstraint {
  
  inline def apply(Type: GeoMatchConstraintType, Value: GeoMatchConstraintValue): GeoMatchConstraint = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchConstraint]
  }
  
  extension [Self <: GeoMatchConstraint](x: Self) {
    
    inline def setType(value: GeoMatchConstraintType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: GeoMatchConstraintValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
