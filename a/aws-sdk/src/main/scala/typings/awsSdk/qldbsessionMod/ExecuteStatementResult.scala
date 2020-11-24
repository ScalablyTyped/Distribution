package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStatementResult extends js.Object {
  
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
  implicit class ExecuteStatementResultOps[Self <: ExecuteStatementResult] (val x: Self) extends AnyVal {
    
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
    def setFirstPage(value: Page): Self = this.set("FirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPage: Self = this.set("FirstPage", js.undefined)
  }
}
