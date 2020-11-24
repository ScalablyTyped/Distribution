package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityProfilesResponse extends js.Object {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of security profile identifiers (names and ARNs).
    */
  var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.native
}
object ListSecurityProfilesResponse {
  
  @scala.inline
  def apply(): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
  
  @scala.inline
  implicit class ListSecurityProfilesResponseOps[Self <: ListSecurityProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileIdentifiersVarargs(value: SecurityProfileIdentifier*): Self = this.set("securityProfileIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setSecurityProfileIdentifiers(value: SecurityProfileIdentifiers): Self = this.set("securityProfileIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileIdentifiers: Self = this.set("securityProfileIdentifiers", js.undefined)
  }
}
