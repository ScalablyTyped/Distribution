package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPair extends js.Object {
  /**
    * The SHA-1 digest of the DER encoded private key.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  /**
    * An unencrypted PEM encoded RSA private key.
    */
  var KeyMaterial: js.UndefOr[SensitiveUserData] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.native
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object KeyPair {
  @scala.inline
  def apply(): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPair]
  }
  @scala.inline
  implicit class KeyPairOps[Self <: KeyPair] (val x: Self) extends AnyVal {
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
    def setKeyMaterial(value: SensitiveUserData): Self = this.set("KeyMaterial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMaterial: Self = this.set("KeyMaterial", js.undefined)
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

