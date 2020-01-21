package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlersResponse extends js.Object {
  /**
    * A list of crawler metadata.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.native
  /**
    * A continuation token, if the returned list has not reached the end of those defined in this customer account.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlersResponse {
  @scala.inline
  def apply(Crawlers: CrawlerList = null, NextToken: Token = null): GetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    if (Crawlers != null) __obj.updateDynamic("Crawlers")(Crawlers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCrawlersResponse]
  }
}

