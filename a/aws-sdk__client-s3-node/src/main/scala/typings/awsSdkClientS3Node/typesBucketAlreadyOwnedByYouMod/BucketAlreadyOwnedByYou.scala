package typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod

import typings.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyOwnedByYou
  extends ServiceException[BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou = js.native
}

object BucketAlreadyOwnedByYou {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BucketAlreadyOwnedByYouDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou
  ): BucketAlreadyOwnedByYou = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyOwnedByYou]
  }
  @scala.inline
  implicit class BucketAlreadyOwnedByYouOps[Self <: BucketAlreadyOwnedByYou] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

