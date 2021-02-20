package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestUploadCredentialsOutput extends StObject {
  
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
  implicit class RequestUploadCredentialsOutputMutableBuilder[Self <: RequestUploadCredentialsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationUndefined: Self = StObject.set(x, "StorageLocation", js.undefined)
    
    @scala.inline
    def setUploadCredentials(value: AwsCredentials): Self = StObject.set(x, "UploadCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadCredentialsUndefined: Self = StObject.set(x, "UploadCredentials", js.undefined)
  }
}
