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
    * The ID of the signing profile to be created.
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
    * Tags to be associated with the signing profile being created.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object PutSigningProfileRequest {
  @scala.inline
  def apply(
    platformId: PlatformId,
    profileName: ProfileName,
    signingMaterial: SigningMaterial,
    overrides: SigningPlatformOverrides = null,
    signingParameters: SigningParameters = null,
    tags: TagMap = null
  ): PutSigningProfileRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], signingMaterial = signingMaterial.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSigningProfileRequest]
  }
}

