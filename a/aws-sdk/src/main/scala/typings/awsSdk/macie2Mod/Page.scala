package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  /**
    * The line that contains the data, and the position of the data on that line.
    */
  var lineRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The position of the data on the page, relative to the beginning of the page.
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The page number of the page that contains the data.
    */
  var pageNumber: js.UndefOr[long] = js.undefined
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineRange(value: Range): Self = StObject.set(x, "lineRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineRangeUndefined: Self = StObject.set(x, "lineRange", js.undefined)
    
    @scala.inline
    def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    @scala.inline
    def setPageNumber(value: long): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
  }
}
