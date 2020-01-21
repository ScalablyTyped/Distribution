package typings.awsSdkClientS3Node.typesAccessControlTranslationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Destination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlTranslation extends js.Object {
  /**
    * <p>The override value for the owner of the replica object.</p>
    */
  var Owner: Destination | String
}

object AccessControlTranslation {
  @scala.inline
  def apply(Owner: Destination | String): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessControlTranslation]
  }
}

