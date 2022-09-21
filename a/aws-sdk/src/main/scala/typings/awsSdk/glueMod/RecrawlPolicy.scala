package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecrawlPolicy extends StObject {
  
  /**
    * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. A value of CRAWL_EVERYTHING specifies crawling the entire dataset again. A value of CRAWL_NEW_FOLDERS_ONLY specifies crawling only folders that were added since the last crawler run. A value of CRAWL_EVENT_MODE specifies crawling only the changes identified by Amazon S3 events.
    */
  var RecrawlBehavior: js.UndefOr[typings.awsSdk.glueMod.RecrawlBehavior] = js.undefined
}
object RecrawlPolicy {
  
  inline def apply(): RecrawlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecrawlPolicy]
  }
  
  extension [Self <: RecrawlPolicy](x: Self) {
    
    inline def setRecrawlBehavior(value: RecrawlBehavior): Self = StObject.set(x, "RecrawlBehavior", value.asInstanceOf[js.Any])
    
    inline def setRecrawlBehaviorUndefined: Self = StObject.set(x, "RecrawlBehavior", js.undefined)
  }
}
