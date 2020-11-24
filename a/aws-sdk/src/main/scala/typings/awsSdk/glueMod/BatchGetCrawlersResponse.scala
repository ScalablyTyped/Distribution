package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetCrawlersResponse extends js.Object {
  
  /**
    * A list of crawler definitions.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.native
  
  /**
    * A list of names of crawlers that were not found.
    */
  var CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.native
}
object BatchGetCrawlersResponse {
  
  @scala.inline
  def apply(): BatchGetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCrawlersResponse]
  }
  
  @scala.inline
  implicit class BatchGetCrawlersResponseOps[Self <: BatchGetCrawlersResponse] (val x: Self) extends AnyVal {
    
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
    def setCrawlersVarargs(value: Crawler*): Self = this.set("Crawlers", js.Array(value :_*))
    
    @scala.inline
    def setCrawlers(value: CrawlerList): Self = this.set("Crawlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlers: Self = this.set("Crawlers", js.undefined)
    
    @scala.inline
    def setCrawlersNotFoundVarargs(value: NameString*): Self = this.set("CrawlersNotFound", js.Array(value :_*))
    
    @scala.inline
    def setCrawlersNotFound(value: CrawlerNameList): Self = this.set("CrawlersNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlersNotFound: Self = this.set("CrawlersNotFound", js.undefined)
  }
}
