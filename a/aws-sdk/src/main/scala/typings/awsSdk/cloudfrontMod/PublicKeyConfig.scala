package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String = js.native
  /**
    * An optional comment about a public key.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  var EncodedKey: String = js.native
  /**
    * The name for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var Name: String = js.native
}

object PublicKeyConfig {
  @scala.inline
  def apply(CallerReference: String, EncodedKey: String, Name: String, Comment: String = null): PublicKeyConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyConfig]
  }
}

