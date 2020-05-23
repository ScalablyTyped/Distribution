package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Tag extends js.Object {
  /**
    * 
    */
  var Key: TagKeyString = js.native
  /**
    * 
    */
  var Value: TagValueString = js.native
}

object S3Tag {
  @scala.inline
  def apply(Key: TagKeyString, Value: TagValueString): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Tag]
  }
}

