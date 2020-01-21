package typings.awsSdkClientS3Browser.typesAccessControlTranslationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Destination
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

