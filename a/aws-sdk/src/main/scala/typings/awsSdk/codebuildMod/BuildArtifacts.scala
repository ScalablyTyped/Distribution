package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArtifacts extends js.Object {
  /**
    *  An identifier for this artifact definition. 
    */
  var artifactIdentifier: js.UndefOr[String] = js.native
  /**
    *  Information that tells you if encryption for build artifacts is disabled. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    * Information about the location of the build artifacts.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The MD5 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var md5sum: js.UndefOr[String] = js.native
  /**
    *  If this flag is set, a name specified in the buildspec file overrides the artifact name. The name specified in a buildspec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
    */
  var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.native
  /**
    * The SHA-256 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var sha256sum: js.UndefOr[String] = js.native
}

object BuildArtifacts {
  @scala.inline
  def apply(
    artifactIdentifier: String = null,
    encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
    location: String = null,
    md5sum: String = null,
    overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined,
    sha256sum: String = null
  ): BuildArtifacts = {
    val __obj = js.Dynamic.literal()
    if (artifactIdentifier != null) __obj.updateDynamic("artifactIdentifier")(artifactIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (md5sum != null) __obj.updateDynamic("md5sum")(md5sum.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideArtifactName)) __obj.updateDynamic("overrideArtifactName")(overrideArtifactName.get.asInstanceOf[js.Any])
    if (sha256sum != null) __obj.updateDynamic("sha256sum")(sha256sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifacts]
  }
}

