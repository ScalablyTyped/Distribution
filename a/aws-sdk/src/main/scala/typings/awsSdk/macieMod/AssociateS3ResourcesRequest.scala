package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(s3Resources: S3ResourcesClassification): AssociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3Resources = s3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateS3ResourcesRequest]
  }
  
  @scala.inline
  implicit class AssociateS3ResourcesRequestOps[Self <: AssociateS3ResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setS3ResourcesVarargs(value: S3ResourceClassification*): Self = this.set("s3Resources", js.Array(value :_*))
    
    @scala.inline
    def setS3Resources(value: S3ResourcesClassification): Self = this.set("s3Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = this.set("memberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberAccountId: Self = this.set("memberAccountId", js.undefined)
  }
}
