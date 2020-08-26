package typings.awsSdkClientS3Browser.typesBucketAlreadyExistsMod

import typings.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyExists
  extends ServiceException[BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists = js.native
}

object BucketAlreadyExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BucketAlreadyExistsDetails,
    message: String,
    name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists
  ): BucketAlreadyExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyExists]
  }
  @scala.inline
  implicit class BucketAlreadyExistsOps[Self <: BucketAlreadyExists] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

