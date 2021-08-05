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
  
  inline def apply(CrawlerName: NameString): StartCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCrawlerScheduleRequest]
  }
  
  extension [Self <: StartCrawlerScheduleRequest](x: Self) {
    
    inline def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
  }
}
