package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCrawlerScheduleRequest extends StObject {
  
  /**
    * Name of the crawler to schedule.
    */
  var CrawlerName: NameString
}
object StartCrawlerScheduleRequest {
  
  @scala.inline
  def apply(CrawlerName: NameString): StartCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCrawlerScheduleRequest]
  }
  
  @scala.inline
  implicit class StartCrawlerScheduleRequestMutableBuilder[Self <: StartCrawlerScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
  }
}
