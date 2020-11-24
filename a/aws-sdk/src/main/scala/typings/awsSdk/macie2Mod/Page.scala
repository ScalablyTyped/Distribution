package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  /**
    * The line that contains the data, and the position of the data on that line.
    */
  var lineRange: js.UndefOr[Range] = js.native
  
  /**
    * The position of the data on the page, relative to the beginning of the page.
    */
  var offsetRange: js.UndefOr[Range] = js.native
  
  /**
    * The page number of the page that contains the data.
    */
  var pageNumber: js.UndefOr[long] = js.native
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setLineRange(value: Range): Self = this.set("lineRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineRange: Self = this.set("lineRange", js.undefined)
    
    @scala.inline
    def setOffsetRange(value: Range): Self = this.set("offsetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRange: Self = this.set("offsetRange", js.undefined)
    
    @scala.inline
    def setPageNumber(value: long): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
  }
}
