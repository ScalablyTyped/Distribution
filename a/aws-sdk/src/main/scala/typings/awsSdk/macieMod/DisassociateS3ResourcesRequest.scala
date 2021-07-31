package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateS3ResourcesRequest extends StObject {
  
  /**
    * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon Macie Classic. 
    */
  var associatedS3Resources: S3Resources
  
  /**
    * The ID of the Amazon Macie Classic member account whose resources you want to remove from being monitored by Amazon Macie Classic. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
}
object DisassociateS3ResourcesRequest {
  
  @scala.inline
  def apply(associatedS3Resources: S3Resources): DisassociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(associatedS3Resources = associatedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateS3ResourcesRequest]
  }
  
  @scala.inline
  implicit class DisassociateS3ResourcesRequestMutableBuilder[Self <: DisassociateS3ResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedS3Resources(value: S3Resources): Self = StObject.set(x, "associatedS3Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedS3ResourcesVarargs(value: S3Resource*): Self = StObject.set(x, "associatedS3Resources", js.Array(value :_*))
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
  }
}
