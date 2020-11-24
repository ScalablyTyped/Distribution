package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageMethodeModelInfoReturn extends js.Object {
  
  var end: Double = js.native
  
  var length: Double = js.native
  
  var page: Double = js.native
  
  var pages: Double = js.native
  
  var recordsDisplay: Double = js.native
  
  var recordsTotal: Double = js.native
  
  var serverSide: Boolean = js.native
  
  var start: Double = js.native
}
object PageMethodeModelInfoReturn {
  
  @scala.inline
  def apply(
    end: Double,
    length: Double,
    page: Double,
    pages: Double,
    recordsDisplay: Double,
    recordsTotal: Double,
    serverSide: Boolean,
    start: Double
  ): PageMethodeModelInfoReturn = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], recordsDisplay = recordsDisplay.asInstanceOf[js.Any], recordsTotal = recordsTotal.asInstanceOf[js.Any], serverSide = serverSide.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageMethodeModelInfoReturn]
  }
  
  @scala.inline
  implicit class PageMethodeModelInfoReturnOps[Self <: PageMethodeModelInfoReturn] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsDisplay(value: Double): Self = this.set("recordsDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsTotal(value: Double): Self = this.set("recordsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSide(value: Boolean): Self = this.set("serverSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
