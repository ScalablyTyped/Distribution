package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceDelegatesResponse extends js.Object {
  
  /**
    * One page of the resource's delegates.
    */
  var Delegates: js.UndefOr[ResourceDelegates] = js.native
  
  /**
    * The token used to paginate through the delegates associated with a resource. While results are still available, it has an associated value. When the last page is reached, the token is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
}
object ListResourceDelegatesResponse {
  
  @scala.inline
  def apply(): ListResourceDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDelegatesResponse]
  }
  
  @scala.inline
  implicit class ListResourceDelegatesResponseOps[Self <: ListResourceDelegatesResponse] (val x: Self) extends AnyVal {
    
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
    def setDelegatesVarargs(value: Delegate*): Self = this.set("Delegates", js.Array(value :_*))
    
    @scala.inline
    def setDelegates(value: ResourceDelegates): Self = this.set("Delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegates: Self = this.set("Delegates", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
