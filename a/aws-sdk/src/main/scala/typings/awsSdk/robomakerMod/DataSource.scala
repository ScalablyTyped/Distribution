package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * The location where your files are mounted in the container image. If you've specified the type of the data source as an Archive, you must provide an Amazon S3 object key to your archive. The object key must point to either a .zip or .tar.gz file. If you've specified the type of the data source as a Prefix, you provide the Amazon S3 prefix that points to the files that you are using for your data source. If you've specified the type of the data source as a File, you provide the Amazon S3 path to the file that you're using as your data source.
    */
  var destination: js.UndefOr[Path] = js.undefined
  
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: js.UndefOr[S3KeyOutputs] = js.undefined
  
  /**
    * The data type for the data source that you're using for your container image or simulation job. You can use this field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file. If you don't specify a field, the default value is File.
    */
  var `type`: js.UndefOr[DataSourceType] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setDestination(value: Path): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Keys(value: S3KeyOutputs): Self = StObject.set(x, "s3Keys", value.asInstanceOf[js.Any])
    
    inline def setS3KeysUndefined: Self = StObject.set(x, "s3Keys", js.undefined)
    
    inline def setS3KeysVarargs(value: S3KeyOutput*): Self = StObject.set(x, "s3Keys", js.Array(value*))
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
