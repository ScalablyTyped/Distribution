package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * An S3 bucket identifier. This is the name of the S3 bucket.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the zip file that contains the build files or script files. 
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file. If not set, the latest version of the file is retrieved. 
    */
  var ObjectVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access the S3 bucket.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
}

object S3Location {
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
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
    def setBucket(value: NonEmptyString): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setKey(value: NonEmptyString): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setObjectVersion(value: NonEmptyString): Self = this.set("ObjectVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectVersion: Self = this.set("ObjectVersion", js.undefined)
    @scala.inline
    def setRoleArn(value: NonEmptyString): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

