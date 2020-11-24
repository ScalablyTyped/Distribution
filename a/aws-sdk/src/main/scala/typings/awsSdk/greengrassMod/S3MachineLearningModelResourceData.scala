package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3MachineLearningModelResourceData extends js.Object {
  
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.native
  
  /**
    * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
    */
  var S3Uri: js.UndefOr[string] = js.native
}
object S3MachineLearningModelResourceData {
  
  @scala.inline
  def apply(): S3MachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3MachineLearningModelResourceData]
  }
  
  @scala.inline
  implicit class S3MachineLearningModelResourceDataOps[Self <: S3MachineLearningModelResourceData] (val x: Self) extends AnyVal {
    
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
    def setDestinationPath(value: string): Self = this.set("DestinationPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPath: Self = this.set("DestinationPath", js.undefined)
    
    @scala.inline
    def setOwnerSetting(value: ResourceDownloadOwnerSetting): Self = this.set("OwnerSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerSetting: Self = this.set("OwnerSetting", js.undefined)
    
    @scala.inline
    def setS3Uri(value: string): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Uri: Self = this.set("S3Uri", js.undefined)
  }
}
