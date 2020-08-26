package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerMetricsResponse extends js.Object {
  /**
    * A list of metrics for the specified crawler.
    */
  var CrawlerMetricsList: js.UndefOr[typings.awsSdk.glueMod.CrawlerMetricsList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlerMetricsResponse {
  @scala.inline
  def apply(): GetCrawlerMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerMetricsResponse]
  }
  @scala.inline
  implicit class GetCrawlerMetricsResponseOps[Self <: GetCrawlerMetricsResponse] (val x: Self) extends AnyVal {
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
    def setCrawlerMetricsListVarargs(value: CrawlerMetrics*): Self = this.set("CrawlerMetricsList", js.Array(value :_*))
    @scala.inline
    def setCrawlerMetricsList(value: CrawlerMetricsList): Self = this.set("CrawlerMetricsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerMetricsList: Self = this.set("CrawlerMetricsList", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

