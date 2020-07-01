package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ResourceClassification extends js.Object {
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var bucketName: BucketName = js.native
  /**
    * The classification type that you want to specify for the resource associated with Amazon Macie Classic. 
    */
  var classificationType: ClassificationType = js.native
  /**
    * The prefix of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3ResourceClassification {
  @scala.inline
  def apply(bucketName: BucketName, classificationType: ClassificationType, prefix: Prefix = null): S3ResourceClassification = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationType = classificationType.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassification]
  }
}

