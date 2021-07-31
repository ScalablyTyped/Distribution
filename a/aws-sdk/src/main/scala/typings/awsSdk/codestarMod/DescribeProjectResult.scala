package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.undefined
  
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The date and time the project was created, in timestamp format.
    */
  var createdTimeStamp: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  
  /**
    * The ID of the project.
    */
  var id: js.UndefOr[ProjectId] = js.undefined
  
  /**
    * The display name for the project.
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  
  /**
    * The ID for the AWS CodeStar project template used to create the project.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
  
  /**
    * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
    */
  var stackId: js.UndefOr[StackId] = js.undefined
  
  /**
    * The project creation or deletion status.
    */
  var status: js.UndefOr[ProjectStatus] = js.undefined
}
object DescribeProjectResult {
  
  @scala.inline
  def apply(): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectResult]
  }
  
  @scala.inline
  implicit class DescribeProjectResultMutableBuilder[Self <: DescribeProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ProjectArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreatedTimeStamp(value: CreatedTimestamp): Self = StObject.set(x, "createdTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeStampUndefined: Self = StObject.set(x, "createdTimeStamp", js.undefined)
    
    @scala.inline
    def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectTemplateId(value: ProjectTemplateId): Self = StObject.set(x, "projectTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectTemplateIdUndefined: Self = StObject.set(x, "projectTemplateId", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
    
    @scala.inline
    def setStatus(value: ProjectStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
