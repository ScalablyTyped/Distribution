package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerMetrics extends js.Object {
  /**
    * The name of the crawler.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  /**
    * The duration of the crawler's most recent run, in seconds.
    */
  var LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * The median duration of this crawler's runs, in seconds.
    */
  var MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * True if the crawler is still estimating how long it will take to complete this run.
    */
  var StillEstimating: js.UndefOr[Boolean] = js.native
  /**
    * The number of tables created by this crawler.
    */
  var TablesCreated: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The number of tables deleted by this crawler.
    */
  var TablesDeleted: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The number of tables updated by this crawler.
    */
  var TablesUpdated: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The estimated time left to complete a running crawl.
    */
  var TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.native
}

object CrawlerMetrics {
  @scala.inline
  def apply(): CrawlerMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerMetrics]
  }
  @scala.inline
  implicit class CrawlerMetricsOps[Self <: CrawlerMetrics] (val x: Self) extends AnyVal {
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
    def setCrawlerName(value: NameString): Self = this.set("CrawlerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerName: Self = this.set("CrawlerName", js.undefined)
    @scala.inline
    def setLastRuntimeSeconds(value: NonNegativeDouble): Self = this.set("LastRuntimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRuntimeSeconds: Self = this.set("LastRuntimeSeconds", js.undefined)
    @scala.inline
    def setMedianRuntimeSeconds(value: NonNegativeDouble): Self = this.set("MedianRuntimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedianRuntimeSeconds: Self = this.set("MedianRuntimeSeconds", js.undefined)
    @scala.inline
    def setStillEstimating(value: Boolean): Self = this.set("StillEstimating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStillEstimating: Self = this.set("StillEstimating", js.undefined)
    @scala.inline
    def setTablesCreated(value: NonNegativeInteger): Self = this.set("TablesCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablesCreated: Self = this.set("TablesCreated", js.undefined)
    @scala.inline
    def setTablesDeleted(value: NonNegativeInteger): Self = this.set("TablesDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablesDeleted: Self = this.set("TablesDeleted", js.undefined)
    @scala.inline
    def setTablesUpdated(value: NonNegativeInteger): Self = this.set("TablesUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablesUpdated: Self = this.set("TablesUpdated", js.undefined)
    @scala.inline
    def setTimeLeftSeconds(value: NonNegativeDouble): Self = this.set("TimeLeftSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeLeftSeconds: Self = this.set("TimeLeftSeconds", js.undefined)
  }
  
}

