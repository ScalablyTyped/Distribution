package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerMetricsRequest extends js.Object {
  /**
    * A list of the names of crawlers about which to retrieve metrics.
    */
  var CrawlerNameList: js.UndefOr[typings.awsSdk.glueMod.CrawlerNameList] = js.native
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlerMetricsRequest {
  @scala.inline
  def apply(CrawlerNameList: CrawlerNameList = null, MaxResults: Int | Double = null, NextToken: Token = null): GetCrawlerMetricsRequest = {
    val __obj = js.Dynamic.literal()
    if (CrawlerNameList != null) __obj.updateDynamic("CrawlerNameList")(CrawlerNameList.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCrawlerMetricsRequest]
  }
}

