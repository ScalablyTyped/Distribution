package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceConfig extends StObject {
  
  /**
    * The name of the data source.
    */
  var name: Name = js.native
  
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: S3Bucket = js.native
  
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: S3Keys = js.native
}
object DataSourceConfig {
  
  @scala.inline
  def apply(name: Name, s3Bucket: S3Bucket, s3Keys: S3Keys): DataSourceConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Keys = s3Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfig]
  }
  
  @scala.inline
  implicit class DataSourceConfigMutableBuilder[Self <: DataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Keys(value: S3Keys): Self = StObject.set(x, "s3Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeysVarargs(value: S3Key*): Self = StObject.set(x, "s3Keys", js.Array(value :_*))
  }
}
