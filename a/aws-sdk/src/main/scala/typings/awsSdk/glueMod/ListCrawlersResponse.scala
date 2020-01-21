package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCrawlersResponse extends js.Object {
  /**
    * The names of all crawlers in the account, or the crawlers with the specified tags.
    */
  var CrawlerNames: js.UndefOr[CrawlerNameList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListCrawlersResponse {
  @scala.inline
  def apply(CrawlerNames: CrawlerNameList = null, NextToken: Token = null): ListCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    if (CrawlerNames != null) __obj.updateDynamic("CrawlerNames")(CrawlerNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCrawlersResponse]
  }
}

