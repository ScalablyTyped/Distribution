package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCrawlerResponse extends StObject {
  
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
  implicit class GetCrawlerResponseMutableBuilder[Self <: GetCrawlerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawler(value: Crawler): Self = StObject.set(x, "Crawler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerUndefined: Self = StObject.set(x, "Crawler", js.undefined)
  }
}
