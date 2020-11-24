package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationStatesResult extends js.Object {
  
  /**
    * A list of Applications that exist in Application Discovery Service.
    */
  var ApplicationStateList: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationStateList] = js.native
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListApplicationStatesResult {
  
  @scala.inline
  def apply(): ListApplicationStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationStatesResult]
  }
  
  @scala.inline
  implicit class ListApplicationStatesResultOps[Self <: ListApplicationStatesResult] (val x: Self) extends AnyVal {
    
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
    def setApplicationStateListVarargs(value: ApplicationState*): Self = this.set("ApplicationStateList", js.Array(value :_*))
    
    @scala.inline
    def setApplicationStateList(value: ApplicationStateList): Self = this.set("ApplicationStateList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationStateList: Self = this.set("ApplicationStateList", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
