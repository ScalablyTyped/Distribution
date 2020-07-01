package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateS3ResourcesRequest extends js.Object {
  /**
    * The ID of the Amazon Macie Classic member account whose resources you want to associate with Macie Classic. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * The S3 resources that you want to associate with Amazon Macie Classic for monitoring and data classification. 
    */
  var s3Resources: S3ResourcesClassification = js.native
}

object AssociateS3ResourcesRequest {
  @scala.inline
  def apply(s3Resources: S3ResourcesClassification, memberAccountId: AWSAccountId = null): AssociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3Resources = s3Resources.asInstanceOf[js.Any])
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateS3ResourcesRequest]
  }
}

