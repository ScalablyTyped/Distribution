package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coins
  */
trait CoinsAllParams extends StObject {
  
  /**
    * Set to false to exclude localized languages in response.
    */
  // tslint:disable-next-line no-redundant-undefined
  var localization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Order results by Order
    */
  // tslint:disable-next-line no-redundant-undefined
  var order: js.UndefOr[Order] = js.undefined
  
  /**
    * Page through results
    */
  // tslint:disable-next-line no-redundant-undefined
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Total results per page
    */
  // tslint:disable-next-line no-redundant-undefined
  var per_page: js.UndefOr[Double] = js.undefined
  
  /**
    * Include sparkline 7 days data
    */
  // tslint:disable-next-line no-redundant-undefined
  var sparkline: js.UndefOr[Boolean] = js.undefined
}
object CoinsAllParams {
  
  inline def apply(): CoinsAllParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoinsAllParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinsAllParams] (val x: Self) extends AnyVal {
    
    inline def setLocalization(value: Boolean): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSparkline(value: Boolean): Self = StObject.set(x, "sparkline", value.asInstanceOf[js.Any])
    
    inline def setSparklineUndefined: Self = StObject.set(x, "sparkline", js.undefined)
  }
}
