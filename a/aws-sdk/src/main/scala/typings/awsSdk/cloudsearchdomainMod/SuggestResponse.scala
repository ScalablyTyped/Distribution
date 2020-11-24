package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestResponse extends js.Object {
  
  /**
    * The status of a SuggestRequest. Contains the resource ID (rid) and how long it took to process the request (timems).
    */
  var status: js.UndefOr[SuggestStatus] = js.native
  
  /**
    * Container for the matching search suggestion information.
    */
  var suggest: js.UndefOr[SuggestModel] = js.native
}
object SuggestResponse {
  
  @scala.inline
  def apply(): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResponse]
  }
  
  @scala.inline
  implicit class SuggestResponseOps[Self <: SuggestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: SuggestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSuggest(value: SuggestModel): Self = this.set("suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
  }
}
