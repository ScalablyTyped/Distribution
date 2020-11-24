package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectResponse extends js.Object {
  
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
  implicit class DescribeProjectResponseOps[Self <: DescribeProjectResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: ProjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetName: Self = this.set("DatasetName", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setOpenDate(value: Date): Self = this.set("OpenDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDate: Self = this.set("OpenDate", js.undefined)
    
    @scala.inline
    def setOpenedBy(value: OpenedBy): Self = this.set("OpenedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenedBy: Self = this.set("OpenedBy", js.undefined)
    
    @scala.inline
    def setRecipeName(value: RecipeName): Self = this.set("RecipeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeName: Self = this.set("RecipeName", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setSample(value: Sample): Self = this.set("Sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSample: Self = this.set("Sample", js.undefined)
    
    @scala.inline
    def setSessionStatus(value: SessionStatus): Self = this.set("SessionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionStatus: Self = this.set("SessionStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
