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
  def apply(): BuildArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildArtifacts]
  }
  @scala.inline
  implicit class BuildArtifactsOps[Self <: BuildArtifacts] (val x: Self) extends AnyVal {
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
    def setArtifactIdentifier(value: String): Self = this.set("artifactIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactIdentifier: Self = this.set("artifactIdentifier", js.undefined)
    @scala.inline
    def setEncryptionDisabled(value: WrapperBoolean): Self = this.set("encryptionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionDisabled: Self = this.set("encryptionDisabled", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMd5sum(value: String): Self = this.set("md5sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5sum: Self = this.set("md5sum", js.undefined)
    @scala.inline
    def setOverrideArtifactName(value: WrapperBoolean): Self = this.set("overrideArtifactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideArtifactName: Self = this.set("overrideArtifactName", js.undefined)
    @scala.inline
    def setSha256sum(value: String): Self = this.set("sha256sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256sum: Self = this.set("sha256sum", js.undefined)
  }
  
}

