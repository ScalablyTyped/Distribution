package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchHistoryParams extends StObject {
  
  /**
    * The date of data snapshot in dd-mm-yyyy eg. 30-12-2017
    */
  var date: String
  
  /**
    * Set to false to exclude localized languages in response
    * [default: true]
    */
  var localization: js.UndefOr[Boolean] = js.undefined
}
object CoinsFetchHistoryParams {
  
  inline def apply(date: String): CoinsFetchHistoryParams = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinsFetchHistoryParams]
  }
  
  extension [Self <: CoinsFetchHistoryParams](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLocalization(value: Boolean): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
  }
}
