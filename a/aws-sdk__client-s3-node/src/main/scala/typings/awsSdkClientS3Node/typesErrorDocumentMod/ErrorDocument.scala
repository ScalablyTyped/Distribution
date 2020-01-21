package typings.awsSdkClientS3Node.typesErrorDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDocument extends js.Object {
  /**
    * <p>The object key name to use when a 4XX class error occurs.</p>
    */
  var Key: String
}

object ErrorDocument {
  @scala.inline
  def apply(Key: String): ErrorDocument = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorDocument]
  }
}

