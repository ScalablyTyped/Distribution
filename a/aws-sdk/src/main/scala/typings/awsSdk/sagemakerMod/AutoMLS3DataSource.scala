package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLS3DataSource extends js.Object {
  
  /**
    * The data type.
    */
  var S3DataType: AutoMLS3DataType = js.native
  
  /**
    * The URL to the Amazon S3 data source.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri = js.native
}
object AutoMLS3DataSource {
  
  @scala.inline
  def apply(S3DataType: AutoMLS3DataType, S3Uri: S3Uri): AutoMLS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLS3DataSource]
  }
  
  @scala.inline
  implicit class AutoMLS3DataSourceOps[Self <: AutoMLS3DataSource] (val x: Self) extends AnyVal {
    
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
    def setS3DataType(value: AutoMLS3DataType): Self = this.set("S3DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
  }
}
