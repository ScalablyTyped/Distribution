package typings.coingeckoApi.mod

import typings.coingeckoApi.anon.Alexarank
import typings.coingeckoApi.anon.Circulatingsupply
import typings.coingeckoApi.anon.Closedissues
import typings.coingeckoApi.anon.Facebooklikes
import typings.coingeckoApi.anon.Small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchData extends StObject {
  
  var block_time_in_minutes: Double
  
  var categories: js.Array[String]
  
  var coingecko_rank: Double
  
  var coingecko_score: Double
  
  var community_data: Facebooklikes
  
  var community_score: Double
  
  var country_origin: String
  
  var description: js.Object
  
  var developer_data: Closedissues
  
  var developer_score: Double
  
  var genesis_date: String
  
  var hashing_algorithm: String
  
  var id: String
  
  var image: Small
  
  var last_updated: String
  
  var links: js.Object
  
  var liquidity_score: Double
  
  var localization: js.Object
  
  var market_cap_rank: Double
  
  var market_data: Circulatingsupply
  
  var name: String
  
  var public_interest_score: Double
  
  var public_interest_stats: Alexarank
  
  var sentiment_votes_down_percentage: Double
  
  var sentiment_votes_up_percentage: Double
  
  var symbol: String
  
  var tickers: js.Array[CoinsFetchDataTicker]
}
object CoinsFetchData {
  
  inline def apply(
    block_time_in_minutes: Double,
    categories: js.Array[String],
    coingecko_rank: Double,
    coingecko_score: Double,
    community_data: Facebooklikes,
    community_score: Double,
    country_origin: String,
    description: js.Object,
    developer_data: Closedissues,
    developer_score: Double,
    genesis_date: String,
    hashing_algorithm: String,
    id: String,
    image: Small,
    last_updated: String,
    links: js.Object,
    liquidity_score: Double,
    localization: js.Object,
    market_cap_rank: Double,
    market_data: Circulatingsupply,
    name: String,
    public_interest_score: Double,
    public_interest_stats: Alexarank,
    sentiment_votes_down_percentage: Double,
    sentiment_votes_up_percentage: Double,
    symbol: String,
    tickers: js.Array[CoinsFetchDataTicker]
  ): CoinsFetchData = {
    val __obj = js.Dynamic.literal(block_time_in_minutes = block_time_in_minutes.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], coingecko_rank = coingecko_rank.asInstanceOf[js.Any], coingecko_score = coingecko_score.asInstanceOf[js.Any], community_data = community_data.asInstanceOf[js.Any], community_score = community_score.asInstanceOf[js.Any], country_origin = country_origin.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], developer_data = developer_data.asInstanceOf[js.Any], developer_score = developer_score.asInstanceOf[js.Any], genesis_date = genesis_date.asInstanceOf[js.Any], hashing_algorithm = hashing_algorithm.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], last_updated = last_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], liquidity_score = liquidity_score.asInstanceOf[js.Any], localization = localization.asInstanceOf[js.Any], market_cap_rank = market_cap_rank.asInstanceOf[js.Any], market_data = market_data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_interest_score = public_interest_score.asInstanceOf[js.Any], public_interest_stats = public_interest_stats.asInstanceOf[js.Any], sentiment_votes_down_percentage = sentiment_votes_down_percentage.asInstanceOf[js.Any], sentiment_votes_up_percentage = sentiment_votes_up_percentage.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], tickers = tickers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinsFetchData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinsFetchData] (val x: Self) extends AnyVal {
    
    inline def setBlock_time_in_minutes(value: Double): Self = StObject.set(x, "block_time_in_minutes", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCoingecko_rank(value: Double): Self = StObject.set(x, "coingecko_rank", value.asInstanceOf[js.Any])
    
    inline def setCoingecko_score(value: Double): Self = StObject.set(x, "coingecko_score", value.asInstanceOf[js.Any])
    
    inline def setCommunity_data(value: Facebooklikes): Self = StObject.set(x, "community_data", value.asInstanceOf[js.Any])
    
    inline def setCommunity_score(value: Double): Self = StObject.set(x, "community_score", value.asInstanceOf[js.Any])
    
    inline def setCountry_origin(value: String): Self = StObject.set(x, "country_origin", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: js.Object): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_data(value: Closedissues): Self = StObject.set(x, "developer_data", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_score(value: Double): Self = StObject.set(x, "developer_score", value.asInstanceOf[js.Any])
    
    inline def setGenesis_date(value: String): Self = StObject.set(x, "genesis_date", value.asInstanceOf[js.Any])
    
    inline def setHashing_algorithm(value: String): Self = StObject.set(x, "hashing_algorithm", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Small): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setLast_updated(value: String): Self = StObject.set(x, "last_updated", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Object): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLiquidity_score(value: Double): Self = StObject.set(x, "liquidity_score", value.asInstanceOf[js.Any])
    
    inline def setLocalization(value: js.Object): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setMarket_cap_rank(value: Double): Self = StObject.set(x, "market_cap_rank", value.asInstanceOf[js.Any])
    
    inline def setMarket_data(value: Circulatingsupply): Self = StObject.set(x, "market_data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublic_interest_score(value: Double): Self = StObject.set(x, "public_interest_score", value.asInstanceOf[js.Any])
    
    inline def setPublic_interest_stats(value: Alexarank): Self = StObject.set(x, "public_interest_stats", value.asInstanceOf[js.Any])
    
    inline def setSentiment_votes_down_percentage(value: Double): Self = StObject.set(x, "sentiment_votes_down_percentage", value.asInstanceOf[js.Any])
    
    inline def setSentiment_votes_up_percentage(value: Double): Self = StObject.set(x, "sentiment_votes_up_percentage", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setTickers(value: js.Array[CoinsFetchDataTicker]): Self = StObject.set(x, "tickers", value.asInstanceOf[js.Any])
    
    inline def setTickersVarargs(value: CoinsFetchDataTicker*): Self = StObject.set(x, "tickers", js.Array(value*))
  }
}
