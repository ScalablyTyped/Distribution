package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Config extends js.Object {
  /**
    * The Amazon S3 bucket to access. This bucket is used as a parameter in the CreateLocationS3 operation. 
    */
  var BucketAccessRoleArn: IamRoleArn = js.native
}

object S3Config {
  @scala.inline
  def apply(BucketAccessRoleArn: IamRoleArn): S3Config = {
    val __obj = js.Dynamic.literal(BucketAccessRoleArn = BucketAccessRoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3Config]
  }
}

