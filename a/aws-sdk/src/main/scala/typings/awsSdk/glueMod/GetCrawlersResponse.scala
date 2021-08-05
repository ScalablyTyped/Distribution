package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCrawlersResponse extends StObject {
  
  /**
    * A list of crawler metadata.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.undefined
  
  /**
    * A continuation token, if the returned list has not reached the end of those defined in this customer account.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetCrawlersResponse {
  
  inline def apply(): GetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlersResponse]
  }
  
  extension [Self <: GetCrawlersResponse](x: Self) {
    
    inline def setCrawlers(value: CrawlerList): Self = StObject.set(x, "Crawlers", value.asInstanceOf[js.Any])
    
    inline def setCrawlersUndefined: Self = StObject.set(x, "Crawlers", js.undefined)
    
    inline def setCrawlersVarargs(value: Crawler*): Self = StObject.set(x, "Crawlers", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
