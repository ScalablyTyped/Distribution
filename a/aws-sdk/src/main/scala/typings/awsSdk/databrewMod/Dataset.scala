package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  /**
    * The ID of the AWS account that owns the dataset.
    */
  var AccountId: js.UndefOr[typings.awsSdk.databrewMod.AccountId] = js.undefined
  
  /**
    * The date and time that the dataset was created.
    */
  var CreateDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (the user name) of the user who created the dataset.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * Options that define how DataBrew interprets the data in the dataset.
    */
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.undefined
  
  /**
    * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon S3.
    */
  var Input: typings.awsSdk.databrewMod.Input
  
  /**
    * The identifier (the user name) of the user who last modified the dataset.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The last modification date and time of the dataset.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The unique name of the dataset.
    */
  var Name: DatasetName
  
  /**
    * The unique Amazon Resource Name (ARN) for the dataset.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog.
    */
  var Source: js.UndefOr[typings.awsSdk.databrewMod.Source] = js.undefined
  
  /**
    * Metadata tags that have been applied to the dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Dataset {
  
  inline def apply(Input: Input, Name: DatasetName): Dataset = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
  
  extension [Self <: Dataset](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
