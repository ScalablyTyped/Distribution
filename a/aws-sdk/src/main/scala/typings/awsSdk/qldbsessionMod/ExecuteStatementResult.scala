package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementResult extends StObject {
  
  /**
    * Contains the details of the first fetched page.
    */
  var FirstPage: js.UndefOr[Page] = js.undefined
}
object ExecuteStatementResult {
  
  inline def apply(): ExecuteStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResult]
  }
  
  extension [Self <: ExecuteStatementResult](x: Self) {
    
    inline def setFirstPage(value: Page): Self = StObject.set(x, "FirstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageUndefined: Self = StObject.set(x, "FirstPage", js.undefined)
  }
}
