package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /**
    * The file system that is associated with a channel.
    */
  var FileSystemDataSource: js.UndefOr[typings.awsSdk.sagemakerMod.FileSystemDataSource] = js.native
  
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: js.UndefOr[typings.awsSdk.sagemakerMod.S3DataSource] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemDataSource(value: FileSystemDataSource): Self = StObject.set(x, "FileSystemDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemDataSourceUndefined: Self = StObject.set(x, "FileSystemDataSource", js.undefined)
    
    @scala.inline
    def setS3DataSource(value: S3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DataSourceUndefined: Self = StObject.set(x, "S3DataSource", js.undefined)
  }
}
