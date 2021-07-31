package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCrawlerMetricsRequest extends StObject {
  
  /**
    * A list of the names of crawlers about which to retrieve metrics.
    */
  var CrawlerNameList: js.UndefOr[typings.awsSdk.glueMod.CrawlerNameList] = js.undefined
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetCrawlerMetricsRequest {
  
  @scala.inline
  def apply(): GetCrawlerMetricsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerMetricsRequest]
  }
  
  @scala.inline
  implicit class GetCrawlerMetricsRequestMutableBuilder[Self <: GetCrawlerMetricsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlerNameList(value: CrawlerNameList): Self = StObject.set(x, "CrawlerNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerNameListUndefined: Self = StObject.set(x, "CrawlerNameList", js.undefined)
    
    @scala.inline
    def setCrawlerNameListVarargs(value: NameString*): Self = StObject.set(x, "CrawlerNameList", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
