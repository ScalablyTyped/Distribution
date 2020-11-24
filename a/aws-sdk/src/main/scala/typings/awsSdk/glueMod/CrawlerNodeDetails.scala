package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerNodeDetails extends js.Object {
  
  /**
    * A list of crawls represented by the crawl node.
    */
  var Crawls: js.UndefOr[CrawlList] = js.native
}
object CrawlerNodeDetails {
  
  @scala.inline
  def apply(): CrawlerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerNodeDetails]
  }
  
  @scala.inline
  implicit class CrawlerNodeDetailsOps[Self <: CrawlerNodeDetails] (val x: Self) extends AnyVal {
    
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
    def setCrawlsVarargs(value: Crawl*): Self = this.set("Crawls", js.Array(value :_*))
    
    @scala.inline
    def setCrawls(value: CrawlList): Self = this.set("Crawls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawls: Self = this.set("Crawls", js.undefined)
  }
}
