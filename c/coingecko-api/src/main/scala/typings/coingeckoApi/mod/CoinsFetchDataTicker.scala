package typings.coingeckoApi.mod

import typings.coingeckoApi.anon.Eth
import typings.coingeckoApi.anon.Hastradingincentive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchDataTicker extends StObject {
  
  var base: String
  
  var bid_ask_spread_percentage: Double
  
  var coin_id: String
  
  var converted_last: Eth
  
  var converted_volume: Eth
  
  var is_anomaly: Boolean
  
  var is_stale: Boolean
  
  var last: Double
  
  var last_fetch_at: js.Date
  
  var last_traded_at: js.Date
  
  var market: Hastradingincentive
  
  var target: String
  
  var target_coin_id: String
  
  var timestamp: js.Date
  
  var token_info_url: String | Null
  
  var trade_url: String | Null
  
  var trust_score: TrustScore
  
  var volume: Double
}
object CoinsFetchDataTicker {
  
  inline def apply(
    base: String,
    bid_ask_spread_percentage: Double,
    coin_id: String,
    converted_last: Eth,
    converted_volume: Eth,
    is_anomaly: Boolean,
    is_stale: Boolean,
    last: Double,
    last_fetch_at: js.Date,
    last_traded_at: js.Date,
    market: Hastradingincentive,
    target: String,
    target_coin_id: String,
    timestamp: js.Date,
    trust_score: TrustScore,
    volume: Double
  ): CoinsFetchDataTicker = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bid_ask_spread_percentage = bid_ask_spread_percentage.asInstanceOf[js.Any], coin_id = coin_id.asInstanceOf[js.Any], converted_last = converted_last.asInstanceOf[js.Any], converted_volume = converted_volume.asInstanceOf[js.Any], is_anomaly = is_anomaly.asInstanceOf[js.Any], is_stale = is_stale.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], last_fetch_at = last_fetch_at.asInstanceOf[js.Any], last_traded_at = last_traded_at.asInstanceOf[js.Any], market = market.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], target_coin_id = target_coin_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trust_score = trust_score.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], token_info_url = null, trade_url = null)
    __obj.asInstanceOf[CoinsFetchDataTicker]
  }
  
  extension [Self <: CoinsFetchDataTicker](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBid_ask_spread_percentage(value: Double): Self = StObject.set(x, "bid_ask_spread_percentage", value.asInstanceOf[js.Any])
    
    inline def setCoin_id(value: String): Self = StObject.set(x, "coin_id", value.asInstanceOf[js.Any])
    
    inline def setConverted_last(value: Eth): Self = StObject.set(x, "converted_last", value.asInstanceOf[js.Any])
    
    inline def setConverted_volume(value: Eth): Self = StObject.set(x, "converted_volume", value.asInstanceOf[js.Any])
    
    inline def setIs_anomaly(value: Boolean): Self = StObject.set(x, "is_anomaly", value.asInstanceOf[js.Any])
    
    inline def setIs_stale(value: Boolean): Self = StObject.set(x, "is_stale", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLast_fetch_at(value: js.Date): Self = StObject.set(x, "last_fetch_at", value.asInstanceOf[js.Any])
    
    inline def setLast_traded_at(value: js.Date): Self = StObject.set(x, "last_traded_at", value.asInstanceOf[js.Any])
    
    inline def setMarket(value: Hastradingincentive): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTarget_coin_id(value: String): Self = StObject.set(x, "target_coin_id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setToken_info_url(value: String): Self = StObject.set(x, "token_info_url", value.asInstanceOf[js.Any])
    
    inline def setToken_info_urlNull: Self = StObject.set(x, "token_info_url", null)
    
    inline def setTrade_url(value: String): Self = StObject.set(x, "trade_url", value.asInstanceOf[js.Any])
    
    inline def setTrade_urlNull: Self = StObject.set(x, "trade_url", null)
    
    inline def setTrust_score(value: TrustScore): Self = StObject.set(x, "trust_score", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
