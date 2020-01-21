package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCrawlerScheduleRequest extends js.Object {
  /**
    * Name of the crawler to schedule.
    */
  var CrawlerName: NameString = js.native
}

object StartCrawlerScheduleRequest {
  @scala.inline
  def apply(CrawlerName: NameString): StartCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartCrawlerScheduleRequest]
  }
}

