package typings.awsSdkClientS3Node.typesNoSuchBucketMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSuchBucket extends ServiceException[NoSuchBucketDetails] {
  @JSName("name")
  var name_NoSuchBucket: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket = js.native
}

object NoSuchBucket {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchBucketDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket
  ): NoSuchBucket = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchBucket]
  }
  @scala.inline
  implicit class NoSuchBucketOps[Self <: NoSuchBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

