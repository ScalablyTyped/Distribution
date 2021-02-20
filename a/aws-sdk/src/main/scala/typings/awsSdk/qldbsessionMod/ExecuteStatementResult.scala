package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStatementResult extends StObject {
  
  /**
    * Contains the details of the first fetched page.
    */
  var FirstPage: js.UndefOr[Page] = js.native
}
object ExecuteStatementResult {
  
  @scala.inline
  def apply(): ExecuteStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResult]
  }
  
  @scala.inline
  implicit class ExecuteStatementResultMutableBuilder[Self <: ExecuteStatementResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstPage(value: Page): Self = StObject.set(x, "FirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageUndefined: Self = StObject.set(x, "FirstPage", js.undefined)
  }
}
