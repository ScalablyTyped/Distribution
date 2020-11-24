package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: js.UndefOr[S3KeyOutputs] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    
    @scala.inline
    def setS3KeysVarargs(value: S3KeyOutput*): Self = this.set("s3Keys", js.Array(value :_*))
    
    @scala.inline
    def setS3Keys(value: S3KeyOutputs): Self = this.set("s3Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Keys: Self = this.set("s3Keys", js.undefined)
  }
}
