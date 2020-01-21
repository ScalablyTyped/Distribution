package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerNodeDetails extends js.Object {
  /**
    * A list of crawls represented by the crawl node.
    */
  var Crawls: js.UndefOr[CrawlList] = js.native
}

object CrawlerNodeDetails {
  @scala.inline
  def apply(Crawls: CrawlList = null): CrawlerNodeDetails = {
    val __obj = js.Dynamic.literal()
    if (Crawls != null) __obj.updateDynamic("Crawls")(Crawls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerNodeDetails]
  }
}

