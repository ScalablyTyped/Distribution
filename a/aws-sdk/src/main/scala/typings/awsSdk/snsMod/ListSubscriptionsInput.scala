package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscriptionsInput extends js.Object {
  
  /**
    * Token returned by the previous ListSubscriptions request.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
}
object ListSubscriptionsInput {
  
  @scala.inline
  def apply(): ListSubscriptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsInput]
  }
  
  @scala.inline
  implicit class ListSubscriptionsInputOps[Self <: ListSubscriptionsInput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: nextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
