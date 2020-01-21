package typings.awsSdkClientS3Browser.typesJsoninputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.DOCUMENT
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.LINES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONInput extends js.Object {
  /**
    * <p>The type of JSON. Valid values: Document, Lines.</p>
    */
  var Type: js.UndefOr[DOCUMENT | LINES | String] = js.undefined
}

object JSONInput {
  @scala.inline
  def apply(Type: DOCUMENT | LINES | String = null): JSONInput = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONInput]
  }
}

