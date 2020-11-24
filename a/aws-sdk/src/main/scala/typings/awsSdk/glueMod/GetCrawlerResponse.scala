package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCrawlerResponse extends js.Object {
  
  /**
    * The metadata for the specified crawler.
    */
  var Crawler: js.UndefOr[typings.awsSdk.glueMod.Crawler] = js.native
}
object GetCrawlerResponse {
  
  @scala.inline
  def apply(): GetCrawlerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerResponse]
  }
  
  @scala.inline
  implicit class GetCrawlerResponseOps[Self <: GetCrawlerResponse] (val x: Self) extends AnyVal {
    
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
    def setCrawler(value: Crawler): Self = this.set("Crawler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawler: Self = this.set("Crawler", js.undefined)
  }
}
