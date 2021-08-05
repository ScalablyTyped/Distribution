package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerNodeDetails extends StObject {
  
  /**
    * A list of crawls represented by the crawl node.
    */
  var Crawls: js.UndefOr[CrawlList] = js.undefined
}
object CrawlerNodeDetails {
  
  inline def apply(): CrawlerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerNodeDetails]
  }
  
  extension [Self <: CrawlerNodeDetails](x: Self) {
    
    inline def setCrawls(value: CrawlList): Self = StObject.set(x, "Crawls", value.asInstanceOf[js.Any])
    
    inline def setCrawlsUndefined: Self = StObject.set(x, "Crawls", js.undefined)
    
    inline def setCrawlsVarargs(value: Crawl*): Self = StObject.set(x, "Crawls", js.Array(value :_*))
  }
}
