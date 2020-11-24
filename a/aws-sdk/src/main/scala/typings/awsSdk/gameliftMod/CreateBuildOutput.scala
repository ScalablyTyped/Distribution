package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBuildOutput extends js.Object {
  
  /**
    * The newly created build resource, including a unique build IDs and status. 
    */
  var Build: js.UndefOr[typings.awsSdk.gameliftMod.Build] = js.native
  
  /**
    * Amazon S3 location for your game build file, including bucket name and key.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  
  /**
    * This element is returned only when the operation is called without a storage location. It contains credentials to use when you are uploading a build file to an S3 bucket that is owned by Amazon GameLift. Credentials have a limited life span. To refresh these credentials, call RequestUploadCredentials. 
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.native
}
object CreateBuildOutput {
  
  @scala.inline
  def apply(): CreateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuildOutput]
  }
  
  @scala.inline
  implicit class CreateBuildOutputOps[Self <: CreateBuildOutput] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: Build): Self = this.set("Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("Build", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = this.set("StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocation: Self = this.set("StorageLocation", js.undefined)
    
    @scala.inline
    def setUploadCredentials(value: AwsCredentials): Self = this.set("UploadCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadCredentials: Self = this.set("UploadCredentials", js.undefined)
  }
}
