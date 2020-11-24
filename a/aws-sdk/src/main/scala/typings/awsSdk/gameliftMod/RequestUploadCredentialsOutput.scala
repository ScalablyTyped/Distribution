package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestUploadCredentialsOutput extends js.Object {
  
  /**
    * Amazon S3 path and key, identifying where the game build files are stored.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  
  /**
    * AWS credentials required when uploading a game build to the storage location. These credentials have a limited lifespan and are valid only for the build they were issued for.
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.native
}
object RequestUploadCredentialsOutput {
  
  @scala.inline
  def apply(): RequestUploadCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestUploadCredentialsOutput]
  }
  
  @scala.inline
  implicit class RequestUploadCredentialsOutputOps[Self <: RequestUploadCredentialsOutput] (val x: Self) extends AnyVal {
    
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
    def setStorageLocation(value: S3Location): Self = this.set("StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocation: Self = this.set("StorageLocation", js.undefined)
    
    @scala.inline
    def setUploadCredentials(value: AwsCredentials): Self = this.set("UploadCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadCredentials: Self = this.set("UploadCredentials", js.undefined)
  }
}
