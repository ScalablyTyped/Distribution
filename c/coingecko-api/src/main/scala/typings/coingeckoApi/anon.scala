package typings.coingeckoApi

import typings.coingeckoApi.mod.CoinsAllParams
import typings.coingeckoApi.mod.CoinsFetchData
import typings.coingeckoApi.mod.CoinsFetchHistoryData
import typings.coingeckoApi.mod.CoinsFetchHistoryParams
import typings.coingeckoApi.mod.CoinsFetchMarketChart
import typings.coingeckoApi.mod.CoinsFetchMarketChartParams
import typings.coingeckoApi.mod.CoinsFetchMarketChartRangeParams
import typings.coingeckoApi.mod.CoinsFetchParams
import typings.coingeckoApi.mod.Currency
import typings.coingeckoApi.mod.Exchange
import typings.coingeckoApi.mod.ExchangesAllParams
import typings.coingeckoApi.mod.ExchangesFetchData
import typings.coingeckoApi.mod.Response
import typings.coingeckoApi.mod.SimplePriceParams
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Additions extends StObject {
    
    var additions: Double
    
    var deletions: Double
  }
  object Additions {
    
    inline def apply(additions: Double, deletions: Double): Additions = {
      val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Additions]
    }
    
    extension [Self <: Additions](x: Self) {
      
      inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
      
      inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Alexarank extends StObject {
    
    var alexa_rank: Double
    
    var bing_matches: Null
  }
  object Alexarank {
    
    inline def apply(alexa_rank: Double, bing_matches: Null): Alexarank = {
      val __obj = js.Dynamic.literal(alexa_rank = alexa_rank.asInstanceOf[js.Any], bing_matches = bing_matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alexarank]
    }
    
    extension [Self <: Alexarank](x: Self) {
      
      inline def setAlexa_rank(value: Double): Self = StObject.set(x, "alexa_rank", value.asInstanceOf[js.Any])
      
      inline def setBing_matches(value: Null): Self = StObject.set(x, "bing_matches", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait All extends StObject {
    
    /**
      * List all coins with data (name, price, market, developer, community, etc) - paginated by 50
      * @param params - Parameters to pass through to the request
      */
    def all(): js.Promise[Response[Any]] = js.native
    def all(params: CoinsAllParams): js.Promise[Response[Any]] = js.native
    
    /**
      * Get current data (name, price, market, … including exchange tickers) for a coin.
      * @param coinId - (Required) The coin id (can be obtained from coins.all()) eg. bitcoin
      * @param params - Parameters to pass through to the request
      */
    def fetch(coinId: String, params: CoinsFetchParams): js.Promise[Response[CoinsFetchData]] = js.native
    
    /**
      * Get historical data (name, price, market, stats) at a given date for a coin
      * @param coinId - (Required) The coin id (can be obtained from coins.all()) eg. bitcoin
      * @param params - Parameters to pass through to the request
      */
    def fetchHistory(coinId: String, params: CoinsFetchHistoryParams): js.Promise[Response[CoinsFetchHistoryData]] = js.native
    
    /**
      * Get historical market data include price, market cap, and 24h volume (granularity auto).
      * @param coinId - The coin id (can be obtained from coins.list()) eg. bitcoin.
      * @param params - Parameters to pass through to the request.
      */
    def fetchMarketChart(coinId: String, params: CoinsFetchMarketChartParams): js.Promise[Response[CoinsFetchMarketChart]] = js.native
    
    /**
      * Get historical market data include price, market cap, and 24h volume within a range of timestamp (granularity auto).
      * Minutely data will be used for duration within 1 day.
      * Hourly data will be used for duration between 1 day and 90 days.
      * Daily data will be used for duration above 90 days.
      * @param coinId - The coin id (can be obtained from coins.list()) eg. bitcoin.
      * @param params - Parameters to pass through to the request.
      */
    def fetchMarketChartRange(coinId: String, params: CoinsFetchMarketChartRangeParams): js.Promise[Response[Any]] = js.native
  }
  
  trait Btc extends StObject {
    
    var btc: Double
    
    var usd: Double
  }
  object Btc {
    
    inline def apply(btc: Double, usd: Double): Btc = {
      val __obj = js.Dynamic.literal(btc = btc.asInstanceOf[js.Any], usd = usd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Btc]
    }
    
    extension [Self <: Btc](x: Self) {
      
      inline def setBtc(value: Double): Self = StObject.set(x, "btc", value.asInstanceOf[js.Any])
      
      inline def setUsd(value: Double): Self = StObject.set(x, "usd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Circulatingsupply extends StObject {
    
    var circulating_supply: Double
    
    var current_price: Record[Currency & String, Double]
    
    var fdv_to_tvl_ratio: Double
    
    var fully_diluted_valuation: Record[Currency & String, Double]
    
    var market_cap: Record[Currency & String, Double]
    
    var max_supply: Double
    
    var mcap_to_tvl_ratio: Double
    
    var total_supply: Double
    
    var total_value_locked: Btc
    
    var total_volume: Record[Currency & String, Double]
  }
  object Circulatingsupply {
    
    inline def apply(
      circulating_supply: Double,
      current_price: Record[Currency & String, Double],
      fdv_to_tvl_ratio: Double,
      fully_diluted_valuation: Record[Currency & String, Double],
      market_cap: Record[Currency & String, Double],
      max_supply: Double,
      mcap_to_tvl_ratio: Double,
      total_supply: Double,
      total_value_locked: Btc,
      total_volume: Record[Currency & String, Double]
    ): Circulatingsupply = {
      val __obj = js.Dynamic.literal(circulating_supply = circulating_supply.asInstanceOf[js.Any], current_price = current_price.asInstanceOf[js.Any], fdv_to_tvl_ratio = fdv_to_tvl_ratio.asInstanceOf[js.Any], fully_diluted_valuation = fully_diluted_valuation.asInstanceOf[js.Any], market_cap = market_cap.asInstanceOf[js.Any], max_supply = max_supply.asInstanceOf[js.Any], mcap_to_tvl_ratio = mcap_to_tvl_ratio.asInstanceOf[js.Any], total_supply = total_supply.asInstanceOf[js.Any], total_value_locked = total_value_locked.asInstanceOf[js.Any], total_volume = total_volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circulatingsupply]
    }
    
    extension [Self <: Circulatingsupply](x: Self) {
      
      inline def setCirculating_supply(value: Double): Self = StObject.set(x, "circulating_supply", value.asInstanceOf[js.Any])
      
      inline def setCurrent_price(value: Record[Currency & String, Double]): Self = StObject.set(x, "current_price", value.asInstanceOf[js.Any])
      
      inline def setFdv_to_tvl_ratio(value: Double): Self = StObject.set(x, "fdv_to_tvl_ratio", value.asInstanceOf[js.Any])
      
      inline def setFully_diluted_valuation(value: Record[Currency & String, Double]): Self = StObject.set(x, "fully_diluted_valuation", value.asInstanceOf[js.Any])
      
      inline def setMarket_cap(value: Record[Currency & String, Double]): Self = StObject.set(x, "market_cap", value.asInstanceOf[js.Any])
      
      inline def setMax_supply(value: Double): Self = StObject.set(x, "max_supply", value.asInstanceOf[js.Any])
      
      inline def setMcap_to_tvl_ratio(value: Double): Self = StObject.set(x, "mcap_to_tvl_ratio", value.asInstanceOf[js.Any])
      
      inline def setTotal_supply(value: Double): Self = StObject.set(x, "total_supply", value.asInstanceOf[js.Any])
      
      inline def setTotal_value_locked(value: Btc): Self = StObject.set(x, "total_value_locked", value.asInstanceOf[js.Any])
      
      inline def setTotal_volume(value: Record[Currency & String, Double]): Self = StObject.set(x, "total_volume", value.asInstanceOf[js.Any])
    }
  }
  
  trait Closedissues extends StObject {
    
    var closed_issues: Double
    
    var code_additions_deletions_4_weeks: Additions
    
    var commit_count_4_weeks: Double
    
    var forks: Double
    
    var pull_request_contributors: Double
    
    var pull_requests_merged: Double
    
    var stars: Double
    
    var subscribers: Double
    
    var total_issues: Double
  }
  object Closedissues {
    
    inline def apply(
      closed_issues: Double,
      code_additions_deletions_4_weeks: Additions,
      commit_count_4_weeks: Double,
      forks: Double,
      pull_request_contributors: Double,
      pull_requests_merged: Double,
      stars: Double,
      subscribers: Double,
      total_issues: Double
    ): Closedissues = {
      val __obj = js.Dynamic.literal(closed_issues = closed_issues.asInstanceOf[js.Any], code_additions_deletions_4_weeks = code_additions_deletions_4_weeks.asInstanceOf[js.Any], commit_count_4_weeks = commit_count_4_weeks.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], pull_request_contributors = pull_request_contributors.asInstanceOf[js.Any], pull_requests_merged = pull_requests_merged.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], subscribers = subscribers.asInstanceOf[js.Any], total_issues = total_issues.asInstanceOf[js.Any])
      __obj.asInstanceOf[Closedissues]
    }
    
    extension [Self <: Closedissues](x: Self) {
      
      inline def setClosed_issues(value: Double): Self = StObject.set(x, "closed_issues", value.asInstanceOf[js.Any])
      
      inline def setCode_additions_deletions_4_weeks(value: Additions): Self = StObject.set(x, "code_additions_deletions_4_weeks", value.asInstanceOf[js.Any])
      
      inline def setCommit_count_4_weeks(value: Double): Self = StObject.set(x, "commit_count_4_weeks", value.asInstanceOf[js.Any])
      
      inline def setForks(value: Double): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
      
      inline def setPull_request_contributors(value: Double): Self = StObject.set(x, "pull_request_contributors", value.asInstanceOf[js.Any])
      
      inline def setPull_requests_merged(value: Double): Self = StObject.set(x, "pull_requests_merged", value.asInstanceOf[js.Any])
      
      inline def setStars(value: Double): Self = StObject.set(x, "stars", value.asInstanceOf[js.Any])
      
      inline def setSubscribers(value: Double): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      inline def setTotal_issues(value: Double): Self = StObject.set(x, "total_issues", value.asInstanceOf[js.Any])
    }
  }
  
  trait Currentprice extends StObject {
    
    var current_price: Record[Currency & String, Double]
    
    var market_cap: Record[Currency & String, Double]
    
    var total_volume: Record[Currency & String, Double]
  }
  object Currentprice {
    
    inline def apply(
      current_price: Record[Currency & String, Double],
      market_cap: Record[Currency & String, Double],
      total_volume: Record[Currency & String, Double]
    ): Currentprice = {
      val __obj = js.Dynamic.literal(current_price = current_price.asInstanceOf[js.Any], market_cap = market_cap.asInstanceOf[js.Any], total_volume = total_volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currentprice]
    }
    
    extension [Self <: Currentprice](x: Self) {
      
      inline def setCurrent_price(value: Record[Currency & String, Double]): Self = StObject.set(x, "current_price", value.asInstanceOf[js.Any])
      
      inline def setMarket_cap(value: Record[Currency & String, Double]): Self = StObject.set(x, "market_cap", value.asInstanceOf[js.Any])
      
      inline def setTotal_volume(value: Record[Currency & String, Double]): Self = StObject.set(x, "total_volume", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eth extends StObject {
    
    var btc: Double
    
    var eth: Double
    
    var usd: Double
  }
  object Eth {
    
    inline def apply(btc: Double, eth: Double, usd: Double): Eth = {
      val __obj = js.Dynamic.literal(btc = btc.asInstanceOf[js.Any], eth = eth.asInstanceOf[js.Any], usd = usd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eth]
    }
    
    extension [Self <: Eth](x: Self) {
      
      inline def setBtc(value: Double): Self = StObject.set(x, "btc", value.asInstanceOf[js.Any])
      
      inline def setEth(value: Double): Self = StObject.set(x, "eth", value.asInstanceOf[js.Any])
      
      inline def setUsd(value: Double): Self = StObject.set(x, "usd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Facebooklikes extends StObject {
    
    var facebook_likes: Null | Double
    
    var reddit_accounts_active_48h: String
    
    var reddit_average_comments_48h: Double
    
    var reddit_average_posts_48h: Double
    
    var reddit_subscribers: Double
    
    var twitter_followers: Double
  }
  object Facebooklikes {
    
    inline def apply(
      reddit_accounts_active_48h: String,
      reddit_average_comments_48h: Double,
      reddit_average_posts_48h: Double,
      reddit_subscribers: Double,
      twitter_followers: Double
    ): Facebooklikes = {
      val __obj = js.Dynamic.literal(reddit_accounts_active_48h = reddit_accounts_active_48h.asInstanceOf[js.Any], reddit_average_comments_48h = reddit_average_comments_48h.asInstanceOf[js.Any], reddit_average_posts_48h = reddit_average_posts_48h.asInstanceOf[js.Any], reddit_subscribers = reddit_subscribers.asInstanceOf[js.Any], twitter_followers = twitter_followers.asInstanceOf[js.Any], facebook_likes = null)
      __obj.asInstanceOf[Facebooklikes]
    }
    
    extension [Self <: Facebooklikes](x: Self) {
      
      inline def setFacebook_likes(value: Double): Self = StObject.set(x, "facebook_likes", value.asInstanceOf[js.Any])
      
      inline def setFacebook_likesNull: Self = StObject.set(x, "facebook_likes", null)
      
      inline def setReddit_accounts_active_48h(value: String): Self = StObject.set(x, "reddit_accounts_active_48h", value.asInstanceOf[js.Any])
      
      inline def setReddit_average_comments_48h(value: Double): Self = StObject.set(x, "reddit_average_comments_48h", value.asInstanceOf[js.Any])
      
      inline def setReddit_average_posts_48h(value: Double): Self = StObject.set(x, "reddit_average_posts_48h", value.asInstanceOf[js.Any])
      
      inline def setReddit_subscribers(value: Double): Self = StObject.set(x, "reddit_subscribers", value.asInstanceOf[js.Any])
      
      inline def setTwitter_followers(value: Double): Self = StObject.set(x, "twitter_followers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fetch extends StObject {
    
    /**
      * List all exchanges
      * @param params - Parameters to pass through to the request
      */
    def all(): js.Promise[Response[js.Array[Exchange]]] = js.native
    def all(params: ExchangesAllParams): js.Promise[Response[js.Array[Exchange]]] = js.native
    
    /**
      * Get exchange volume in BTC and tickers
      * @param exchangeId - (Required) The exchange id (can be obtained from exchanges.all()) eg. ripio
      */
    def fetch(exchangeId: String): js.Promise[Response[ExchangesFetchData]] = js.native
  }
  
  trait Hastradingincentive extends StObject {
    
    var has_trading_incentive: Boolean
    
    var identifier: String
    
    var name: String
  }
  object Hastradingincentive {
    
    inline def apply(has_trading_incentive: Boolean, identifier: String, name: String): Hastradingincentive = {
      val __obj = js.Dynamic.literal(has_trading_incentive = has_trading_incentive.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hastradingincentive]
    }
    
    extension [Self <: Hastradingincentive](x: Self) {
      
      inline def setHas_trading_incentive(value: Boolean): Self = StObject.set(x, "has_trading_incentive", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Price extends StObject {
    
    /**
      * Get the current price of any cryptocurrencies in any other supported currencies that you need
      * @param params - Parameters to pass through to the request
      */
    def price(params: SimplePriceParams): js.Promise[Response[Any]]
  }
  object Price {
    
    inline def apply(price: SimplePriceParams => js.Promise[Response[Any]]): Price = {
      val __obj = js.Dynamic.literal(price = js.Any.fromFunction1(price))
      __obj.asInstanceOf[Price]
    }
    
    extension [Self <: Price](x: Self) {
      
      inline def setPrice(value: SimplePriceParams => js.Promise[Response[Any]]): Self = StObject.set(x, "price", js.Any.fromFunction1(value))
    }
  }
  
  trait Small extends StObject {
    
    var small: String
    
    var thumb: String
  }
  object Small {
    
    inline def apply(small: String, thumb: String): Small = {
      val __obj = js.Dynamic.literal(small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Small]
    }
    
    extension [Self <: Small](x: Self) {
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    }
  }
}
