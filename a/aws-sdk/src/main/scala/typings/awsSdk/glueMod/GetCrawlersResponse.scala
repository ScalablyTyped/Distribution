package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCrawlersResponse extends js.Object {
  
  /**
    * A list of crawler metadata.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.native
  
  /**
    * A continuation token, if the returned list has not reached the end of those defined in this customer account.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetCrawlersResponse {
  
  @scala.inline
  def apply(): GetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlersResponse]
  }
  
  @scala.inline
  implicit class GetCrawlersResponseOps[Self <: GetCrawlersResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
