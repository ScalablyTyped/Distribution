package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationType extends js.Object {
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins performing continuous classification after a bucket is successfully associated with Amazon Macie. 
    */
  var continuous: S3ContinuousClassificationType = js.native
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: S3OneTimeClassificationType = js.native
}

object ClassificationType {
  @scala.inline
  def apply(continuous: S3ContinuousClassificationType, oneTime: S3OneTimeClassificationType): ClassificationType = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], oneTime = oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationType]
  }
}

