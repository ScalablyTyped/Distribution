package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  /**
    * The ID of the AWS account that owns the project.
    */
  var AccountId: js.UndefOr[typings.awsSdk.databrewMod.AccountId] = js.undefined
  
  /**
    * The date and time that the project was created.
    */
  var CreateDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (the user name) of the user who crated the project.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The dataset that the project is to act upon.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.undefined
  
  /**
    * The identifier (user name) of the user who last modified the project.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The last modification date and time for the project.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The unique name of a project.
    */
  var Name: ProjectName
  
  /**
    * The date and time when the project was opened.
    */
  var OpenDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (the user name) of the user that opened the project for use.
    */
  var OpenedBy: js.UndefOr[typings.awsSdk.databrewMod.OpenedBy] = js.undefined
  
  /**
    * The name of a recipe that will be developed during a project session.
    */
  var RecipeName: typings.awsSdk.databrewMod.RecipeName
  
  /**
    * The Amazon Resource Name (ARN) for the project.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The sample size and sampling type to apply to the data. If this parameter isn't specified, then the sample will consiste of the first 500 rows from the dataset.
    */
  var Sample: js.UndefOr[typings.awsSdk.databrewMod.Sample] = js.undefined
  
  /**
    * Metadata tags that have been applied to the project.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Project {
  
  @scala.inline
  def apply(Name: ProjectName, RecipeName: RecipeName): Project = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeName = RecipeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
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
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
