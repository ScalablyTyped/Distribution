package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
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
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Keys(value: S3KeyOutputs): Self = StObject.set(x, "s3Keys", value.asInstanceOf[js.Any])
    
    inline def setS3KeysUndefined: Self = StObject.set(x, "s3Keys", js.undefined)
    
    inline def setS3KeysVarargs(value: S3KeyOutput*): Self = StObject.set(x, "s3Keys", js.Array(value :_*))
  }
}
