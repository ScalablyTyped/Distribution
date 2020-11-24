package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtectionsRequest extends js.Object {
  
  /**
    * The maximum number of Protection objects to return. If you leave this blank, Shield Advanced returns the first 20 results. This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of objects returned could be less than MaxResults, even if there are still more objects yet to return. If there are more objects to return, Shield Advanced returns a value in NextToken that you can use in your next request, to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.native
  
  /**
    * The ListProtectionsRequest.NextToken value from a previous call to ListProtections. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListProtectionsRequest {
  
  @scala.inline
  def apply(): ListProtectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsRequest]
  }
  
  @scala.inline
  implicit class ListProtectionsRequestOps[Self <: ListProtectionsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
