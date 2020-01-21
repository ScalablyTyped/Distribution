package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCrawlersResponse extends js.Object {
  /**
    * A list of crawler definitions.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.native
  /**
    * A list of names of crawlers that were not found.
    */
  var CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.native
}

object BatchGetCrawlersResponse {
  @scala.inline
  def apply(Crawlers: CrawlerList = null, CrawlersNotFound: CrawlerNameList = null): BatchGetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    if (Crawlers != null) __obj.updateDynamic("Crawlers")(Crawlers.asInstanceOf[js.Any])
    if (CrawlersNotFound != null) __obj.updateDynamic("CrawlersNotFound")(CrawlersNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCrawlersResponse]
  }
}

