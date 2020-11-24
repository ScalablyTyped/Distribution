package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsForSecurityProfileResponse extends js.Object {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing groups to which the security profile is attached.
    */
  var securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.native
}
object ListTargetsForSecurityProfileResponse {
  
  @scala.inline
  def apply(): ListTargetsForSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForSecurityProfileResponse]
  }
  
  @scala.inline
  implicit class ListTargetsForSecurityProfileResponseOps[Self <: ListTargetsForSecurityProfileResponse] (val x: Self) extends AnyVal {
    
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
    def setSecurityProfileTargetsVarargs(value: SecurityProfileTarget*): Self = this.set("securityProfileTargets", js.Array(value :_*))
    
    @scala.inline
    def setSecurityProfileTargets(value: SecurityProfileTargets): Self = this.set("securityProfileTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileTargets: Self = this.set("securityProfileTargets", js.undefined)
  }
}
