package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * The file system that is associated with a channel.
    */
  var FileSystemDataSource: js.UndefOr[typings.awsSdk.sagemakerMod.FileSystemDataSource] = js.undefined
  
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: js.UndefOr[typings.awsSdk.sagemakerMod.S3DataSource] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setFileSystemDataSource(value: FileSystemDataSource): Self = StObject.set(x, "FileSystemDataSource", value.asInstanceOf[js.Any])
    
    inline def setFileSystemDataSourceUndefined: Self = StObject.set(x, "FileSystemDataSource", js.undefined)
    
    inline def setS3DataSource(value: S3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
    
    inline def setS3DataSourceUndefined: Self = StObject.set(x, "S3DataSource", js.undefined)
  }
}
