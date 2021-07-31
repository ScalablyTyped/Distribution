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
  
  @scala.inline
  def apply(): CrawlerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerNodeDetails]
  }
  
  @scala.inline
  implicit class CrawlerNodeDetailsMutableBuilder[Self <: CrawlerNodeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawls(value: CrawlList): Self = StObject.set(x, "Crawls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlsUndefined: Self = StObject.set(x, "Crawls", js.undefined)
    
    @scala.inline
    def setCrawlsVarargs(value: Crawl*): Self = StObject.set(x, "Crawls", js.Array(value :_*))
  }
}
