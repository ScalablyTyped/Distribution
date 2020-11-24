package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCodeReviewRequest extends js.Object {
  
  /**
    *  Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if there are failures and retries. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.ClientRequestToken] = js.native
  
  /**
    *  The name of the code review. The name of each code review in your AWS account must be unique. 
    */
  var Name: CodeReviewName = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling  ListRepositoryAssociations .   A code review can only be created on an associated repository. This is the ARN of the associated repository. 
    */
  var RepositoryAssociationArn: AssociationArn = js.native
  
  /**
    *  The type of code review to create. This is specified using a  CodeReviewType  object. You can create a code review only of type RepositoryAnalysis. 
    */
  var Type: CodeReviewType = js.native
}
object CreateCodeReviewRequest {
  
  @scala.inline
  def apply(Name: CodeReviewName, RepositoryAssociationArn: AssociationArn, Type: CodeReviewType): CreateCodeReviewRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RepositoryAssociationArn = RepositoryAssociationArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeReviewRequest]
  }
  
  @scala.inline
  implicit class CreateCodeReviewRequestOps[Self <: CreateCodeReviewRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: CodeReviewName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryAssociationArn(value: AssociationArn): Self = this.set("RepositoryAssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeReviewType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
  }
}
