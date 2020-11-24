package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateS3ResourcesRequest extends js.Object {
  
  /**
    * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon Macie Classic. 
    */
  var associatedS3Resources: S3Resources = js.native
  
  /**
    * The ID of the Amazon Macie Classic member account whose resources you want to remove from being monitored by Amazon Macie Classic. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
}
object DisassociateS3ResourcesRequest {
  
  @scala.inline
  def apply(associatedS3Resources: S3Resources): DisassociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(associatedS3Resources = associatedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateS3ResourcesRequest]
  }
  
  @scala.inline
  implicit class DisassociateS3ResourcesRequestOps[Self <: DisassociateS3ResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociatedS3ResourcesVarargs(value: S3Resource*): Self = this.set("associatedS3Resources", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedS3Resources(value: S3Resources): Self = this.set("associatedS3Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = this.set("memberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberAccountId: Self = this.set("memberAccountId", js.undefined)
  }
}
