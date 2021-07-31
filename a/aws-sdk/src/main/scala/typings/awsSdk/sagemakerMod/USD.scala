package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USD extends StObject {
  
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typings.awsSdk.sagemakerMod.Cents] = js.undefined
  
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typings.awsSdk.sagemakerMod.Dollars] = js.undefined
  
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typings.awsSdk.sagemakerMod.TenthFractionsOfACent] = js.undefined
}
object USD {
  
  @scala.inline
  def apply(): USD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USD]
  }
  
  @scala.inline
  implicit class USDMutableBuilder[Self <: USD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCents(value: Cents): Self = StObject.set(x, "Cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentsUndefined: Self = StObject.set(x, "Cents", js.undefined)
    
    @scala.inline
    def setDollars(value: Dollars): Self = StObject.set(x, "Dollars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarsUndefined: Self = StObject.set(x, "Dollars", js.undefined)
    
    @scala.inline
    def setTenthFractionsOfACent(value: TenthFractionsOfACent): Self = StObject.set(x, "TenthFractionsOfACent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenthFractionsOfACentUndefined: Self = StObject.set(x, "TenthFractionsOfACent", js.undefined)
  }
}
