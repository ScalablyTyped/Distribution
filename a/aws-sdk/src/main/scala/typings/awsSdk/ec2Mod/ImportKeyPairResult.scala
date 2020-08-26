package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportKeyPairResult extends js.Object {
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The key pair name you provided.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The ID of the resulting key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.native
  /**
    * The tags applied to the imported key pair.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportKeyPairResult {
  @scala.inline
  def apply(): ImportKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportKeyPairResult]
  }
  @scala.inline
  implicit class ImportKeyPairResultOps[Self <: ImportKeyPairResult] (val x: Self) extends AnyVal {
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
    def setKeyFingerprint(value: String): Self = this.set("KeyFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFingerprint: Self = this.set("KeyFingerprint", js.undefined)
    @scala.inline
    def setKeyName(value: String): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setKeyPairId(value: String): Self = this.set("KeyPairId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPairId: Self = this.set("KeyPairId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

