package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDocument extends js.Object {
  /**
    * The object key name to use when a 4XX class error occurs.
    */
  var Key: ObjectKey = js.native
}

object ErrorDocument {
  @scala.inline
  def apply(Key: ObjectKey): ErrorDocument = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDocument]
  }
}

