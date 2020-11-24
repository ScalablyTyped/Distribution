package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityProfilesForTargetResponse extends js.Object {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of security profiles and their associated targets.
    */
  var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.native
}
object ListSecurityProfilesForTargetResponse {
  
  @scala.inline
  def apply(): ListSecurityProfilesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
  }
  
  @scala.inline
  implicit class ListSecurityProfilesForTargetResponseOps[Self <: ListSecurityProfilesForTargetResponse] (val x: Self) extends AnyVal {
    
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
    def setSecurityProfileTargetMappingsVarargs(value: SecurityProfileTargetMapping*): Self = this.set("securityProfileTargetMappings", js.Array(value :_*))
    
    @scala.inline
    def setSecurityProfileTargetMappings(value: SecurityProfileTargetMappings): Self = this.set("securityProfileTargetMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileTargetMappings: Self = this.set("securityProfileTargetMappings", js.undefined)
  }
}
