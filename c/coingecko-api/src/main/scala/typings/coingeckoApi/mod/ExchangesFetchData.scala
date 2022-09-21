package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangesFetchData
  extends StObject
     with Exchange {
  
  var alert_notice: String
  
  var centralized: Boolean
  
  var facebook_url: String
  
  var other_url_1: String
  
  var other_url_2: String
  
  var public_notice: String
  
  var reddit_url: String
  
  var slack_url: String
  
  var status_updates: js.Array[Any]
  
  var telegram_url: String
  
  var tickers: js.Array[Any]
  
  var twitter_handle: String
}
object ExchangesFetchData {
  
  inline def apply(
    alert_notice: String,
    centralized: Boolean,
    country: String,
    description: String,
    facebook_url: String,
    has_trading_incentive: Boolean,
    id: String,
    image: String,
    name: String,
    other_url_1: String,
    other_url_2: String,
    public_notice: String,
    reddit_url: String,
    slack_url: String,
    status_updates: js.Array[Any],
    telegram_url: String,
    tickers: js.Array[Any],
    trade_volume_24h_btc: Double,
    trade_volume_24h_btc_normalized: Double,
    trust_score: Double,
    trust_score_rank: Double,
    twitter_handle: String,
    url: String,
    year_established: Double
  ): ExchangesFetchData = {
    val __obj = js.Dynamic.literal(alert_notice = alert_notice.asInstanceOf[js.Any], centralized = centralized.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], facebook_url = facebook_url.asInstanceOf[js.Any], has_trading_incentive = has_trading_incentive.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], other_url_1 = other_url_1.asInstanceOf[js.Any], other_url_2 = other_url_2.asInstanceOf[js.Any], public_notice = public_notice.asInstanceOf[js.Any], reddit_url = reddit_url.asInstanceOf[js.Any], slack_url = slack_url.asInstanceOf[js.Any], status_updates = status_updates.asInstanceOf[js.Any], telegram_url = telegram_url.asInstanceOf[js.Any], tickers = tickers.asInstanceOf[js.Any], trade_volume_24h_btc = trade_volume_24h_btc.asInstanceOf[js.Any], trade_volume_24h_btc_normalized = trade_volume_24h_btc_normalized.asInstanceOf[js.Any], trust_score = trust_score.asInstanceOf[js.Any], trust_score_rank = trust_score_rank.asInstanceOf[js.Any], twitter_handle = twitter_handle.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], year_established = year_established.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangesFetchData]
  }
  
  extension [Self <: ExchangesFetchData](x: Self) {
    
    inline def setAlert_notice(value: String): Self = StObject.set(x, "alert_notice", value.asInstanceOf[js.Any])
    
    inline def setCentralized(value: Boolean): Self = StObject.set(x, "centralized", value.asInstanceOf[js.Any])
    
    inline def setFacebook_url(value: String): Self = StObject.set(x, "facebook_url", value.asInstanceOf[js.Any])
    
    inline def setOther_url_1(value: String): Self = StObject.set(x, "other_url_1", value.asInstanceOf[js.Any])
    
    inline def setOther_url_2(value: String): Self = StObject.set(x, "other_url_2", value.asInstanceOf[js.Any])
    
    inline def setPublic_notice(value: String): Self = StObject.set(x, "public_notice", value.asInstanceOf[js.Any])
    
    inline def setReddit_url(value: String): Self = StObject.set(x, "reddit_url", value.asInstanceOf[js.Any])
    
    inline def setSlack_url(value: String): Self = StObject.set(x, "slack_url", value.asInstanceOf[js.Any])
    
    inline def setStatus_updates(value: js.Array[Any]): Self = StObject.set(x, "status_updates", value.asInstanceOf[js.Any])
    
    inline def setStatus_updatesVarargs(value: Any*): Self = StObject.set(x, "status_updates", js.Array(value*))
    
    inline def setTelegram_url(value: String): Self = StObject.set(x, "telegram_url", value.asInstanceOf[js.Any])
    
    inline def setTickers(value: js.Array[Any]): Self = StObject.set(x, "tickers", value.asInstanceOf[js.Any])
    
    inline def setTickersVarargs(value: Any*): Self = StObject.set(x, "tickers", js.Array(value*))
    
    inline def setTwitter_handle(value: String): Self = StObject.set(x, "twitter_handle", value.asInstanceOf[js.Any])
  }
}
