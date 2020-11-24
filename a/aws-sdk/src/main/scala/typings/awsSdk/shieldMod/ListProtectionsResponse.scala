package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtectionsResponse extends js.Object {
  
  /**
    * If you specify a value for MaxResults and you have more Protections than the value of MaxResults, AWS Shield Advanced returns a NextToken value in the response that allows you to list another group of Protections. For the second and subsequent ListProtections requests, specify the value of NextToken from the previous response to get information about another batch of Protections. Shield Advanced might return the list of Protection objects in batches smaller than the number specified by MaxResults. If there are more Protection objects to return, Shield Advanced will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The array of enabled Protection objects.
    */
  var Protections: js.UndefOr[typings.awsSdk.shieldMod.Protections] = js.native
}
object ListProtectionsResponse {
  
  @scala.inline
  def apply(): ListProtectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsResponse]
  }
  
  @scala.inline
  implicit class ListProtectionsResponseOps[Self <: ListProtectionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProtectionsVarargs(value: Protection*): Self = this.set("Protections", js.Array(value :_*))
    
    @scala.inline
    def setProtections(value: Protections): Self = this.set("Protections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtections: Self = this.set("Protections", js.undefined)
  }
}
