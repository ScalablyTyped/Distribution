package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Source extends StObject {
  
  /**
    * The amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn
  
  /**
    * A physical table type for as S3 data source.
    */
  var InputColumns: InputColumnList
  
  /**
    * Information about the format for the S3 source file or files.
    */
  var UploadSettings: js.UndefOr[typings.awsSdk.quicksightMod.UploadSettings] = js.undefined
}
object S3Source {
  
  @scala.inline
  def apply(DataSourceArn: Arn, InputColumns: InputColumnList): S3Source = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
  
  @scala.inline
  implicit class S3SourceMutableBuilder[Self <: S3Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputColumns(value: InputColumnList): Self = StObject.set(x, "InputColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputColumnsVarargs(value: InputColumn*): Self = StObject.set(x, "InputColumns", js.Array(value :_*))
    
    @scala.inline
    def setUploadSettings(value: UploadSettings): Self = StObject.set(x, "UploadSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSettingsUndefined: Self = StObject.set(x, "UploadSettings", js.undefined)
  }
}
