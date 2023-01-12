package typings.coingeckoApi.mod

import typings.coingeckoApi.anon.Alexarank
import typings.coingeckoApi.anon.Closedissues
import typings.coingeckoApi.anon.Currentprice
import typings.coingeckoApi.anon.Facebooklikes
import typings.coingeckoApi.anon.Small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchHistoryData extends StObject {
  
  var community_data: Facebooklikes
  
  var developer_data: Closedissues
  
  var id: String
  
  var image: Small
  
  var localization: Localization
  
  var market_data: Currentprice
  
  var name: String
  
  var public_interest_stats: Alexarank
  
  var symbol: String
}
object CoinsFetchHistoryData {
  
  inline def apply(
    community_data: Facebooklikes,
    developer_data: Closedissues,
    id: String,
    image: Small,
    localization: Localization,
    market_data: Currentprice,
    name: String,
    public_interest_stats: Alexarank,
    symbol: String
  ): CoinsFetchHistoryData = {
    val __obj = js.Dynamic.literal(community_data = community_data.asInstanceOf[js.Any], developer_data = developer_data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], localization = localization.asInstanceOf[js.Any], market_data = market_data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_interest_stats = public_interest_stats.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinsFetchHistoryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinsFetchHistoryData] (val x: Self) extends AnyVal {
    
    inline def setCommunity_data(value: Facebooklikes): Self = StObject.set(x, "community_data", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_data(value: Closedissues): Self = StObject.set(x, "developer_data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Small): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setLocalization(value: Localization): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setMarket_data(value: Currentprice): Self = StObject.set(x, "market_data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublic_interest_stats(value: Alexarank): Self = StObject.set(x, "public_interest_stats", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
