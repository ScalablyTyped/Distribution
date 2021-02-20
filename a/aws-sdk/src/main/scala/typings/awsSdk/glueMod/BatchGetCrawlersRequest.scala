package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetCrawlersRequest extends StObject {
  
  /**
    * A list of crawler names, which might be the names returned from the ListCrawlers operation.
    */
  var CrawlerNames: CrawlerNameList = js.native
}
object BatchGetCrawlersRequest {
  
  @scala.inline
  def apply(CrawlerNames: CrawlerNameList): BatchGetCrawlersRequest = {
    val __obj = js.Dynamic.literal(CrawlerNames = CrawlerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCrawlersRequest]
  }
  
  @scala.inline
  implicit class BatchGetCrawlersRequestMutableBuilder[Self <: BatchGetCrawlersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlerNames(value: CrawlerNameList): Self = StObject.set(x, "CrawlerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerNamesVarargs(value: NameString*): Self = StObject.set(x, "CrawlerNames", js.Array(value :_*))
  }
}
