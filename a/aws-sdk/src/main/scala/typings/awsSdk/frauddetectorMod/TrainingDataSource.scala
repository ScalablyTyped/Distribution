package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingDataSource extends js.Object {
  /**
    * The data access role ARN for the training data source.
    */
  var dataAccessRoleArn: iamRoleArn = js.native
  /**
    * The data location of the training data source.
    */
  var dataLocation: s3BucketLocation = js.native
}

object TrainingDataSource {
  @scala.inline
  def apply(dataAccessRoleArn: iamRoleArn, dataLocation: s3BucketLocation): TrainingDataSource = {
    val __obj = js.Dynamic.literal(dataAccessRoleArn = dataAccessRoleArn.asInstanceOf[js.Any], dataLocation = dataLocation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrainingDataSource]
  }
}

