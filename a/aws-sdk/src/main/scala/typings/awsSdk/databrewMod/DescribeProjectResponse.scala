package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectResponse extends StObject {
  
  /**
    * The date and time that the project was created.
    */
  var CreateDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (user name) of the user who created the project.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * The dataset associated with the project.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.native
  
  /**
    * The identifier (user name) of the user who last modified the project.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The date and time that the project was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * The name of the project.
    */
  var Name: ProjectName = js.native
  
  /**
    * The date and time when the project was opened. 
    */
  var OpenDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (user name) of the user that opened the project for use. 
    */
  var OpenedBy: js.UndefOr[typings.awsSdk.databrewMod.OpenedBy] = js.native
  
  /**
    * The recipe associated with this job.
    */
  var RecipeName: js.UndefOr[typings.awsSdk.databrewMod.RecipeName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
    */
  var RoleArn: js.UndefOr[Arn] = js.native
  
  var Sample: js.UndefOr[typings.awsSdk.databrewMod.Sample] = js.native
  
  /**
    * Describes the current state of the session:    PROVISIONING - allocating resources for the session.    INITIALIZING - getting the session ready for first use.    ASSIGNED - the session is ready for use.  
    */
  var SessionStatus: js.UndefOr[typings.awsSdk.databrewMod.SessionStatus] = js.native
  
  /**
    * Metadata tags associated with this project.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object DescribeProjectResponse {
  
  @scala.inline
  def apply(Name: ProjectName): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResponse]
  }
  
  @scala.inline
  implicit class DescribeProjectResponseMutableBuilder[Self <: DescribeProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDate(value: Date): Self = StObject.set(x, "OpenDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDateUndefined: Self = StObject.set(x, "OpenDate", js.undefined)
    
    @scala.inline
    def setOpenedBy(value: OpenedBy): Self = StObject.set(x, "OpenedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedByUndefined: Self = StObject.set(x, "OpenedBy", js.undefined)
    
    @scala.inline
    def setRecipeName(value: RecipeName): Self = StObject.set(x, "RecipeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeNameUndefined: Self = StObject.set(x, "RecipeName", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSample(value: Sample): Self = StObject.set(x, "Sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUndefined: Self = StObject.set(x, "Sample", js.undefined)
    
    @scala.inline
    def setSessionStatus(value: SessionStatus): Self = StObject.set(x, "SessionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionStatusUndefined: Self = StObject.set(x, "SessionStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
