package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
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
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileSystemDataSource(value: FileSystemDataSource): Self = this.set("FileSystemDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemDataSource: Self = this.set("FileSystemDataSource", js.undefined)
    
    @scala.inline
    def setS3DataSource(value: S3DataSource): Self = this.set("S3DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DataSource: Self = this.set("S3DataSource", js.undefined)
  }
}
