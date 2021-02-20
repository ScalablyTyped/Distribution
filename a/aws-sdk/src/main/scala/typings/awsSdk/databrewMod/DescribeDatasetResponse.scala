package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetResponse extends StObject {
  
  /**
    * The date and time that the dataset was created.
    */
  var CreateDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (user name) of the user who created the dataset.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.native
  
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.native
  
  var Input: typings.awsSdk.databrewMod.Input = js.native
  
  /**
    * The identifier (user name) of the user who last modified the dataset.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The date and time that the dataset was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * The name of the dataset.
    */
  var Name: DatasetName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The location of the data for this dataset, Amazon S3 or the AWS Glue Data Catalog.
    */
  var Source: js.UndefOr[typings.awsSdk.databrewMod.Source] = js.native
  
  /**
    * Metadata tags associated with this dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object DescribeDatasetResponse {
  
  @scala.inline
  def apply(Input: Input, Name: DatasetName): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  @scala.inline
  implicit class DescribeDatasetResponseMutableBuilder[Self <: DescribeDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
