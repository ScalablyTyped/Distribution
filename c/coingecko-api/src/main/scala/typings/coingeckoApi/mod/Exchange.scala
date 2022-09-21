package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exchange extends StObject {
  
  var country: String
  
  var description: String
  
  var has_trading_incentive: Boolean
  
  var id: String
  
  var image: String
  
  var name: String
  
  var trade_volume_24h_btc: Double
  
  var trade_volume_24h_btc_normalized: Double
  
  var trust_score: Double
  
  var trust_score_rank: Double
  
  var url: String
  
  var year_established: Double
}
object Exchange {
  
  inline def apply(
    country: String,
    description: String,
    has_trading_incentive: Boolean,
    id: String,
    image: String,
    name: String,
    trade_volume_24h_btc: Double,
    trade_volume_24h_btc_normalized: Double,
    trust_score: Double,
    trust_score_rank: Double,
    url: String,
    year_established: Double
  ): Exchange = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_trading_incentive = has_trading_incentive.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trade_volume_24h_btc = trade_volume_24h_btc.asInstanceOf[js.Any], trade_volume_24h_btc_normalized = trade_volume_24h_btc_normalized.asInstanceOf[js.Any], trust_score = trust_score.asInstanceOf[js.Any], trust_score_rank = trust_score_rank.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], year_established = year_established.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exchange]
  }
  
  extension [Self <: Exchange](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHas_trading_incentive(value: Boolean): Self = StObject.set(x, "has_trading_incentive", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTrade_volume_24h_btc(value: Double): Self = StObject.set(x, "trade_volume_24h_btc", value.asInstanceOf[js.Any])
    
    inline def setTrade_volume_24h_btc_normalized(value: Double): Self = StObject.set(x, "trade_volume_24h_btc_normalized", value.asInstanceOf[js.Any])
    
    inline def setTrust_score(value: Double): Self = StObject.set(x, "trust_score", value.asInstanceOf[js.Any])
    
    inline def setTrust_score_rank(value: Double): Self = StObject.set(x, "trust_score_rank", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setYear_established(value: Double): Self = StObject.set(x, "year_established", value.asInstanceOf[js.Any])
  }
}
