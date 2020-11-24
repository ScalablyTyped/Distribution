package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDataSource extends js.Object {
  
  /**
    * The data format of the import job's data source.
    */
  var DataFormat: typings.awsSdk.sesv2Mod.DataFormat = js.native
  
  /**
    * An Amazon S3 URL in the format s3://&lt;bucket_name&gt;/&lt;object&gt;.
    */
  var S3Url: typings.awsSdk.sesv2Mod.S3Url = js.native
}
object ImportDataSource {
  
  @scala.inline
  def apply(DataFormat: DataFormat, S3Url: S3Url): ImportDataSource = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDataSource]
  }
  
  @scala.inline
  implicit class ImportDataSourceOps[Self <: ImportDataSource] (val x: Self) extends AnyVal {
    
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
    def setDataFormat(value: DataFormat): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Url(value: S3Url): Self = this.set("S3Url", value.asInstanceOf[js.Any])
  }
}
