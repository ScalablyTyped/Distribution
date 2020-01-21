package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeySummary extends js.Object {
  /**
    *  Comment for public key information summary. 
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    *  Creation time for public key information summary. 
    */
  var CreatedTime: timestamp = js.native
  /**
    *  Encoded key for public key information summary. 
    */
  var EncodedKey: String = js.native
  /**
    *  ID for public key information summary. 
    */
  var Id: String = js.native
  /**
    *  Name for public key information summary. 
    */
  var Name: String = js.native
}

object PublicKeySummary {
  @scala.inline
  def apply(CreatedTime: timestamp, EncodedKey: String, Id: String, Name: String, Comment: String = null): PublicKeySummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeySummary]
  }
}

