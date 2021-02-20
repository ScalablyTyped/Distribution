package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateS3ResourcesRequest extends StObject {
  
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
  implicit class AssociateS3ResourcesRequestMutableBuilder[Self <: AssociateS3ResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
    
    @scala.inline
    def setS3Resources(value: S3ResourcesClassification): Self = StObject.set(x, "s3Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ResourcesVarargs(value: S3ResourceClassification*): Self = StObject.set(x, "s3Resources", js.Array(value :_*))
  }
}
