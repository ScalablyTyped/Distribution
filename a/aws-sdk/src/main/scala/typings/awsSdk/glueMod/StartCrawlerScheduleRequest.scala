package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class StartCrawlerScheduleRequestOps[Self <: StartCrawlerScheduleRequest] (val x: Self) extends AnyVal {
    
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
  }
}
