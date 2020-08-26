package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ResourceClassificationUpdate extends js.Object {
  /**
    * The name of the S3 bucket whose classification types you want to update.
    */
  var bucketName: BucketName = js.native
  /**
    * The classification type that you want to update for the resource associated with Amazon Macie Classic. 
    */
  var classificationTypeUpdate: ClassificationTypeUpdate = js.native
  /**
    * The prefix of the S3 bucket whose classification types you want to update.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3ResourceClassificationUpdate {
  @scala.inline
  def apply(bucketName: BucketName, classificationTypeUpdate: ClassificationTypeUpdate): S3ResourceClassificationUpdate = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationTypeUpdate = classificationTypeUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassificationUpdate]
  }
  @scala.inline
  implicit class S3ResourceClassificationUpdateOps[Self <: S3ResourceClassificationUpdate] (val x: Self) extends AnyVal {
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
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassificationTypeUpdate(value: ClassificationTypeUpdate): Self = this.set("classificationTypeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

