package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetCrawlersRequest extends js.Object {
  
  /**
    * A list of crawler names, which might be the names returned from the ListCrawlers operation.
    */
  var CrawlerNames: CrawlerNameList = js.native
}
object BatchGetCrawlersRequest {
  
  @scala.inline
  def apply(CrawlerNames: CrawlerNameList): BatchGetCrawlersRequest = {
    val __obj = js.Dynamic.literal(CrawlerNames = CrawlerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCrawlersRequest]
  }
  
  @scala.inline
  implicit class BatchGetCrawlersRequestOps[Self <: BatchGetCrawlersRequest] (val x: Self) extends AnyVal {
    
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
  }
}
