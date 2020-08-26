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
  def apply(): GetCrawlerMetricsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerMetricsRequest]
  }
  @scala.inline
  implicit class GetCrawlerMetricsRequestOps[Self <: GetCrawlerMetricsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCrawlerNameListVarargs(value: NameString*): Self = this.set("CrawlerNameList", js.Array(value :_*))
    @scala.inline
    def setCrawlerNameList(value: CrawlerNameList): Self = this.set("CrawlerNameList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerNameList: Self = this.set("CrawlerNameList", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

