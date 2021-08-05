package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPageResult extends StObject {
  
  /**
    * Contains details of the fetched page.
    */
  var Page: js.UndefOr[typings.awsSdk.qldbsessionMod.Page] = js.undefined
}
object FetchPageResult {
  
  inline def apply(): FetchPageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPageResult]
  }
  
  extension [Self <: FetchPageResult](x: Self) {
    
    inline def setPage(value: Page): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
