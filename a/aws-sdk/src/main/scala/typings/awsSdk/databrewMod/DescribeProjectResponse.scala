package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectResponse extends StObject {
  
  /**
    * The date and time that the project was created.
    */
  var CreateDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (user name) of the user who created the project.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The dataset associated with the project.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.undefined
  
  /**
    * The identifier (user name) of the user who last modified the project.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The date and time that the project was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the project.
    */
  var Name: ProjectName
  
  /**
    * The date and time when the project was opened. 
    */
  var OpenDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (user name) of the user that opened the project for use. 
    */
  var OpenedBy: js.UndefOr[typings.awsSdk.databrewMod.OpenedBy] = js.undefined
  
  /**
    * The recipe associated with this job.
    */
  var RecipeName: js.UndefOr[typings.awsSdk.databrewMod.RecipeName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  var Sample: js.UndefOr[typings.awsSdk.databrewMod.Sample] = js.undefined
  
  /**
    * Describes the current state of the session:    PROVISIONING - allocating resources for the session.    INITIALIZING - getting the session ready for first use.    ASSIGNED - the session is ready for use.  
    */
  var SessionStatus: js.UndefOr[typings.awsSdk.databrewMod.SessionStatus] = js.undefined
  
  /**
    * Metadata tags associated with this project.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeProjectResponse {
  
  inline def apply(Name: ProjectName): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResponse]
  }
  
  extension [Self <: DescribeProjectResponse](x: Self) {
    
    inline def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpenDate(value: Date): Self = StObject.set(x, "OpenDate", value.asInstanceOf[js.Any])
    
    inline def setOpenDateUndefined: Self = StObject.set(x, "OpenDate", js.undefined)
    
    inline def setOpenedBy(value: OpenedBy): Self = StObject.set(x, "OpenedBy", value.asInstanceOf[js.Any])
    
    inline def setOpenedByUndefined: Self = StObject.set(x, "OpenedBy", js.undefined)
    
    inline def setRecipeName(value: RecipeName): Self = StObject.set(x, "RecipeName", value.asInstanceOf[js.Any])
    
    inline def setRecipeNameUndefined: Self = StObject.set(x, "RecipeName", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSample(value: Sample): Self = StObject.set(x, "Sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "Sample", js.undefined)
    
    inline def setSessionStatus(value: SessionStatus): Self = StObject.set(x, "SessionStatus", value.asInstanceOf[js.Any])
    
    inline def setSessionStatusUndefined: Self = StObject.set(x, "SessionStatus", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
