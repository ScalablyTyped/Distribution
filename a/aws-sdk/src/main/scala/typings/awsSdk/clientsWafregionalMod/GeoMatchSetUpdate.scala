package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete a country with UpdateGeoMatchSet.
    */
  var Action: ChangeAction
  
  /**
    * The country from which web requests originate that you want AWS WAF to search for.
    */
  var GeoMatchConstraint: typings.awsSdk.clientsWafregionalMod.GeoMatchConstraint
}
object GeoMatchSetUpdate {
  
  inline def apply(Action: ChangeAction, GeoMatchConstraint: GeoMatchConstraint): GeoMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], GeoMatchConstraint = GeoMatchConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetUpdate]
  }
  
  extension [Self <: GeoMatchSetUpdate](x: Self) {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchConstraint(value: GeoMatchConstraint): Self = StObject.set(x, "GeoMatchConstraint", value.asInstanceOf[js.Any])
  }
}
