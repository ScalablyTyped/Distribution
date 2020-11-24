package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningProfile extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The ID of a platform that is available for use by a signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  
  /**
    * The ACM certificate that is available for use by a signing profile.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  
  /**
    * The parameters that are available for use by a code signing user.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  
  /**
    * The status of a code signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.native
  
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object SigningProfile {
  
  @scala.inline
  def apply(): SigningProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfile]
  }
  
  @scala.inline
  implicit class SigningProfileOps[Self <: SigningProfile] (val x: Self) extends AnyVal {
    
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
    def setArn(value: java.lang.String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = this.set("platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformId: Self = this.set("platformId", js.undefined)
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
    
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = this.set("signingMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningMaterial: Self = this.set("signingMaterial", js.undefined)
    
    @scala.inline
    def setSigningParameters(value: SigningParameters): Self = this.set("signingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningParameters: Self = this.set("signingParameters", js.undefined)
    
    @scala.inline
    def setStatus(value: SigningProfileStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
