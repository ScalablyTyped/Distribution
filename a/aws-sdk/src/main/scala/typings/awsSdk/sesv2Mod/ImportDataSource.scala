package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDataSource extends StObject {
  
  /**
    * The data format of the import job's data source.
    */
  var DataFormat: typings.awsSdk.sesv2Mod.DataFormat
  
  /**
    * An Amazon S3 URL in the format s3://&lt;bucket_name&gt;/&lt;object&gt;.
    */
  var S3Url: typings.awsSdk.sesv2Mod.S3Url
}
object ImportDataSource {
  
  inline def apply(DataFormat: DataFormat, S3Url: S3Url): ImportDataSource = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDataSource]
  }
  
  extension [Self <: ImportDataSource](x: Self) {
    
    inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setS3Url(value: S3Url): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
  }
}
