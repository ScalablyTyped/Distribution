package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoMatchSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete a country with UpdateGeoMatchSet.
    */
  var Action: ChangeAction = js.native
  
  /**
    * The country from which web requests originate that you want AWS WAF to search for.
    */
  var GeoMatchConstraint: typings.awsSdk.wafMod.GeoMatchConstraint = js.native
}
object GeoMatchSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, GeoMatchConstraint: GeoMatchConstraint): GeoMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], GeoMatchConstraint = GeoMatchConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetUpdate]
  }
  
  @scala.inline
  implicit class GeoMatchSetUpdateMutableBuilder[Self <: GeoMatchSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchConstraint(value: GeoMatchConstraint): Self = StObject.set(x, "GeoMatchConstraint", value.asInstanceOf[js.Any])
  }
}
