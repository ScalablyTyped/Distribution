package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageMethodeModelInfoReturn extends StObject {
  
  var end: Double
  
  var length: Double
  
  var page: Double
  
  var pages: Double
  
  var recordsDisplay: Double
  
  var recordsTotal: Double
  
  var serverSide: Boolean
  
  var start: Double
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
  implicit class PageMethodeModelInfoReturnMutableBuilder[Self <: PageMethodeModelInfoReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsDisplay(value: Double): Self = StObject.set(x, "recordsDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsTotal(value: Double): Self = StObject.set(x, "recordsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSide(value: Boolean): Self = StObject.set(x, "serverSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
