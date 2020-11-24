package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentsMetadataConfiguration extends js.Object {
  
  /**
    * A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple metadata files. Use S3Prefix to include only the desired metadata files.
    */
  var S3Prefix: js.UndefOr[S3ObjectKey] = js.native
}
object DocumentsMetadataConfiguration {
  
  @scala.inline
  def apply(): DocumentsMetadataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentsMetadataConfiguration]
  }
  
  @scala.inline
  implicit class DocumentsMetadataConfigurationOps[Self <: DocumentsMetadataConfiguration] (val x: Self) extends AnyVal {
    
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
    def setS3Prefix(value: S3ObjectKey): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Prefix: Self = this.set("S3Prefix", js.undefined)
  }
}
