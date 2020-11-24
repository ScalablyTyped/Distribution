package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCrawlersResponse extends js.Object {
  
  /**
    * The names of all crawlers in the account, or the crawlers with the specified tags.
    */
  var CrawlerNames: js.UndefOr[CrawlerNameList] = js.native
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListCrawlersResponse {
  
  @scala.inline
  def apply(): ListCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrawlersResponse]
  }
  
  @scala.inline
  implicit class ListCrawlersResponseOps[Self <: ListCrawlersResponse] (val x: Self) extends AnyVal {
    
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
    def setCrawlerNamesVarargs(value: NameString*): Self = this.set("CrawlerNames", js.Array(value :_*))
    
    @scala.inline
    def setCrawlerNames(value: CrawlerNameList): Self = this.set("CrawlerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlerNames: Self = this.set("CrawlerNames", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
