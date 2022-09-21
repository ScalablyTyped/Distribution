package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetResponse extends StObject {
  
  /**
    * The date and time that the dataset was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier (user name) of the user who created the dataset.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The file format of a dataset that is created from an Amazon S3 file or folder.
    */
  var Format: js.UndefOr[InputFormat] = js.undefined
  
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.undefined
  
  var Input: typings.awsSdk.databrewMod.Input
  
  /**
    * The identifier (user name) of the user who last modified the dataset.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The date and time that the dataset was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var Name: DatasetName
  
  /**
    * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
    */
  var PathOptions: js.UndefOr[typings.awsSdk.databrewMod.PathOptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
    */
  var Source: js.UndefOr[typings.awsSdk.databrewMod.Source] = js.undefined
  
  /**
    * Metadata tags associated with this dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeDatasetResponse {
  
  inline def apply(Input: Input, Name: DatasetName): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  extension [Self <: DescribeDatasetResponse](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setFormat(value: InputFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "PathOptions", value.asInstanceOf[js.Any])
    
    inline def setPathOptionsUndefined: Self = StObject.set(x, "PathOptions", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
