package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationS3Response extends js.Object {
  /**
    * The time that the Amazon S3 bucket location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the Amazon S3 location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  var S3Config: js.UndefOr[typings.awsSdk.datasyncMod.S3Config] = js.native
  /**
    * The Amazon S3 storage class that you chose to store your files in when this location is used as a task destination. For more information about S3 storage classes, see Amazon S3 Storage Classes in the Amazon Simple Storage Service Developer Guide. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes.
    */
  var S3StorageClass: js.UndefOr[typings.awsSdk.datasyncMod.S3StorageClass] = js.native
}

object DescribeLocationS3Response {
  @scala.inline
  def apply(): DescribeLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationS3Response]
  }
  @scala.inline
  implicit class DescribeLocationS3ResponseOps[Self <: DescribeLocationS3Response] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
    @scala.inline
    def setS3Config(value: S3Config): Self = this.set("S3Config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Config: Self = this.set("S3Config", js.undefined)
    @scala.inline
    def setS3StorageClass(value: S3StorageClass): Self = this.set("S3StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3StorageClass: Self = this.set("S3StorageClass", js.undefined)
  }
  
}

