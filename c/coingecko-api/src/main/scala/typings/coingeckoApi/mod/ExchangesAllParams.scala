package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exchanges
  */
trait ExchangesAllParams extends StObject {
  
  /**
    * Page through results
    */
  // tslint:disable-next-line no-redundant-undefined
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Total results per page
    * [default: 100]
    */
  // tslint:disable-next-line no-redundant-undefined
  var per_page: js.UndefOr[Double] = js.undefined
}
object ExchangesAllParams {
  
  inline def apply(): ExchangesAllParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangesAllParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangesAllParams] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
