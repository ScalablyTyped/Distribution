package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSigningProfileRequest extends js.Object {
  /**
    * A subfield of platform. This specifies any different configuration options that you want to apply to the chosen platform (such as a different hash-algorithm or signing-algorithm).
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  /**
    * The ID of the signing platform to be created.
    */
  var platformId: PlatformId = js.native
  /**
    * The name of the signing profile to be created.
    */
  var profileName: ProfileName = js.native
  /**
    * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
    */
  var signingMaterial: SigningMaterial = js.native
  /**
    * Map of key-value pairs for signing. These can include any information that you want to use during signing.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  /**
    * Tags to be associated with the signing profile that is being created.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object PutSigningProfileRequest {
  @scala.inline
  def apply(platformId: PlatformId, profileName: ProfileName, signingMaterial: SigningMaterial): PutSigningProfileRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], signingMaterial = signingMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSigningProfileRequest]
  }
  @scala.inline
  implicit class PutSigningProfileRequestOps[Self <: PutSigningProfileRequest] (val x: Self) extends AnyVal {
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
    def setPlatformId(value: PlatformId): Self = this.set("platformId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("profileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = this.set("signingMaterial", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrides(value: SigningPlatformOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSigningParameters(value: SigningParameters): Self = this.set("signingParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningParameters: Self = this.set("signingParameters", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

