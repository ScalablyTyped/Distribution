package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOfferingsResponse extends js.Object {
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListOfferings request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListOfferings request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * A list of offerings that are available to this account in the current AWS Region.
    */
  var Offerings: js.UndefOr[listOfOffering] = js.native
}
object ListOfferingsResponse {
  
  @scala.inline
  def apply(): ListOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsResponse]
  }
  
  @scala.inline
  implicit class ListOfferingsResponseOps[Self <: ListOfferingsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOfferingsVarargs(value: Offering*): Self = this.set("Offerings", js.Array(value :_*))
    
    @scala.inline
    def setOfferings(value: listOfOffering): Self = this.set("Offerings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferings: Self = this.set("Offerings", js.undefined)
  }
}
