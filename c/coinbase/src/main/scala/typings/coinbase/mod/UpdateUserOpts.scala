package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserOpts extends StObject {
  
  /**
    * User’s name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Local currency used to display amounts converted from BTC
    */
  var native_currency: js.UndefOr[String] = js.undefined
  
  /**
    * Time zone
    */
  var time_zone: js.UndefOr[String] = js.undefined
}
object UpdateUserOpts {
  
  @scala.inline
  def apply(): UpdateUserOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserOpts]
  }
  
  @scala.inline
  implicit class UpdateUserOptsMutableBuilder[Self <: UpdateUserOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNative_currency(value: String): Self = StObject.set(x, "native_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative_currencyUndefined: Self = StObject.set(x, "native_currency", js.undefined)
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
