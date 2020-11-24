package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends js.Object {
  
  /**
    * The ID of the AWS account that owns the dataset.
    */
  var AccountId: js.UndefOr[typings.awsSdk.databrewMod.AccountId] = js.native
  
  /**
    * The date and time that the dataset was created.
    */
  var CreateDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (the user name) of the user who created the dataset.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * Options that define how DataBrew interprets the data in the dataset.
    */
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.native
  
  /**
    * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon S3.
    */
  var Input: typings.awsSdk.databrewMod.Input = js.native
  
  /**
    * The identifier (the user name) of the user who last modified the dataset.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The last modification date and time of the dataset.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * The unique name of the dataset.
    */
  var Name: DatasetName = js.native
  
  /**
    * The unique Amazon Resource Name (ARN) for the dataset.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog.
    */
  var Source: js.UndefOr[typings.awsSdk.databrewMod.Source] = js.native
  
  /**
    * Metadata tags that have been applied to the dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object Dataset {
  
  @scala.inline
  def apply(Input: Input, Name: DatasetName): Dataset = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
  
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
    
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
    def setInput(value: Input): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DatasetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setFormatOptions(value: FormatOptions): Self = this.set("FormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOptions: Self = this.set("FormatOptions", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
