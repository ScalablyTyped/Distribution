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
  
  @scala.inline
  def apply(): GetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlersResponse]
  }
  
  @scala.inline
  implicit class GetCrawlersResponseMutableBuilder[Self <: GetCrawlersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlers(value: CrawlerList): Self = StObject.set(x, "Crawlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlersUndefined: Self = StObject.set(x, "Crawlers", js.undefined)
    
    @scala.inline
    def setCrawlersVarargs(value: Crawler*): Self = StObject.set(x, "Crawlers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
