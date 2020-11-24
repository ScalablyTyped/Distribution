package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActiveNamesResult extends js.Object {
  
  /**
    * The list of active names returned by the get active names request.
    */
  var activeNames: js.UndefOr[StringList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetActiveNames request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetActiveNamesResult {
  
  @scala.inline
  def apply(): GetActiveNamesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActiveNamesResult]
  }
  
  @scala.inline
  implicit class GetActiveNamesResultOps[Self <: GetActiveNamesResult] (val x: Self) extends AnyVal {
    
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
    def setActiveNamesVarargs(value: String*): Self = this.set("activeNames", js.Array(value :_*))
    
    @scala.inline
    def setActiveNames(value: StringList): Self = this.set("activeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveNames: Self = this.set("activeNames", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
