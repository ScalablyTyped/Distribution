package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Tag extends js.Object {
  /**
    * 
    */
  var Key: NonEmptyMaxLength1024String = js.native
  /**
    * 
    */
  var Value: MaxLength1024String = js.native
}

object S3Tag {
  @scala.inline
  def apply(Key: NonEmptyMaxLength1024String, Value: MaxLength1024String): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3Tag]
  }
}

