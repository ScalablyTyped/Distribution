package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONInput extends js.Object {
  /**
    * The type of JSON. Valid values: Document, Lines.
    */
  var Type: js.UndefOr[JSONType] = js.native
}

object JSONInput {
  @scala.inline
  def apply(Type: JSONType = null): JSONInput = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONInput]
  }
}

