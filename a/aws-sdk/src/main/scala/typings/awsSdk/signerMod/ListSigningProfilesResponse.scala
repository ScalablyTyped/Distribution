package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningProfilesResponse extends js.Object {
  
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of profiles that are available in the AWS account. This includes profiles with the status of CANCELED if the includeCanceled parameter is set to true.
    */
  var profiles: js.UndefOr[SigningProfiles] = js.native
}
object ListSigningProfilesResponse {
  
  @scala.inline
  def apply(): ListSigningProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningProfilesResponse]
  }
  
  @scala.inline
  implicit class ListSigningProfilesResponseOps[Self <: ListSigningProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setProfilesVarargs(value: SigningProfile*): Self = this.set("profiles", js.Array(value :_*))
    
    @scala.inline
    def setProfiles(value: SigningProfiles): Self = this.set("profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
  }
}
