package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCrawlersRequest extends js.Object {
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
}

