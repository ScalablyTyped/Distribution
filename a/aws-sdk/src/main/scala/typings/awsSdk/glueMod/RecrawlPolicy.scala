package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecrawlPolicy extends js.Object {
  
  /**
    * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. A value of CRAWL_EVERYTHING specifies crawling the entire dataset again. A value of CRAWL_NEW_FOLDERS_ONLY specifies crawling only folders that were added since the last crawler run.
    */
  var RecrawlBehavior: js.UndefOr[typings.awsSdk.glueMod.RecrawlBehavior] = js.native
}
object RecrawlPolicy {
  
  @scala.inline
  def apply(): RecrawlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecrawlPolicy]
  }
  
  @scala.inline
  implicit class RecrawlPolicyOps[Self <: RecrawlPolicy] (val x: Self) extends AnyVal {
    
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
    def setRecrawlBehavior(value: RecrawlBehavior): Self = this.set("RecrawlBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecrawlBehavior: Self = this.set("RecrawlBehavior", js.undefined)
  }
}
