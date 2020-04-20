package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartThingRegistrationTaskRequest extends js.Object {
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: RegistryS3BucketName = js.native
  /**
    * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains the parameter values to provision one device (thing).
    */
  var inputFileKey: RegistryS3KeyName = js.native
  /**
    * The IAM role ARN that grants permission the input file.
    */
  var roleArn: RoleArn = js.native
  /**
    * The provisioning template.
    */
  var templateBody: TemplateBody = js.native
}

object StartThingRegistrationTaskRequest {
  @scala.inline
  def apply(
    inputFileBucket: RegistryS3BucketName,
    inputFileKey: RegistryS3KeyName,
    roleArn: RoleArn,
    templateBody: TemplateBody
  ): StartThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(inputFileBucket = inputFileBucket.asInstanceOf[js.Any], inputFileKey = inputFileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartThingRegistrationTaskRequest]
  }
}

