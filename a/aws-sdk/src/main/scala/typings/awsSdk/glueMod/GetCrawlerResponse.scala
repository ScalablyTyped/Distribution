package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerResponse extends js.Object {
  /**
    * The metadata for the specified crawler.
    */
  var Crawler: js.UndefOr[typings.awsSdk.glueMod.Crawler] = js.native
}

object GetCrawlerResponse {
  @scala.inline
  def apply(Crawler: Crawler = null): GetCrawlerResponse = {
    val __obj = js.Dynamic.literal()
    if (Crawler != null) __obj.updateDynamic("Crawler")(Crawler.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCrawlerResponse]
  }
}

