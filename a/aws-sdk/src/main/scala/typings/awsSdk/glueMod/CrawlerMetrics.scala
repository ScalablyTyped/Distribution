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
  def apply(
    CrawlerName: NameString = null,
    LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined,
    MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined,
    StillEstimating: js.UndefOr[Boolean] = js.undefined,
    TablesCreated: js.UndefOr[NonNegativeInteger] = js.undefined,
    TablesDeleted: js.UndefOr[NonNegativeInteger] = js.undefined,
    TablesUpdated: js.UndefOr[NonNegativeInteger] = js.undefined,
    TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
  ): CrawlerMetrics = {
    val __obj = js.Dynamic.literal()
    if (CrawlerName != null) __obj.updateDynamic("CrawlerName")(CrawlerName.asInstanceOf[js.Any])
    if (!js.isUndefined(LastRuntimeSeconds)) __obj.updateDynamic("LastRuntimeSeconds")(LastRuntimeSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MedianRuntimeSeconds)) __obj.updateDynamic("MedianRuntimeSeconds")(MedianRuntimeSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(StillEstimating)) __obj.updateDynamic("StillEstimating")(StillEstimating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesCreated)) __obj.updateDynamic("TablesCreated")(TablesCreated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesDeleted)) __obj.updateDynamic("TablesDeleted")(TablesDeleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesUpdated)) __obj.updateDynamic("TablesUpdated")(TablesUpdated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeLeftSeconds)) __obj.updateDynamic("TimeLeftSeconds")(TimeLeftSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerMetrics]
  }
}

